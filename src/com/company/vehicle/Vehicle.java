package com.company.vehicle;

public abstract class Vehicle {

    private String name;

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double getFuelNeeds();
    public abstract double getDistance();

    public double calculateFuelConsumption() {
        return getFuelNeeds()/getDistance() * 100;
    }

    public void go() {
        System.out.println("Uruchomiony: " + getClass());
    }
    public void stop() {
        System.out.println("Zatrzymany: " + getClass());
    }


    public void start() {
        System.out.println("Star vehicle");
    }

}
