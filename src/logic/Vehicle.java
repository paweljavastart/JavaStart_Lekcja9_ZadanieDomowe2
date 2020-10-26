package logic;

public class Vehicle {
    private String name;
    private double tankCapcity;
    private double baseBurningPer100;
    private double momentBurningPer100;
    private double possibleDistance;

    public Vehicle(String name, double tankCapcity, double baseBurningPer100) {
        this.name = name;
        this.tankCapcity = tankCapcity;
        this.baseBurningPer100 = baseBurningPer100;
        this.momentBurningPer100 = baseBurningPer100;
        this.possibleDistance = tankCapcity/ momentBurningPer100;
    }

    public void setAirConditioningON() {
    }

    public void setAirConditioningOFF() {
    }


    public double getPossibleDistanceNow(){
        return tankCapcity/ momentBurningPer100;
    }

    @Override
    public String toString() {
        return  "nazwa = '" + name + '\'' +
                ", ilość paliwa = " + tankCapcity +
                ", bazowe spalanie na 100km = " + baseBurningPer100 +
                ", chwilowe spalanie na 100km = " + momentBurningPer100 +
                ", możlowy dystans = " + getPossibleDistanceNow();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTankCapcity() {
        return tankCapcity;
    }

    public double getBaseBurningPer100() {
        return baseBurningPer100;
    }

    public double getMomentBurningPer100() {
        return momentBurningPer100;
    }

    public void setMomentBurningPer100(double momentBurningPer100) {
        this.momentBurningPer100 = momentBurningPer100;
    }
}

