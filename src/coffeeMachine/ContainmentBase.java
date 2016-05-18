package coffeeMachine;

import coffeeMachine.Interfaces.IContainmentVessel.IContainmentVessel;
import coffeeMachine.Interfaces.IHotWaterSource.IWaterFlowControl;


public class ContainmentBase implements IContainmentVessel {

    private IWaterFlowControl flowControl;
    public boolean isVesselInPlace;
    public boolean isFull;
    public boolean isOnFlag;

    public ContainmentBase(IWaterFlowControl flowControl) {
        this.flowControl = flowControl;
        isVesselInPlace = true;
        isFull = false;
        isOnFlag = false;
    }

    @Override
    public void poll() {

        if (isFull()) {
            flowControl.closeWaterFlow();
            return;
        }

        if (isVesselInPlace) {
            insertVessel();
            flowControl.openWaterFlow();
        } else {
            removeVessel();
            flowControl.closeWaterFlow();
        }


    }


    @Override
    public boolean isReady() {
        return this.isVesselInPlace;
    }

    @Override
    public boolean isFull() {
        return isFull;
    }


    protected void removeVessel() {
        isVesselInPlace = false;
    }

    protected void insertVessel() {
        isVesselInPlace = true;

    }

    @Override
    public void turnOn() {
        isOnFlag = true;
    }

    @Override
    public void turnOff() {
        isOnFlag = false;
    }

    @Override
    public boolean isOn() {
        return isOnFlag;
    }
}
