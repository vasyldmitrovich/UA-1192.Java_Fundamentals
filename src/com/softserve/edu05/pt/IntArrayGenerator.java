package com.softserve.edu05.pt;

import java.util.Random;

public class IntArrayGenerator {

    public static int[] generate(int length){// It is good method
        int[] array = new int[length];
        Random random = new Random();

        for (int i = 0; i < length; i++){
            array[i] = random.nextInt();
        }

        return array;
    }
}
