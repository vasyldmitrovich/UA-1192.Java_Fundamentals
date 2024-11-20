package com.softserve.edu05.sort_algorithms;


import java.util.Arrays;

/*Class for testing some logic*/
public class TestingSomeMethods {

    public static void main(String[] args) {
        //Methods in this class
        //runFunnyMethods();

        // TODO see and change some data in method 'testingSortMethods()' in class 'WorkWithSortingAlgorithms'

        //Work with sort algorithm
        WorkWithSortingAlgorithms.testingSortMethods();

    }

    public static void runFunnyMethods() {

        //Change data in two variables without creating third variable
        int a = 2;
        int b = 7;
        System.out.println("a=" + a + " and b=" + b);
        System.out.println("---------------- a = a + b - (b = a);");
        a = a + b - (b = a);
        System.out.println("a=" + a + " and b=" + b);


        System.out.println("Middle of three \"4\", \"6\", \"9\" number is:\t " + middleOfThree("4", "6", "9"));
        System.out.println("To do Match.abc \"-35.7\", but do Trial operation:\t " + mathAbsButTrialOperation(-35.7));
        System.out.println("From fahrenheit \"-90\" to celsius:\t " + fahrenheitToCelsius(-90));
        System.out.println("Factorial \"5\" we use cycle for:\t " + factorialUseFor(5));
        System.out.println("Factorial like example recursion:\t " + factorialUseRecursion(5));


        int[] arrIntSmall = {6, 1, 9, 2, 44, 92, 22, 14, -3, -6};
        System.out.println("Minimal value in array:\t " + minValueInArr(arrIntSmall));
        System.out.println("----------------------");

        int[][] intsArr = new int[5][8];
        addRandomIntInDecimalArr(intsArr);
        int[][] resultArr = minAndMaxInArr(intsArr);
        System.out.println("Arr: " + Arrays.deepToString(intsArr));
        System.out.println("Min and Max value in arr: " + Arrays.deepToString(resultArr));

        int fibonacciInt = 9;
        System.out.println("Fibonacci " + fibonacciInt + " is: " + fibonacciLogarithmicAlgorithm(fibonacciInt));

        int toBinaryIs = 255;
        System.out.println("Int " + toBinaryIs + " to Binary: " + toBinary(toBinaryIs));

        int[] arrIntSmall2 = {6, 1, 9, 2, 44, 92, 22, 14, -3, -6};
        int[] nIntArrInvert = invertArr(arrIntSmall2);
        System.out.print("Invert arr is: ");
        for (int ic : nIntArrInvert
        ) {
            System.out.print(ic + "\t");
        }
        System.out.println();

        int searchObject = 9;
        System.out.println(Arrays.toString(arrIntSmall));
        System.out.println("Binary search " + searchObject + " index is: " + binarySearch(arrIntSmall, searchObject));

    }

    public static int[] invertArr(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int tmp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = tmp;
        }
        return arr;
    }

    public static String toBinary(int x) {
        String binary = "";
        while (x > 0) {
            binary = (x % 2) + binary;
            x /= 2;
        }
        return binary;
    }

    public static long fibonacciLogarithmicAlgorithm(int toN) {
        if (toN <= 1) {
            return 1;
        }
        return fibonacciLogarithmicAlgorithm(toN - 2) + fibonacciLogarithmicAlgorithm(toN - 1);
    }

    public static long fibonacciLinearAlgorithm(int toN) {
        long first = 0;
        long second = 1;
        long result = toN;
        for (int i = 1; i < toN; i++) {
            result = first + second;
            first = second;
            second = result;
        }
        return result;
    }

    public static int[][] minAndMaxInArr(int[][] intsArr) {
        int[][] resultArr = new int[intsArr.length][2];
        for (int i = 0; i < intsArr.length; i++) {
            int valueMin = intsArr[i][0];
            int valueMax = intsArr[i][1];
            int indexMinIs = 0;
            int indexMaxIs = 0;
            for (int j = 1; j < intsArr[i].length; j++) {
                if (intsArr[i][j] <= valueMin) {
                    valueMin = intsArr[i][j];
                    indexMinIs = j;
                } else if (intsArr[i][j] >= valueMax) {
                    valueMax = intsArr[i][j];
                    indexMaxIs = j;
                }
            }
            resultArr[i][0] = intsArr[i][indexMinIs];
            resultArr[i][1] = intsArr[i][indexMaxIs];
        }
        return resultArr;
    }

    public static void addRandomIntInDecimalArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = randomIntFromOneToHundred();
            }
        }
    }

    public static int middleOfThree(String str1, String str2, String str3) {
        if (str1 != null & str2 != null & str3 != null) {
            int mid = 0;
            try {
                int first = Integer.parseInt(str1);
                int second = Integer.parseInt(str2);
                int third = Integer.parseInt(str3);
                int max = Math.max(Math.max(first, second), third);
                int min = Math.min(Math.min(first, second), third);

                mid = first + second + third - (max + min);
            } catch (NumberFormatException n) {
                System.out.println("Error: " + n);
            }
//        Integer a = Integer.parseInt(str1);
//        Integer b = Integer.parseInt(str2);
//        Integer c = Integer.parseInt(str3);
//        return mid = (a > b)? ((c<b)?b:((c<a)?c:a)): ( (a>c)?a:(b>c)?c:b);
            return mid;
        } else return -1;
    }

    public static int minValueInArr(int[] arr) {
        int indexMin = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] <= arr[indexMin]) {
                indexMin = i;
            }
        }
        return arr[indexMin];
    }

    public static double mathAbsButTrialOperation(double data) {
        return data < 0 ? -data : data;
    }

    public static double fahrenheitToCelsius(int fahrenheit) {
        return (fahrenheit - 32) / 1.8;
    }

    public static int factorialUseFor(int n) {
        if (n <= 1) {
            return 1;
        } else {
            int result = 1;
            for (int i = n; i >= 1; i--) {
                result *= i;
            }
            return result;
        }
    }

    public static int factorialUseRecursion(int in) {
        if (in == 1) {
            return 1;
        }
        return in * factorialUseRecursion(in - 1);
    }

    public static int randomIntFromOneToHundred() {
        return (int) (Math.random() * 100);
    }

    public static int randomIntFromOneToThousands() {
        return (int) (Math.random() * 1_000_000);
    }

    public static int binarySearch(int[] arr, int search) {
        int start = 0;
        int end = arr.length - 1;
        while (end >= start) {
            int middle = start + (end - start) / 2;
            if (arr[middle] == search) {
                return middle;
            }
            if (arr[middle] < search) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }
        return -1;
    }

}