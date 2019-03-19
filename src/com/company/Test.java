package com.company;

import com.company.vehicle.*;

public class Test {


    public static void main(String[] args) {

//        Vehicle v[] = new Vehicle[5];
//        v[0] = new Car("e36");
//        v[1] = new Plane("787");
//        v[2] = new RaceCar("shelby");
//        v[3] = new Ship("Costa Concordia");
//        v[4] = new Truck("MAN");

        Vehicle v[] = new Vehicle[] {

                new Car("e36"),
                new Plane("787"),
                new RaceCar("shelby"),
                new Ship("Costa Concordia"),
                new Truck("MAN")
        };

        for(int i=0; i<v.length; i++){
            v[i].go();
            v[i].stop();
            v[i].calculateFuelConsumption();

            if(v[i] instanceof Flying) {
                ((Flying) v[i]).callAirControll();
            }


        }








    }
}
