package org.example.withstrategy.strategies;

public class SpecialStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Higher Torque");
    }
}
