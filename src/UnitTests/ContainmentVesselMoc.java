package UnitTests;

import CoffeeMachine.ContainmentVessel;
import CoffeeMachine.IHotWaterSource.IWaterFlowControl;

public class ContainmentVesselMoc extends ContainmentVessel {

    public ContainmentVesselMoc(IWaterFlowControl flowControl) {
        super(flowControl);
        poll();
    }


    public void takeOut() {
        this.removeVessel();
        poll();
    }

    public void putIn() {
        this.insertVessel();
        poll();
    }

    public void setFull() {
        this.isFull = true;
        poll();
    }

    public void setEmpty() {
        this.isFull = false;
        poll();
    }
}
