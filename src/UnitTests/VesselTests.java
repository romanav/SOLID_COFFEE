package UnitTests;

import CoffeeMachine.ContainmentVessel;
import CoffeeMachine.IHotWaterSource.IWaterFlowControl;
import CoffeeMachine.SimpleBoiler;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VesselTests {

    IWaterFlowControl boiler;
    ContainmentVesselMoc vessel;

    @Before
    public void init() {
        this.boiler = new SimpleBoiler();
        this.vessel = new ContainmentVesselMoc(boiler);
    }

    @Test
    public void initialStatus() {
        assertEquals(vessel.isReady(), true);
        assertEquals(boiler.isWaterFlowing(), true);
    }

    @Test
    public void testReadyStatus() {
        vessel.takeOut();
        assertEquals(vessel.isReady(), false);

        vessel.putIn();
        assertEquals(vessel.isReady(), true);
    }

    @Test
    public void testWaterFlowStatus() {
        vessel.takeOut();
        assertEquals(boiler.isWaterFlowing(), false);

        vessel.putIn();
        assertEquals(boiler.isWaterFlowing(), true);
    }

}
