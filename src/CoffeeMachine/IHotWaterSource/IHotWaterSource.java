package CoffeeMachine.IHotWaterSource;

public interface IHotWaterSource extends IHotWaterSourceTemperatureControl, IHotWaterSourceFlowControl {

    void poll();
}
