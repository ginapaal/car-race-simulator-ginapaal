package com.car_race_simulator;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Random;
import java.util.TreeMap;
import java.util.Map;

public class Car {
    static Random randomize = new Random();

    static String name() {
        List<String> carNames = new ArrayList<>(Arrays.asList("Patron", "Dragon", "Aura", "Motive", "Crux", "Encounter", "Etheral", "Meridian", "Prestige", "Albatross", "Dynamo", "Lightning", "Utopia", "Prime", "Inferno", "Catalyst", "Sliver", "Stardust", "Nebula", "Vision", "Bullet", "Icon", "Formula", "Behemoth",
                "Deputy", "Essence", "Raven", "Portrait", "Triumph", "Hydra", "Ferocity", "Cobra", "Fang", "Majesty", "Escape", "Baron", "Nebula","Revelation", "Dragon"));
        int getRandomSurName = randomize.nextInt(carNames.size());
        int getRandomLastName = randomize.nextInt(carNames.size());
        String getSurName = carNames.get(getRandomSurName)+" ";
        String getLastName = carNames.get(getRandomLastName);
        return getSurName + getLastName;
    }

    static int setSpeedLimit() {
        int normalSpeed;
        int limitedSpeed = randomize.nextInt(100);
        if (limitedSpeed <= 30) {
            normalSpeed = 70;
        } else {
            normalSpeed = randomize.nextInt((110 - 80) + 1) + 80;
        }
        return normalSpeed;
    }

    static TreeMap<String, Integer> moveForAnHour(boolean rain, TreeMap<String, Integer> vehicles, int hours) {
        TreeMap<String,Integer> distancePerCar = new TreeMap<>();
        for(Map.Entry<String,Integer> entry : vehicles.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            for (int i = 1; i < hours+1; i++) {
                int distance = value*i;
                distancePerCar.put(key, distance);
            }
        }
        return distancePerCar;
    }
}
