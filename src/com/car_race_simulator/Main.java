package com.car_race_simulator;

import java.util.*;

public class Main {

    static Random randomize = new Random();

    static boolean isRaining() {
        int possibility = randomize.nextInt(100);

        if (possibility <= 30) {
            return true;
        } else {
            return false;
        }
    }


    static Vehicles[] createVehicles() {

        Vehicles[] vehicles = new Vehicles[30];

        for (int i = 0; i < 10; i++) {
            Vehicles car = new Car();
            vehicles[i] = car;
        }

        for (int i = 10; i < 20; i++) {
            Vehicles motor = new Motorcycle();
            vehicles[i] = motor;
        }

        for (int i = 20; i < 30; i++) {
            Vehicles truck = new Truck();
            vehicles[i] = truck;
        }
        return vehicles;
    }

    private static Vehicles[] simulateRace(Vehicles[] vehicles) {
        for (int hours = 1; hours <= 50; hours++) {
            for (int i = 0; i < 30; i++) {
                vehicles[i].moveForAnHour(isRaining());
            }
        }
        return vehicles;
    }

    private static void printRaceResults(Vehicles[] vehicles) {
        int winner = 0;
        int temp = 0;
        for (int i = 0; i < 30; i++) {
            System.out.println(vehicles[i].name + ": " + vehicles[i].getDistanceTraveled());
            if (temp < vehicles[i].getDistanceTraveled()) {
                temp = vehicles[i].getDistanceTraveled();
                winner = i;
            }
        }
        System.out.println("\nThe winner is a " + vehicles[winner].getType() + "!" + "\n"
                + "Name: " + vehicles[winner].name + "\n" + "Distance traveled: "
                + vehicles[winner].getDistanceTraveled());
    }

    public static void main(String[] args) {

        Vehicles[] vehicles = createVehicles();
        Vehicles[] race = simulateRace(vehicles);
        printRaceResults(race);
    }

}