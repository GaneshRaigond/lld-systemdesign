package org.example.withstrategy.strategies;

public class XYZDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Future mein you can extend");
    }
}
