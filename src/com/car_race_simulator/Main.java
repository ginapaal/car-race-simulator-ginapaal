package com.car_race_simulator;

import java.util.*;

public class Main {

    static Boolean isRaining() {
        //30% chance of raining
        Random random = new Random();
        int rainChance = random.nextInt(100);
        if (rainChance <= 30) {
            return true;
        } else {
            return false;
        }
    }

    static TreeMap createVehicles() {
        // creates 10 cars, 10 trucks and 10 motorcycles
        TreeMap<String, Integer> vehicles = new TreeMap<>(Comparator.reverseOrder());

        for (int x = 1; x<11; x++) {
            Car car = new Car();
            vehicles.put(car.name(), car.setSpeedLimit());
            Motorcycle motorcycle = new Motorcycle();
            vehicles.put(motorcycle.name(x), motorcycle.speed());
        }
        return vehicles;
    }

    public static void simulateRace() {
        //calling moveForAnHour() for every vehicle 50 times
        for (int i = 1; i < 50; i++) {
            Car.moveForAnHour(isRaining(), createVehicles());
            System.out.println(createVehicles());
        }
    }

    void printRaceResults() {
        //print out the results of the race
    }

    public static void main(String[] args) {
        simulateRace();

    }
}
