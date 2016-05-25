package unitTests;


import coffeeMachine.BoilerBase;


public class SimpleBoilerMoc extends BoilerBase {

    @Override
    public void setTemperature(int temp) {
        super.setTemperature(temp);
        poll();
    }
}
