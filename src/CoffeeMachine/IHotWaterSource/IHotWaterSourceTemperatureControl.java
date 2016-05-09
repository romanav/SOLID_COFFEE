package CoffeeMachine.IHotWaterSource;


public interface IHotWaterSourceTemperatureControl {
    void turnOn();

    void turnOff();

    boolean isBoiling();

    int getTemperature();

    void setMinimumTemperature(int i);

    void setMaximumTemperature(int temp);

    int getMaximumTemperature();

    int getMinimumTemperature();
}
