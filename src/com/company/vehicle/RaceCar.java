package com.company.vehicle;

public class RaceCar extends Car {

    public RaceCar(String name){
        super(name);
    }

    public double getFuelNeeds() {
        return 60.0;
    }
}
