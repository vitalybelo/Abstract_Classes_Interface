public interface ElectricDevice {

    double getEnergyConsumption();

    boolean isSwitchOn ();
    void switchOn ();
    void switchOff ();

    default void toggle () {
        if (isSwitchOn()) {
            switchOff();
        } else {
            switchOn();
        }

    }

}
