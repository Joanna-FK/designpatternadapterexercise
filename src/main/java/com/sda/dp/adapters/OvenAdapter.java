package com.sda.dp.adapters;

import com.sda.dp.KitchenDevice;
import com.sda.dp.devices.Oven;

public class OvenAdapter implements KitchenDevice {
    private Oven oven;
    public Oven ovenAdapter;
    public OvenAdapter(Oven ovenAdapter){
        this.ovenAdapter= ovenAdapter;
    }

    public void turnDeviceOn() {oven.turnOn();

    }

    public void turnDeviceOff() {oven.turnOff();

    }
}
