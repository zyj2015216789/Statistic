/*
 * Copyright 2017-present Open Networking Foundation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.onosproject.ifwd;


import org.apache.karaf.shell.api.action.Command;
import org.apache.karaf.shell.api.action.Completion;
import org.apache.karaf.shell.api.action.lifecycle.Service;
import org.onosproject.cli.AbstractShellCommand;
import org.apache.karaf.shell.api.action.Argument;
import org.onlab.packet.MacAddress;
/**
 * Sample reactive forwarding application.
 */

@Service
@Command(scope = "onos", name = "reac",
        description = "List all the metrics of reactive fwd app based on mac address")
public class ReactiveForwardingCommand extends AbstractShellCommand {
    @Argument(index = 0, name = "mac", description = "One Mac Address",
            required = false, multiValued = false)
    @Completion(MacAddressCompleter.class)
    String mac = null;
    @Override
    protected void doExecute() {
        ReactiveForwarding reactiveForwardingService = AbstractShellCommand.get(ReactiveForwarding.class);
        MacAddress macAddress = null;
        if (mac != null) {
            macAddress = MacAddress.valueOf(mac);
        }
        reactiveForwardingService.printMetric(macAddress);
    }
}
public class QpsRateLimiter {

    private long lastTime;

    private long interval;

    private AtomicInteger remaind;

    private int rate;

    public QpsRateLimiter(int rate, long interval, TimeUnit unit) {
        this.rate = rate;
        this.interval = unit.toMillis(interval);
        this.lastTime = System.currentTimeMillis();
        this.remaind = new AtomicInteger(rate);
    }

    public boolean allowable() {
        long now = System.currentTimeMillis();
        if (now > lastTime + interval) {
            remaind.set(rate);
            lastTime = now;
        }

        int value = remaind.get();
        boolean flag = false;
        while (value > 0 && !flag) {
            flag = remaind.compareAndSet(value, value - 1);
            value = remaind.get();
        }

        return flag;
    }

}
