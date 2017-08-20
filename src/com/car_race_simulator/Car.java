package com.car_race_simulator;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Car {

    static String carName() {
        List<String> carNames = new ArrayList<>(Arrays.asList("Patron", "Dragon", "Aura", "Motive", "Crux", "Encounter", "Etheral", "Meridian", "Prestige", "Albatross", "Dynamo", "Lightning", "Utopia", "Prime", "Inferno", "Catalyst", "Sliver", "Stardust", "Nebula", "Vision", "Bullet", "Icon", "Formula", "Behemoth",
                "Deputy", "Essence", "Raven", "Portrait", "Triumph", "Hydra", "Ferocity", "Cobra", "Fang", "Majesty", "Escape", "Baron", "Nebula","Revelation", "Dragon"));

        int surNameRandom = Main.randomize.nextInt(carNames.size());
        int lastNameRandom = Main.randomize.nextInt(carNames.size());

        String surName = carNames.get(surNameRandom) + " ";
        String lastName = carNames.get(lastNameRandom);

        return surName + lastName;
    }

    static int setSpeed() {
        int normalSpeed;
        int limit = Main.randomize.nextInt(100);
         if (limit <= 30) {
             normalSpeed = 70;
         } else {
             normalSpeed = Main.randomize.nextInt((110 - 80) + 1) + 80;
         }

         return normalSpeed;
    }
}