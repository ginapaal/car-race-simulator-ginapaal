package com.car_race_simulator;

import java.util.*;

public class Main {

    static Random randomize = new Random();
    static boolean isRaining() {
        int possibility = randomize.nextInt(100);

        if (possibility <= 30) {
            System.out.println("It's raining");
            return true;
        } else {
            return false;
        }
    }

    static void createVehicles() {
        List vehicles = new ArrayList();
        for (int i = 1; i < 11; i++) {
            Car cars = new Car();
            vehicles.add(cars.carName());
            Motorcycle motors = new Motorcycle();
            vehicles.add(motors.motorNames(i));
            Truck trucks = new Truck();
            vehicles.add(trucks.truckNames());
        }
        Collections.sort(vehicles);
        System.out.println(vehicles);
    }

    public static void main(String[] args) {
        isRaining();
        createVehicles();
    }
}