package unitTests;


import coffeeMachine.BoilerBase;


public class SimpleBoilerMoc extends BoilerBase {


    public void setTemperature(int temperature) {
        this.temperature = temperature;
        this.poll();
    }


}
