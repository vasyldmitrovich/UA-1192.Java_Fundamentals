package com.softserve.edu05.hw;

public class Positioner {
    /*
    position of second positive number;
    o minimum value and its position in the array.
    o calculate the product of all entered even numbers (exclude 0 from even if entered by
    user).
     */

    public int getSecondPosition(int[] numbers) {
        int counter = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) counter++;
            if (counter == 2) return i;
        }
        return -1;
    }

    public int[] getMins(int[] numbers) {
        int[] mins = new int[2];
        mins[0] = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < mins[0]) {
                mins[0] = numbers[i];
                mins[1] = i;
            }
        }
        return mins;
    }

    public int productOfEven(int[] numbers){
        int prod=1;
        for (int number: numbers){
            if(number != 0 && number % 2 == 0){
                prod = prod*number;
            }
        }
        return prod;
    }
}
