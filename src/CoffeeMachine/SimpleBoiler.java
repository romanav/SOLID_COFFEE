package CoffeeMachine;

import CoffeeMachine.IHotWaterSource.IHotWaterSource;

public class SimpleBoiler implements IHotWaterSource {


    private boolean isBioling = false;
    private boolean isWaterFlowOpen = false;


    public SimpleBoiler() {
        isBioling = false;
    }

    @Override
    public void startBoiling() {
        isBioling = true;
    }

    @Override
    public void stopBoiling() {

    }

    @Override
    public boolean isBoiling() {
        return isBioling;
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
        isWaterFlowOpen = true;
    }

    @Override
    public void closeWaterFlow() {
        isWaterFlowOpen = false;
    }


    @Override
    public boolean isWaterFlowing() {
        return isWaterFlowOpen;
    }

    @Override
    public void poll() {

    }
}
