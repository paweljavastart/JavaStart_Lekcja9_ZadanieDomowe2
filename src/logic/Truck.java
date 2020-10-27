package logic;

public class Truck extends Car {
    private int cargoWeight;
    static final double CARGO_BURNING_INDICATOR = 0.5;

    public Truck(String name, double tankCapacity, double baseBurningPer100, int cargoWeight) {
        super(name, tankCapacity, baseBurningPer100);
        this.cargoWeight = cargoWeight;
        updateMomentBurning();
        updatePossibleDistance();
    }

    @Override
    protected double extraBurning() {
        return super.extraBurning() * 2 + cargoWeight / 100 * CARGO_BURNING_INDICATOR;
    }

    @Override
    public String toString() {
        return super.toString() + ", waga ładunku = " + cargoWeight;
    }
}
