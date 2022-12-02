public abstract class LightDevice implements ElectricDevice, Comparable {

    public static final double MAX_BRIGHTNESS = 1.0;
    public static final double MIN_BRIGHTNESS = 0.0;

    protected final int power;
    protected double brightness;

    public LightDevice(int power) {
        this.power = power;
    }
    public double getBrightness() {
        return brightness;
    }

    @Override
    public int compareTo(Object o) {
        LightDevice device = (LightDevice) o;
        return Integer.compare(power, device.power);
    }

    @Override
    public String toString() {
        return getClass().getName() + " power = " + power;
    }

    @Override
    public boolean isSwitchOn() {
        return brightness > 0;
    }

    @Override
    public void switchOn() {
        setBrightness(MAX_BRIGHTNESS);
    }

    @Override
    public void switchOff() {
        setBrightness(MIN_BRIGHTNESS);
    }

    public void setBrightness(double brightness) {
        if (brightness < MIN_BRIGHTNESS) {
            this.brightness = MIN_BRIGHTNESS;
        } else this.brightness = Math.min(brightness, MAX_BRIGHTNESS);
    }

    public void changeBrightness (double rate) {
        double change = brightness * (1.0 + rate);
        setBrightness(change);
    }

}
