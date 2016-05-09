package CoffeeMachine.IHotWaterSource;


public interface IHotWaterSourceTemperatureControl {
    void startBoiling();

    void stopBoiling();

    boolean isBoiling();

    int getTemperature();
}
