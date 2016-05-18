package unitTests;

import coffeeMachine.ContainmentBase;
import coffeeMachine.Interfaces.IHotWaterSource.IWaterFlowControl;

public class ContainmentVesselMoc extends ContainmentBase {

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
