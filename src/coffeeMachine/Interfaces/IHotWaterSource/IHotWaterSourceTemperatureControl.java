package coffeeMachine.Interfaces.IHotWaterSource;


public interface IHotWaterSourceTemperatureControl {

    int getTemperature();

    void setTemperature(int temp);

    void setMinimumTemperature(int i);

    void setMaximumTemperature(int temp);

    int getMaximumTemperature();

    int getMinimumTemperature();
}
