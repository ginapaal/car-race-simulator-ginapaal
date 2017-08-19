package com.car_race_simulator;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Random;

public class Car {
    static Random randomize = new Random();

    static String name() {
        List<String> carNames = new ArrayList<>(Arrays.asList("Patron", "Dragon", "Aura", "Motive", "Crux", "Encounter", "Etheral", "Meridian", "Prestige", "Albatross", "Dynamo", "Lightning", "Utopia", "Prime", "Inferno", "Catalyst", "Sliver", "Stardust", "Nebula", "Vision", "Bullet", "Icon", "Formula", "Behemoth",
                "Deputy", "Essence", "Raven", "Portrait", "Triumph", "Hydra", "Ferocity", "Cobra", "Fang", "Majesty", "Escape", "Baron", "Nebula","Revelation", "Dragon"));
        int getRandomSurName = randomize.nextInt(carNames.size());
        int getRandomLastName = randomize.nextInt(carNames.size());
        String getSurName = carNames.get(getRandomSurName)+" ";
        String getLastName = carNames.get(getRandomLastName);
        String carFullName = getSurName + getLastName;
        return carFullName;
    }

    static int setSpeedLimit() {
        int carSpeed;
        int limitedSpeed = randomize.nextInt(100);
        if (limitedSpeed <= 30) {
            System.out.println("I'm going slowly");
            carSpeed = 70;
        } else {
            int averageSpeed = randomize.nextInt((110 - 80) + 1) + 80;
            carSpeed = averageSpeed;
        }
        System.out.println(carSpeed);
        return carSpeed;
    }
}
