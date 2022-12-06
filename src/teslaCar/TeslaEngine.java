package teslaCar;

import abstractFactory.Engine;

public class TeslaEngine implements Engine {

    private boolean broken;

    private int power;

    public TeslaEngine(int otherPower,boolean broken){
        power = otherPower;
        this.broken = broken;
    }

    @Override
    public boolean isBroken() {
        return broken;
    }

    @Override
    public String showStats() {
        System.out.println("[ TeslaEngine : Power = " + Integer.toString(power) + "]");
        return "[ TeslaEngine : Power = " + Integer.toString(power) + "]";
    }

    @Override
    public void fixTheEngine() {
        broken = false;
    }
}
