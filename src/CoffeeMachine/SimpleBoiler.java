package CoffeeMachine;

import CoffeeMachine.IHotWaterSource.IHotWaterSource;

public class SimpleBoiler implements IHotWaterSource {


    private boolean isBioling = false;
    private boolean isWaterFlowOpen = false;
    protected int temperature;
    private int minTemperature = 0;
    private int maxTemperature = 100;


    public SimpleBoiler() {
        isBioling = false;
        temperature = 21;
    }

    @Override
    public void poll() {
        if (temperature >= 90) {
            stopBoiling();
        }
    }


    @Override
    public void startBoiling() {
        isBioling = true;
    }

    @Override
    public void stopBoiling() {
        isBioling = false;
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
    public void setMinimumTemperature(int temp) {
        minTemperature = temp;

    }

    @Override
    public void setMaximumTemperature(int temp) {
        maxTemperature = temp;
    }

    @Override
    public int getMaximumTemperature() {
        return maxTemperature;
    }

    @Override
    public int getMinimumTemperature() {
        return minTemperature;
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


}
