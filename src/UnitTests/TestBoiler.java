package UnitTests;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestBoiler {

    private SimpleBoilerMoc boiler = new SimpleBoilerMoc();


    @Before
    public void init() {
        assertEquals(boiler.isBoiling(), false);
    }

    @Test
    public void boilingStatus() {

        boiler.startBoiling();
        assertEquals(boiler.isBoiling(), true);

        boiler.stopBoiling();
        assertEquals(boiler.isBoiling(), false);

        boiler.setTemperature(91);
        assertEquals(boiler.isBoiling(), false);

    }

    @Test
    public void getTemperatures(){
        assertEquals(boiler.getMinimumTemperature(), 0);
        assertEquals(boiler.getMaximumTemperature(), 100);

        boiler.setMinimumTemperature(80);
        boiler.setMaximumTemperature(90);

        assertEquals(boiler.getMinimumTemperature(), 80);
        assertEquals(boiler.getMaximumTemperature(), 90);
    }


}
