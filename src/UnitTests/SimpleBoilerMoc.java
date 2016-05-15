package UnitTests;


import CoffeeMachine.SimpleBoiler;


public class SimpleBoilerMoc extends SimpleBoiler {


    public void setTemperature(int temperature) {
        this.temperature = temperature;
        this.poll();
    }


}
