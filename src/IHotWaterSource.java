public interface IHotWaterSource {

    int getTemperature();

    void setMinimumTemperature(int i);

    void setMaximumTemperature(int temp);

    int getMaximumTemperature();

    int getMinimumTemperature();

    boolean isBoiling();

    int waterPersentageInSource();

    void poll();

    void turnOn();

    void turnOff();

    boolean isOn();

    void openWaterFlow();

    void closeWaterFlow();

    boolean isWaterFlowing();
}

