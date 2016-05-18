package coffeeMachine.Interfaces.IContainmentVessel;

import coffeeMachine.Interfaces.IPollable;
import coffeeMachine.Interfaces.ISwitchable;

public interface IContainmentVessel extends IPollable, ISwitchable {

    boolean isReady();

    boolean isFull();

}
