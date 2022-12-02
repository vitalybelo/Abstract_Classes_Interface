public class Lamp extends LightDevice {

    public enum Type { INCANDESCENT, FILAMENT, LED, LUMINESCENT }
    public Type type;

    public Lamp (int power) {
        super(power);
        this.type = Type.LED;
    }

    @Override
    public double getEnergyConsumption () {
        return power * brightness;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Type getType() {
        return type;
    }
}
