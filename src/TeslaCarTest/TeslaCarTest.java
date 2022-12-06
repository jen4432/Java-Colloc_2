package TeslaCarTest;
import org.junit.*;
import static org.junit.Assert.*;

import teslaCar.TeslaCar;
import teslaCar.TeslaEngine;
import teslaCar.TeslaMachineFrame;
import teslaCar.TeslaWheels;

public class TeslaCarTest {

    @org.junit.Test
    public void isBrokenTest() throws Exception{
        TeslaEngine engine = new TeslaEngine(1000,true);
        TeslaMachineFrame machineFrame = new TeslaMachineFrame(true,false);
        TeslaWheels wheels = new TeslaWheels("Winter",false);

        TeslaCar car = new TeslaCar(engine,wheels,machineFrame);


        boolean expected = true;

        assertEquals(expected,car.isBroken());
        engine.fixTheEngine();
        assertEquals(false,car.isBroken());

    }

    @org.junit.Test
    public void fixTheCarTest(){

        TeslaEngine engine = new TeslaEngine(1000,true);
        TeslaMachineFrame machineFrame = new TeslaMachineFrame(true,false);
        TeslaWheels wheels = new TeslaWheels("Winter",false);

        TeslaCar car = new TeslaCar(engine,wheels,machineFrame);

        assertEquals(true,car.isBroken());

        car.fixTheCar();

        assertEquals(false,car.isBroken());

    }


}
