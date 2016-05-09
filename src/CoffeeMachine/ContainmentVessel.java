package CoffeeMachine;

import CoffeeMachine.IContainmentVessel.IContainmentVessel;
import CoffeeMachine.IHotWaterSource.IWaterFlowControl;


public class ContainmentVessel implements IContainmentVessel {

    private IWaterFlowControl flowControl;
    public boolean isVesselInPlace;
    public boolean isFull;

    public ContainmentVessel(IWaterFlowControl flowControl) {
        this.flowControl = flowControl;
        isVesselInPlace = true;
        isFull = false;
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
}
