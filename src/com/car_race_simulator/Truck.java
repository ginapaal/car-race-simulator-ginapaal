package com.car_race_simulator;

public class Truck {

    static String truckNames() {
        int truckName = Main.randomize.nextInt(1000);
        String name = Integer.toString(truckName);
        return name;
    }

    static int setSpeed() {
        int normalSpeed;
        int breakDown = Main.randomize.nextInt(100);
        if (breakDown <= 5) {
            System.out.println("I'm broke");
            normalSpeed = 0;
        } else {
            normalSpeed  = 100;
        }

        return normalSpeed;
    }
}
