package CoffeeMachine;


import CoffeeMachine.IContainmentVessel.IContainmentVessel;
import CoffeeMachine.IHotWaterSource.IHotWaterSource;
import CoffeeMachine.IUi.IUserInterface;

public class FlowControl implements IFlowControl {


    private IHotWaterSource waterSource;
    private IContainmentVessel vessel;
    private IUserInterface ui;

    public FlowControl(IHotWaterSource waterSource, IContainmentVessel vessel, IUserInterface ui) {
        this.waterSource = waterSource;
        this.vessel = vessel;
        this.ui = ui;
    }


}
