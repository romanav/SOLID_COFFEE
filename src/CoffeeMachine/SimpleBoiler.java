package CoffeeMachine;

import CoffeeMachine.IHotWaterSource.IHotWaterSource;

public class SimpleBoiler implements IHotWaterSource {



    private boolean isBiolingStatus;

    public SimpleBoiler(){
        isBiolingStatus = false;
    }

    @Override
    public void startBoiling() {
        isBiolingStatus = true;

    }

    @Override
    public void stopBoiling() {

    }

    @Override
    public boolean isBoiling() {
        return isBiolingStatus;
    }

    @Override
    public int getTemperature() {
        return 0;
    }

    @Override
    public int waterPersentageInSource() {
        return 0;
    }


    @Override
    public void openWaterFlow() {

    }

    @Override
    public void closeWaterFlow() {

    }


    @Override
    public boolean isWaterFlowing() {
        return false;
    }

    @Override
    public void poll() {

    }
}
