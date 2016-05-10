package CoffeeMachine;

import CoffeeMachine.Interfaces.IHotWaterSource.IHotWaterSource;

public class SimpleBoiler implements IHotWaterSource {


    private boolean isOn = false;
    private boolean isWaterFlowOpen = false;
    protected int temperature;
    private int minTemperature = 0;
    private int maxTemperature = 100;
    private boolean isBoiling = false;


    public SimpleBoiler() {
        isOn = false;
        temperature = 21;
    }

    @Override
    public void poll() {
        setBoilingState();
    }

    @Override
    public void turnOn() {
        isOn = true;
        setBoilingState();
    }

    @Override
    public void turnOff() {
        isOn = false;
        setBoilingState();
    }

    @Override
    public boolean isOn() {
        return isOn;
    }

    @Override
    public boolean isBoiling() {
        return isBoiling;
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


    private void stopBoiling() {
        isBoiling = false;
    }

    private void startBoiling() {
        isBoiling = true;
    }

    private void setBoilingState() {
        if (isOn) {
            if (temperature > maxTemperature) {
                stopBoiling();
            }

            if (temperature < minTemperature) {
                startBoiling();
            }
        } else
            stopBoiling();
    }
}
