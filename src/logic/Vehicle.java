package logic;

public class Vehicle {
    private String name;
    private double tankCapacity;
    private double baseBurningPer100;

    public Vehicle(String name, double tankCapacity, double baseBurningPer100) {
        this.name = name;
        this.tankCapacity = tankCapacity;
        this.baseBurningPer100 = baseBurningPer100;
    }

    public void setAirConditioningON() {
    }

    public void setAirConditioningOFF() {
    }

    protected double getMomentBurning() {
        return getBaseBurningPer100() + extraBurning();
    }


    protected double extraBurning() {
        return 0;
    }

    private double getPossibleDistance(){
        return tankCapacity / getMomentBurning();
    }


    @Override
    public String toString() {
        return  "nazwa = '" + name + '\'' +
                ", ilość paliwa = " + tankCapacity +
                ", bazowe spalanie na 100km = " + baseBurningPer100 +
                ", chwilowe spalanie na 100km = " + getMomentBurning() +
                ", możlowy dystans = " + getPossibleDistance();
    }

    public double getBaseBurningPer100() {
        return baseBurningPer100;
    }

}

