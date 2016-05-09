package CoffeeMachine.IHotWaterSource;


public interface IHotWaterSourceTemperatureControl {
    void startBoiling();

    void stopBoiling();

    boolean isBoiling();

    int getTemperature();

    void setMinimumTemperature(int i);

    void setMaximumTemperature(int temp);

    int getMaximumTemperature();

    int getMinimumTemperature();
}
