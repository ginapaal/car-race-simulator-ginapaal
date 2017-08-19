package com.car_race_simulator;

import java.util.Random;
import java.util.List;
import java.util.ArrayList;
import java.util.TreeMap;

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
        TreeMap<String, Integer> carMap = new TreeMap<>();
        TreeMap<String, Integer> motor = new TreeMap<>();
        for (int x = 1; x<11; x++) {
            Car car = new Car();
            carMap.put(car.name(), car.setSpeedLimit());
            Motorcycle motorcycle = new Motorcycle();
            motor.put(motorcycle.name(x), motorcycle.speed());
        }
        System.out.println(motor);


        return carMap;
    }

    public static void simulateRace() {
        //calling moveForAnHour() for every vehicle 50 times
        int hours = 50;
        TreeMap cars = createVehicles();
        System.out.println(cars);
        TreeMap distance = Car.moveForAnHour(isRaining(), cars, 50);
        System.out.println(distance);
    }

    void printRaceResults() {
        //print out the results of the race
    }

    public static void main(String[] args) {
        simulateRace();
    }
}
