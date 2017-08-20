package com.car_race_simulator;

public class Truck {

    static String truckNames() {
        int truckName = Main.randomize.nextInt(1000);
        String name = Integer.toString(truckName);
        return name;
    }

}
