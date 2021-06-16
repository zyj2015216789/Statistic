package org.onosproject.ifwd.api;

import org.onosproject.net.ConnectPoint;
import org.onosproject.net.DeviceId;

public interface CounterService {

    Counter getConnectPointCounter(ConnectPoint cp);
    Counter getDeviceCounter(DeviceId deviceId);
    Counter getCommonCounter(String name);

    void updateConnectPointCounter(ConnectPoint key);
    void updateDeviceCounter(DeviceId deviceId);
    void updateCommonCounter(String name);

    public interface Counter {
        void update();
    }
}
