package com.softserve.edu05.hw;

import java.util.Arrays;

public class ProductOfFiveCalculator {
    private int[] numbers = new int[10];

    public void setNumbers(int[] args){
        numbers = args;
    }

    private boolean inCondition(int[] arr){
        for (int i=0; i<5; i++){
            if(arr[i]<=0)
                return false;
        }
        return true;
    }

    public int calculate() {
        int sum = 0;

        if (inCondition(numbers)) {
            for (int i = 0; i < 5; i++) {
                sum += numbers[i];
            }
        } else {
            for (int j = 5; j < 10; j++) {
                sum += numbers[j];
            }
        }
        return sum;
    }

    public void execute(){
        for(int i =0; i<10; i++){
            numbers[i] = CustomScanner.scanInt();
        }
        System.out.println("Values: " + Arrays.toString(numbers));
        System.out.println("Calculation result is: " + calculate());
    }
}
