package logic;

public class Car extends Vehicle {
    private boolean airConditioningWorking;
    static final double AIRCONDITIONING_BURNING = 0.8;

    public Car(String name, double tankCapacity, double baseBurningPer100) {
        super(name, tankCapacity, baseBurningPer100);
        this.airConditioningWorking = false;
    }

    protected double extraBurning() {
        if (airConditioningWorking) {
            return AIRCONDITIONING_BURNING;
        }
        return 0;
    }

    public void setAirConditioningON() {
        System.out.println("Uruchomiono klimatyzację");
        this.airConditioningWorking = true;
    }

    public void setAirConditioningOFF() {
        System.out.println("Wyłączono klimatyzację");
        this.airConditioningWorking = false;
    }

    @Override
    public String toString() {
        return super.toString() + ", czy klimatyzacja jest włączona = " + airConditioningWorking;
    }

}
