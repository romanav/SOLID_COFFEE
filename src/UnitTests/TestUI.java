package UnitTests;

import CoffeeMachine.Interfaces.IHotWaterSource.IHotWaterSource;
import CoffeeMachine.Interfaces.ISwitchable;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestUI {

    IHotWaterSource boiler;
    ISwitchable vessel;
    SimpleUIMoc ui;

    @Before
    public void init() {
        boiler = new SimpleBoilerMoc();
        vessel = new ContainmentVesselMoc(boiler);
        ui = new SimpleUIMoc();
        ui.addComponent(boiler);
        ui.addComponent(boiler);
    }

    @Test
    public void testGetComponents() {
        assertEquals(ui.getComponents().size(), 2);
    }

    @Test
    public void startStopBoiling() {
        ui.start();
        assertEquals(boiler.isOn(), true);
        assertEquals(boiler.isOn(), true);

        ui.stop();
        assertEquals(vessel.isOn(), false);
        assertEquals(vessel.isOn(), false);
    }
}
