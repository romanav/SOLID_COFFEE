package CoffeeMachine.Interfaces.IHotWaterSource;


public interface IHotWaterSourceTemperatureControl {


    boolean isBoiling();

    int getTemperature();

    void setMinimumTemperature(int i);

    void setMaximumTemperature(int temp);

    int getMaximumTemperature();

    int getMinimumTemperature();
}