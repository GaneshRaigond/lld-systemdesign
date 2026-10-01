package org.example.withstrategy.strategies;

public class SportsDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Higher Pickup");
    }
}
