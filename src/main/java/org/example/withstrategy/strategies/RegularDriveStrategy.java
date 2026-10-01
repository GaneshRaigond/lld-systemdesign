package org.example.withstrategy.strategies;

public class RegularDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Normal Specs and Driving");
    }
}
