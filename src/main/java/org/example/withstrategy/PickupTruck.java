package org.example.withstrategy;

import org.example.withstrategy.strategies.SpecialStrategy;

public class PickupTruck extends Vehicle{

     public PickupTruck(){
         super(new SpecialStrategy());
     }
}
