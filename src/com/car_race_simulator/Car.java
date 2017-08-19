package com.car_race_simulator;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Random;

public class Car {

    public Car() {
        String type = "car";
        String carName = name();
    }

    static String name() {
        Random randomize = new Random();
        List<String> carNames = new ArrayList<>(Arrays.asList("Patron", "Dragon", "Aura", "Motive", "Crux", "Encounter", "Etheral", "Meridian", "Prestige", "Albatross", "Dynamo", "Lightning", "Utopia", "Prime", "Inferno", "Catalyst", "Sliver", "Stardust", "Nebula", "Vision", "Bullet", "Icon", "Formula", "Behemoth",
                "Deputy", "Essence", "Raven", "Portrait", "Triumph", "Hydra"));
        int getRandomSurName = randomize.nextInt(carNames.size());
        int getRandomLastName = randomize.nextInt(carNames.size());
        String getSurName = carNames.get(getRandomSurName)+" ";
        String getLastName = carNames.get(getRandomLastName);
        String carFullName = getSurName + getLastName;
        System.out.println(carFullName);

        return carFullName;
    }
}
