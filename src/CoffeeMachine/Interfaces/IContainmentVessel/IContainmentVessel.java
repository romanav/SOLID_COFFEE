package CoffeeMachine.Interfaces.IContainmentVessel;

import CoffeeMachine.Interfaces.IPollable;
import CoffeeMachine.Interfaces.ISwitchable;

public interface IContainmentVessel extends IPollable, ISwitchable {

    boolean isReady();

    boolean isFull();

}
