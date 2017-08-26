package com.car_race_simulator;

import java.util.Random;

public class Truck extends Vehicles {

    public Truck() {
        type = "truck";
        name = truckNames();
    }

    public static String truckNames() {
        int truckName = Main.randomize.nextInt(1000);
        String name = Integer.toString(truckName);
        return name;
    }

    int breakDownTurnsLeft;

    @Override
    public void moveForAnHour(boolean rain) {
        if (breakDownTurnsLeft != 0) {
            normalSpeed = 0;
            breakDownTurnsLeft--;
        } else if (breakDownTurnsLeft == 0) {
            normalSpeed = 100;
            int breakdown = Main.randomize.nextInt(101);
            if (breakdown <= 5) breakDownTurnsLeft = 2;
        }
        distanceTraveled += normalSpeed;
    }

}
