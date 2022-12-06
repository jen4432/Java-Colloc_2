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
        System.out.println("[TeslaMachineFrame : passengerCar = " + passengerCar + "]");
        return "[TeslaMachineFrame : passengerCar = " + passengerCar + "]";
    }

    @Override
    public void fixTheMachineFrame() {
        broken = false;
    }
}
