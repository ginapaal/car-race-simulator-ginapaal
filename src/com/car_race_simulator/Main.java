package com.car_race_simulator;

import java.util.Random;

public class Main {

    static Boolean isRaining() {
        //30% chance of raining
        Random random = new Random();
        int rainChance = random.nextInt();
        if (rainChance <= 30) {
            return true;
        } else {
            return false;
        }
    }

    int createVehicles() {
        // creates 10 cars, 10 trucks and 10 motorcycles
        Car car = new Car();

        return 5;
    }

    void simulateRace() {
        //calling moveForAnHour() for every vehicle 50 times

    }

    void printRaceResults() {
        //print out the results of the race
    }

    public static void main(String[] args) {
        Car.name();
    }
}
