package model;

import logic.Car;
import logic.Truck;
import logic.Vehicle;

public class Test {
    public static void main(String[] args) {


        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new Car("auto 1", 100, 10);
        vehicles[1] = new Truck("truck 1", 100, 20, 100);
        vehicles[2] = new Truck("truck 2", 1000, 20, 0);

        for (int i = 0; i < vehicles.length; i++) {
            System.out.println(vehicles[i]);
            vehicles[i].setAirConditioningON();
            System.out.println(vehicles[i]);
            vehicles[i].setAirConditioningOFF();
            System.out.println(vehicles[i]);
            System.out.println();
        }
    }
}
