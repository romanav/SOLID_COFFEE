package coffeeMachine.Interfaces.IHotWaterSource;


public interface IWaterFlowControl {
    void openWaterFlow();

    void closeWaterFlow();

    boolean isWaterFlowing();

    int waterPersentageInSource();
}
