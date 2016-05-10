package UnitTests;

import CoffeeMachine.Interfaces.ISwitchable;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestUI {

    ISwitchable boiler;
    SimpleUIMoc ui;

    @Before
    public void init() {
        boiler = new SimpleBoilerMoc();
        ui = new SimpleUIMoc();
        ui.addComponent(boiler);
    }

    @Test
    public void testGetComponents() {
        assertEquals(ui.getComponents().size(), 1);
    }

    @Test
    public void startStopBoiling() {
        ui.start();
        assertEquals(boiler.isOn(), true);

        ui.stop();
        assertEquals(boiler.isOn(), false);
    }
}
