public interface IContainmentVessel {

    boolean isReady();

    boolean isFull();

    void poll();

    void turnOn();

    void turnOff();

    boolean isOn();

}
