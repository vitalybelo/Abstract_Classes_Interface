import java.util.ArrayList;

public class SmartHome {

    private ArrayList<ElectricDevice> devices;

    public SmartHome () {
        devices = new ArrayList<>();
        initLightDevices();
    }

    public void switchOffAllDevices () {
        for (ElectricDevice device : devices)
            if (device.isSwitchOn()) device.switchOff();
    }

    public void switchOffAllLightDevices () {
        for (ElectricDevice device : devices)
            if (device instanceof LightDevice)
                if (device.isSwitchOn()) device.switchOff();
    }

    public double getEnergyConsumption () {
        double sum = 0.0;
        for (ElectricDevice device : devices)
            sum += device.getEnergyConsumption();
        return sum;
    }

    private void initLightDevices () {

        devices.add(new Lamp(100));
        devices.add(new Lamp(60));
        devices.add(new Lamp(40));
        devices.add(new Chandelier(180,3));
        devices.add(new Chandelier(240,4));
        devices.add(new Chandelier(500,5));
        devices.add(new Chandelier(120,3));

    }
}
