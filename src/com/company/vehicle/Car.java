package com.company.vehicle;

public class Car extends Vehicle {

    public Car(String name) {
        setName(name);
    }

    public double getFuelNeeds() {
        return 55.0;
    }

    public double getDistance() {
        return 800;
    }

}


