package teslaCar;

import abstractFactory.Car;
import abstractFactory.Engine;
import abstractFactory.MachineFrame;
import abstractFactory.Wheels;

public class TeslaCar implements Car {

    private TeslaEngine teslaEngine;
    private TeslaMachineFrame teslaMachineFrame;
    private TeslaWheels teslaWheels;

    public TeslaCar(TeslaEngine te,TeslaWheels tw,TeslaMachineFrame tmf){
        teslaEngine = te;
        teslaWheels = tw;
        teslaMachineFrame = tmf;
    }

    @Override
    public boolean isBroken() {
        if(teslaEngine.isBroken() || teslaWheels.isBroken() || teslaMachineFrame.isBroken()){
            return true;
        }
        return false;
    }

    @Override
    public Engine getEngine() {
        return teslaEngine;
    }

    @Override
    public Wheels getWheels() {
        return teslaWheels;
    }

    @Override
    public MachineFrame getMachineFrame() {
        return teslaMachineFrame;
    }
}
