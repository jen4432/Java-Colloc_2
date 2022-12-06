package TeslaCarTest;

import org.junit.Test;
import teslaCar.TeslaEngine;

import static org.junit.Assert.*;

public class TeslaEngineTest {

    @org.junit.Test
    public void showStatsTest(){

        TeslaEngine engine = new TeslaEngine(1000,false);

        String expected = "[ TeslaEngine : Power = 1000]";

        assertEquals(expected,engine.showStats());
    }

    @org.junit.Test
    public void fixTheEngine(){

        TeslaEngine engine = new TeslaEngine(1000,true);

        assertEquals(true,engine.isBroken());

        engine.fixTheEngine();

        assertEquals(false,engine.isBroken());
    }
}
