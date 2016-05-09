package CoffeeMachine.IHotWaterSource;


public interface IHotWaterSourceFlowControl {
    void openWaterFlow();

    void closeWaterFlow();

    boolean isWaterFlowing();

    int waterPersentageInSource();
}
