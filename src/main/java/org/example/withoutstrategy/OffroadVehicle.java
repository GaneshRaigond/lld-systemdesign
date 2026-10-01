package org.example.withoutstrategy;

public class OffroadVehicle extends Vehicle {

    @Override
    public void drive() {
        System.out.println("Higher torque drive"); //same method repeated as pickuptruck(duplicacy)
    }
}
