package org.example.withstrategy;

import org.example.withstrategy.strategies.SportsDriveStrategy;

public class RaceCar extends Vehicle{


    public RaceCar() {
        super(new SportsDriveStrategy());
    }
}
