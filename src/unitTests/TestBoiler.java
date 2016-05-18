package unitTests;

import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class TestBoiler {

    private SimpleBoilerMoc boiler;


    @Before
    public void init() {
        boiler = new SimpleBoilerMoc();
    }

    @Test()
    public void init_state() {
        assertEquals(boiler.isBoiling(), false);
        assertEquals(boiler.getMinimumTemperature(), 0);
        assertEquals(boiler.getMaximumTemperature(), 100);
        assertEquals(boiler.isOn(), false);
    }

    @Test
    public void testOnOff() {

        boiler.turnOn();
        assertEquals(boiler.isOn(), true);

        boiler.turnOff();
        assertEquals(boiler.isOn(), false);
    }

    @Test
    public void boilingStatus() {
        setLimitTemperatures();

        boiler.turnOn();
        assertEquals(boiler.isBoiling(), true);

        boiler.turnOff();
        assertEquals(boiler.isBoiling(), false);
    }

    @Test
    public void getSetTemperatures() {
        setLimitTemperatures();

        assertEquals(boiler.getMinimumTemperature(), 80);
        assertEquals(boiler.getMaximumTemperature(), 90);
    }

    @Test
    public void startStopBoiler() {
        setLimitTemperatures();
        boiler.turnOn();
        assertTemperatureBoilingStatus(70, true);
        boiler.turnOff();
        assertTemperatureBoilingStatus(70, false);
        boiler.turnOn();
        assertTemperatureBoilingStatus(70, true);
    }

    @Test
    public void stopBoilingOnTemperature() {
        setLimitTemperatures();
        boiler.turnOn();

        assertTemperatureBoilingStatus(70, true);
        assertTemperatureBoilingStatus(80, true);
        assertTemperatureBoilingStatus(91, false);
        assertTemperatureBoilingStatus(85, false);
        assertTemperatureBoilingStatus(70, true);
    }

    private void assertTemperatureBoilingStatus(int temperature, boolean isBoiling) {
        boiler.setTemperature(temperature);
        assertEquals(boiler.isBoiling(), isBoiling);
    }

    private void setLimitTemperatures() {
        boiler.setMinimumTemperature(80);
        boiler.setMaximumTemperature(90);
    }


}
