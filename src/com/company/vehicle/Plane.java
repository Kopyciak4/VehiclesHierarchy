package com.company.vehicle;

public class Plane extends Vehicle implements Flying {

    public Plane(String name) {
        setName(name);
    }

    @Override
    public double getFuelNeeds() {
        return 1100000;
    }

    @Override
    public double getDistance() {
        return 3211;
    }

    @Override
    public void takeOff() {
        System.out.println("lece");
    }

    @Override
    public void land() {
        System.out.println("laduje");
    }

    @Override
    public void callAirControll() {
        System.out.println("komunikuje się z kontrola lotu");
    }

    @Override
    public void go() {
        super.go();
        takeOff();
    }

    @Override
    public void stop() {
        super.stop();
        land();
    }
}
