package TeslaCarTest;

import teslaCar.TeslaMachineFrame;

import static org.junit.Assert.*;

public class TeslaMachineFrameTest {

    @org.junit.Test
    public void showStatsTest(){

        TeslaMachineFrame machineFrame = new TeslaMachineFrame(true,false);

        String expected = "[TeslaMachineFrame : passengerCar = true]";

        assertEquals(expected,machineFrame.showStats());
    }

    @org.junit.Test
    public void fixTheMachineFrameTest(){

        TeslaMachineFrame machineFrame = new TeslaMachineFrame(true,true);

        assertEquals(true,machineFrame.isBroken());

        machineFrame.fixTheMachineFrame();

        assertEquals(false,machineFrame.isBroken());
    }
}
