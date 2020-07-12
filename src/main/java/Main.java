import com.sda.dp.Kitchen;
import com.sda.dp.KitchenDevice;
import com.sda.dp.adapters.CoffeMachineAdapter;
import com.sda.dp.adapters.FridgeAdapter;
import com.sda.dp.adapters.OvenAdapter;
import com.sda.dp.devices.CoffeMachine;
import com.sda.dp.devices.Fridge;
import com.sda.dp.devices.Oven;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<KitchenDevice> kitchenDevices = new ArrayList<>();
        kitchenDevices.add(new OvenAdapter(new Oven()));
        kitchenDevices.add(new FridgeAdapter(new Fridge()));
        kitchenDevices.add(new CoffeMachineAdapter(new CoffeMachine()));

    }
}
