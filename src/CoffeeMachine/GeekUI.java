package CoffeeMachine;


import CoffeeMachine.IHotWaterSource.IHotWaterSource;
import CoffeeMachine.IHotWaterSource.IHotWaterSourceTemperatureControl;
import CoffeeMachine.IUi.IUserInterface;

public class GeekUI implements IUserInterface {

    private IHotWaterSourceTemperatureControl waterSource;

    public GeekUI(IHotWaterSourceTemperatureControl waterSource) {


    }

    @Override
    public void poll() {
    }

    public void turnOn() {


    }

}
