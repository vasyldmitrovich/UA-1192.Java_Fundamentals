package com.softserve.edu05.pt;

import java.util.Arrays;

public class Task53 {
/*
Create an array of ten random integers using a random number generator. Output:
• the biggest number in the array;
• the sum of positive numbers;
• count the number of negative numbers.
• determine whether there are more negative or positive values in the array. If there are
more negative values, output "There are more negative values in the array." Otherwise,
output "There are more positive values in the array." If the counts are equal, output
"There are an equal number of positive and negative values in the array.
 */

    public int getMax(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }

    public void execute(){
        int[] array = IntArrayGenerator.generate(10);
        System.out.println("The biggest number in the array is: " + getMax(array));
    }
}
