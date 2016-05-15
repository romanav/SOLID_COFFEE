package UnitTests;


import CoffeeMachine.BoilerBase;


public class SimpleBoilerMoc extends BoilerBase {


    public void setTemperature(int temperature) {
        this.temperature = temperature;
        this.poll();
    }


}
