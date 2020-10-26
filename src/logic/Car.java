package logic;

public class Car extends Vehicle{
    private boolean airConditioningWorking;

    public Car(String name, double tankCapcity, double baseBurningPer100) {
        super(name, tankCapcity, baseBurningPer100);
        this.airConditioningWorking = false;
        setMomentBurningPer100(momentBurningCheck());
    }

    protected double extraBurning() {
        if (airConditioningWorking) {
            return 0.8;
        }
        return 0;
    }

    double momentBurningCheck() {
            return getBaseBurningPer100() + extraBurning();
    }

    public void setAirConditioningON() {
        System.out.println("Uruchomiono klimatyzację");
        this.airConditioningWorking = true;
        setMomentBurningPer100(getBaseBurningPer100() + extraBurning());
    }

    public void setAirConditioningOFF() {
        System.out.println("Wyłączono klimatyzację");
        this.airConditioningWorking = false;
        setMomentBurningPer100(getBaseBurningPer100());
    }

    @Override
    public String toString() {
        return super.toString() + ", czy klimatyzacja jest włączona = " + airConditioningWorking;
    }

    public boolean isAirConditioningWorking() {
        return airConditioningWorking;
    }

}
