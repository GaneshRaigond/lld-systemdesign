package org.example.withoutstrategy;

public class PickupTruck extends Vehicle {
    @Override
    public void drive() {
        System.out.println("Higher torque drive");
    }
}
