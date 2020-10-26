package logic;

public class Truck extends Car{
    private int cargoWeight;

    public Truck(String name, double tankCapcity, double baseBurningPer100, int cargoWeight) {
        super(name, tankCapcity, baseBurningPer100);
        this.cargoWeight = cargoWeight;
        setMomentBurningPer100(momentBurningCheck());
    }

    protected double extraBurning() {
        return super.extraBurning()*2 + cargoWeight/100 * 0.5;
    }

    double momentBurningCheck() {
            return getBaseBurningPer100() + extraBurning();
    }

    public void setAirConditioningON() {
        super.setAirConditioningON();
    }

    public void setAirConditioningOFF() {
        super.setAirConditioningOFF();
    }

    @Override
    public String toString() {
        return super.toString() + ", waga ładunku = " + cargoWeight;
    }
}
