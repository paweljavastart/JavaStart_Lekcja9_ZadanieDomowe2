package logic;

public class Vehicle {
    private String name;
    private double tankCapacity;
    private double baseBurningPer100;
    private double momentBurningPer100;
    private double possibleDistance;

    public Vehicle(String name, double tankCapacity, double baseBurningPer100) {
        this.name = name;
        this.tankCapacity = tankCapacity;
        this.baseBurningPer100 = baseBurningPer100;
        this.momentBurningPer100 = baseBurningPer100;
        updatePossibleDistance();
    }

    public void setAirConditioningON() {
    }

    public void setAirConditioningOFF() {
    }

    protected double momentBurningCheck() {
        return getBaseBurningPer100() + extraBurning();
    }

    protected void updateMomentBurning() {
        setMomentBurningPer100(momentBurningCheck());
    }

    protected double extraBurning() {
        return 0;
    }

    private double changePossibleDistance(){
        return tankCapacity / momentBurningCheck();
    }

    protected void updatePossibleDistance(){
        setPossibleDistance(changePossibleDistance());
    }

    @Override
    public String toString() {
        return  "nazwa = '" + name + '\'' +
                ", ilość paliwa = " + tankCapacity +
                ", bazowe spalanie na 100km = " + baseBurningPer100 +
                ", chwilowe spalanie na 100km = " + momentBurningPer100 +
                ", możlowy dystans = " + possibleDistance;
    }

    public double getBaseBurningPer100() {
        return baseBurningPer100;
    }

    public void setMomentBurningPer100(double momentBurningPer100) {
        this.momentBurningPer100 = momentBurningPer100;
    }

    public void setPossibleDistance(double possibleDistance) {
        this.possibleDistance = possibleDistance;
    }
}

