package CoffeeMachine.IContainmentVessel;

public interface IContainmentVessel {

    boolean isReady();
    boolean isFull();

    void poll();
}
