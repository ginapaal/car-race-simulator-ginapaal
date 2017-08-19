package com.car_race_simulator;

import java.util.Random;

public class Motorcycle {
    static Random randomize = new Random();

    static String name(int i) {
        String motorName = "Motorcycle " + i;
        return motorName;
    }

    static int speed() {
        int normalSpeed = 100;
        if(Main.isRaining()) {
            int deccelerate = randomize.nextInt((50-5)+1)+5;
            normalSpeed = normalSpeed - deccelerate;
        }
        return normalSpeed;
    }
}

