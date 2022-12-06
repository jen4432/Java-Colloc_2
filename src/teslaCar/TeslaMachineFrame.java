package teslaCar;

import abstractFactory.MachineFrame;

public class TeslaMachineFrame implements MachineFrame {

    public boolean broken;

    public boolean passengerCar;

    public TeslaMachineFrame(boolean passengerCar,boolean broken){
        this.broken = broken;
        this.passengerCar = passengerCar;
    }


    @Override
    public boolean isBroken() {
        return broken;
    }

    @Override
    public String showStats() {
        return "[TeslaMachineFrame : passengerCar = " + passengerCar + "]";
    }
}
