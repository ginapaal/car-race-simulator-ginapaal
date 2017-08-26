package com.car_race_simulator;

public class Motorcycle extends Vehicles {

    static int nameNumber;


    public Motorcycle() {
        type = "motorcycle";
        name = "Motorcycle" + ++nameNumber;
    }

    public static String motorNames(int number) {
        String name = "Motorcycle " + number;

        return name;
    }

    @Override
    public void moveForAnHour(boolean raining) {
        if (raining) {
            normalSpeed -= (5 + (Main.randomize.nextInt(45)));
        } else {
            normalSpeed = 100;
        }
        distanceTraveled += normalSpeed;
    }


}
