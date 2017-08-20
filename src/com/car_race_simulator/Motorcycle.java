package com.car_race_simulator;

public class Motorcycle {

    static String motorNames(int number) {
        String motorName = "Motorcycle " + number;

        return motorName;
    }

    static int setSpeed(boolean raining) {
        int normalSpeed = 100;

        if (raining) {
            normalSpeed -= Main.randomize.nextInt((50 - 5) + 1) + 5;
        }

        return normalSpeed;
    }
}