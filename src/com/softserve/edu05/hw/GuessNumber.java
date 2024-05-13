package com.softserve.edu05.hw;

import java.util.Random;

public class GuessNumber {
    private int number;

    public GuessNumber(){
        Random random = new Random();
        this.number = random.nextInt(1000);
    }

    public boolean isEqual(int val){
        return number == val;
    }

    public boolean isGreater(int val){
        return val > number;
    }
}
