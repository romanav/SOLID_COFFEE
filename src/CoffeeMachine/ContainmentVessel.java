package CoffeeMachine;

import CoffeeMachine.IContainmentVessel.IContainmentVessel;
import CoffeeMachine.IHotWaterSource.IWaterFlowControl;


public class ContainmentVessel implements IContainmentVessel {

    private IWaterFlowControl flowControl;
    public boolean isVesselInPlace = true;

    public ContainmentVessel(IWaterFlowControl flowControl) {
        this.flowControl = flowControl;
    }

    @Override
    public void poll() {
        if (isVesselInPlace)
            insertVessel();
        else
            removeVessel();
    }


    @Override
    public boolean isReady() {
        return this.isVesselInPlace;
    }


    protected void removeVessel() {
        isVesselInPlace = false;
        flowControl.closeWaterFlow();
    }

    protected void insertVessel() {
        isVesselInPlace = true;
        flowControl.openWaterFlow();
    }
}
