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

    static List createVehicles() {
        List vehicles = new ArrayList();
        for (int i = 1; i < 11; i++) {
            Car cars = new Car();
            vehicles.add(cars.carName());
            System.out.println(i+ " "+cars.carName()+" "+ cars.setSpeed());
            Motorcycle motors = new Motorcycle();
            vehicles.add(motors.motorNames(i));
            System.out.println(i+ " "+motors.motorNames(i) + " " + motors.setSpeed(isRaining()));
            Truck trucks = new Truck();
            vehicles.add(trucks.truckNames());
            System.out.println(i+ " "+trucks.truckNames()+" "+trucks.setSpeed());
        }
        Collections.sort(vehicles);
        System.out.println(vehicles);

        return vehicles;
    }

    public static void main(String[] args) {
        isRaining();
        createVehicles();
    }
}