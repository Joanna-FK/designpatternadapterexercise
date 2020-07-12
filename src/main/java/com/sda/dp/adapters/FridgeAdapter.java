package com.sda.dp.adapters;

import com.sda.dp.KitchenDevice;
import com.sda.dp.devices.Fridge;

public class FridgeAdapter implements KitchenDevice {

    private Fridge fridge;
    public Fridge fridgeAdapter;
    public FridgeAdapter(Fridge fridgeAdapter) {
        this.fridgeAdapter = fridgeAdapter;
    }

    public void turnDeviceOn() { fridge.switchOn();
    }

    public void turnDeviceOff() {fridge.switchOff();

    }
}
