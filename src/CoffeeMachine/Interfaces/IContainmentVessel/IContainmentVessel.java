package CoffeeMachine.Interfaces.IContainmentVessel;

import CoffeeMachine.Interfaces.IPollable;

public interface IContainmentVessel extends IPollable {

    boolean isReady();

    boolean isFull();

}
