package TeslaCarTest;

import static org.junit.Assert.*;
import teslaCar.TeslaWheels;

public class TeslaWheelsTest {

    @org.junit.Test
    public void showStatsTest(){

        TeslaWheels wheels = new TeslaWheels("Winter",false);

        String expected = "[Wheels: season = Winter]";

        assertEquals(expected,wheels.showStats());

    }

    @org.junit.Test
    public void fixWheelsTest(){

        TeslaWheels wheels = new TeslaWheels("Summer",true);

        assertEquals(true,wheels.isBroken());

        wheels.fixTheWheels();

        assertEquals(false,wheels.isBroken());
    }
}
