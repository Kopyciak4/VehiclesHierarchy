package com.company.vehicle;

public class Ship extends Vehicle implements Sailing {

    public Ship(String name) {
        setName(name);
    }

    public double getFuelNeeds() {
        return 14480.572;
    }

    public double getDistance() {
        return 30000;
    }

    public void dock() {
        System.out.println("Statek zawinal do portu");
    }

    @Override
    public void stop() {
        dock();
    }

}
