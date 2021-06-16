package org.onosproject.ifwd;

import org.onosproject.net.ConnectPoint;
import org.onosproject.net.DeviceId;
import org.osgi.service.component.ComponentContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.slf4j.Logger;
import org.onosproject.ifwd.api.CounterService;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicLong;

import static org.slf4j.LoggerFactory.getLogger;

@Component(
        immediate = true
)
public class PacketInCounter implements CounterService {
    private final Logger log = getLogger(getClass());

    private static final long INTERVAL = 1;

    ConcurrentMap<ConnectPoint, Counter> connectPointCounters;

    ConcurrentMap<DeviceId, Counter> deviceCounters;

    ConcurrentMap<String, Counter> commonCounters;

    ScheduledExecutorService scheduledExecutorService;

    @Activate
    public void activate(ComponentContext context) {
        log.info("start {}", getClass());

        scheduledExecutorService = new ScheduledThreadPoolExecutor(1);
        connectPointCounters = new ConcurrentHashMap<>();
        deviceCounters = new ConcurrentHashMap<>();
        commonCounters = new ConcurrentHashMap<>();
    }

    @Deactivate
    public void deactivate() {
        scheduledExecutorService.shutdownNow();
        connectPointCounters.clear();
        deviceCounters.clear();
        commonCounters.clear();

        log.info("stop {}", getClass());
    }

    @Override
    public Counter getConnectPointCounter(ConnectPoint cp) {
        Counter ic = connectPointCounters.get(cp);
        if(ic == null) {
            synchronized (this) {
                ic = connectPointCounters.get(cp);
                if(ic == null) {
                    ic = new Counter(cp.toString());
                    connectPointCounters.put(cp, ic);
                    scheduledExecutorService.scheduleAtFixedRate(ic, 1, INTERVAL, TimeUnit.SECONDS);
                }
            }
        }
        return ic;
    }

    @Override
    public Counter getDeviceCounter(DeviceId deviceId) {
        Counter ic = deviceCounters.get(deviceId);
        if(ic == null) {
            synchronized (this) {
                ic = deviceCounters.get(deviceId);
                if(ic == null) {
                    ic = new Counter(deviceId.toString());
                    deviceCounters.put(deviceId, ic);
                    scheduledExecutorService.scheduleAtFixedRate(ic, 1, INTERVAL, TimeUnit.SECONDS);
                }
            }
        }
        return ic;
    }

    @Override
    public Counter getCommonCounter(String name) {
        Counter ic = commonCounters.get(name);
        if(ic == null) {
            synchronized (this) {
                ic = commonCounters.get(name);
                if(ic == null) {
                    ic = new Counter(name);
                    commonCounters.put(name, ic);
                    scheduledExecutorService.scheduleAtFixedRate(ic, 1, INTERVAL, TimeUnit.SECONDS);
                }
            }
        }
        return ic;
    }

    @Override
    public void updateConnectPointCounter(ConnectPoint key) {
        Counter ic = getConnectPointCounter(key);
        ic.update();
    }

    @Override
    public void updateDeviceCounter(DeviceId deviceId) {
        Counter ic = getDeviceCounter(deviceId);
        ic.update();
    }

    @Override
    public void updateCommonCounter(String name) {
        Counter ic = getCommonCounter(name);
        ic.update();
    }


    class Counter implements Runnable, CounterService.Counter {
        String name;
        AtomicLong count;
        long previousCount;
        long timestamp;
        volatile boolean initialized;

        Counter(String name) {
            this.name = name;
            count = new AtomicLong(0);
            previousCount = 0;
            timestamp = 0;
            initialized = false;
        }

        void initialize() {
            log.info("initialize counter {}", name);
            count.set(0);
            previousCount = 0;
            timestamp = System.currentTimeMillis();
            initialized = true;
        }

        @Override
        public void run() {
            if(!initialized) {
                initialize();
                return;
            }
            long _count = count.get();
            long _time = System.currentTimeMillis();
            long delta = _count - previousCount;
            long gap = _time - timestamp;

            double speed = (double)delta / (double)gap;
            if(speed > 0) {
                log.info("counter speed of {}: {} in {}ms ({}/s)",
                        name, delta, gap, String.format("%7.4f", speed * 1000));
            }
            // TODO 这里可以有统计接口

            previousCount = _count;
            timestamp = _time;
        }

        @Override
        public void update() {
            if(!initialized) {
                initialize();
            }
            count.incrementAndGet();
        }
    }
}
