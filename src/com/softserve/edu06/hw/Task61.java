package com.softserve.edu06.hw;

import java.util.Arrays;
import java.util.Random;

public class Task61 {

    public static void execute(){
        Bird[] birds = generate(6);
        Arrays.stream(birds).forEach(bird -> System.out.println(bird.getClass().getSimpleName() + " " + bird.fly()));

    }

    private static Bird[] generate(int number){
        Random random = new Random();
        Bird[] birds = new Bird[number];

        for(int i = 0; i< number; i++){
            int type = random.nextInt(0,100);
            if (type < 25) {
                birds[i] = new Kiwi();
            } else if (type < 50) {
                birds[i] = new Swallow();
            } else if (type < 75) {
                birds[i] = new Penguin();
            } else {
                birds[i] = new Eagle();
            }
        }
        return birds;
    }
}
