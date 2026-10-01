package org.example.withstrategy;

import org.example.withstrategy.strategies.DriveStrategy;

public class Vehicle {

    private DriveStrategy driveStrategy;

    public Vehicle(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }



    public void drive(){
        driveStrategy.drive();
    }


}
