package com.car_race_simulator;

import java.util.Random;

public class Main {

    static Boolean isRaining() {
        //30% chance of raining
        Random random = new Random();
        int rainChance = random.nextInt(100);
        System.out.println(rainChance);
        if (rainChance <= 30) {
            System.out.println("It's raining");
            return true;
        } else {
            return false;
        }
    }

    static void createVehicles() {
        // creates 10 cars, 10 trucks and 10 motorcycles
        for (int x = 1; x<11; x++) {
            Car car = new Car();
            System.out.println(car.name());
            System.out.println(car.moveForAnHour(isRaining()));
        }
    }

    void simulateRace() {
        //calling moveForAnHour() for every vehicle 50 times

    }

    void printRaceResults() {
        //print out the results of the race
    }

    public static void main(String[] args) {
        createVehicles();
    }
}
