package teslaCar;

import abstractFactory.Wheels;

public class TeslaWheels implements Wheels {

    private boolean broken;
    private String season;

    public TeslaWheels(String other_season,boolean broken){
        if(other_season != "Summer" && other_season != "Winter"){
            season = "No Season";
        }else{
            season = other_season;
        }
        this.broken = broken;
    }


    @Override
    public boolean isBroken() {
        return broken;
    }

    @Override
    public String showStats() {
        System.out.println("[Wheels: season = " + season + "]");
        return "[Wheels: season = " + season + "]";
    }

    @Override
    public void fixTheWheels() {
        broken = false;
    }
}
