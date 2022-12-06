package teslaCar;

import abstractFactory.Engine;

public class TeslaEngine implements Engine {

    private boolean broken;

    private int power;

    private TeslaEngine(int otherPower,boolean broken){
        power = otherPower;
        this.broken = broken;
    }

    @Override
    public boolean isBroken() {
        return broken;
    }

    @Override
    public String showStats() {
        return "[ TeslaEngine : Power = " + Integer.toString(power) + "]";
    }
}
