package com.softserve.edu05.hw05;
import java.util.Random;

public class RandomNumberGenerator {
    public static int generateRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }
}