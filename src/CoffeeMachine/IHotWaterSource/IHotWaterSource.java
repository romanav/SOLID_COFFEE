package CoffeeMachine.IHotWaterSource;

public interface IHotWaterSource extends IHotWaterSourceTemperatureControl, IWaterFlowControl {

    void poll();
}
