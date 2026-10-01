package org.example;

import org.example.withstrategy.PickupTruck;
import org.example.withstrategy.RaceCar;
import org.example.withstrategy.Vehicle;

public class Main {

    public static void main(String[] args) {
        //strategy design pattern
        //2 subckasses having same methods is repeating, duplicacy
        //not recommended. code reusability issue

        System.out.println("Hello world!");
        Vehicle vehicle = new PickupTruck();
        Vehicle vehicle1 = new RaceCar();

        vehicle.drive();
        vehicle1.drive();
    }
}