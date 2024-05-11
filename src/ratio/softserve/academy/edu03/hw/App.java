package ratio.softserve.academy.edu03.hw;

import java.util.Scanner;

import static java.lang.System.out;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        out.println(Dinglemouse.INST.plus100(23));
        out.println("Enter the lengths of the three sides of the triangle:");

        double side1 = scanner.nextDouble();
        double side2 = scanner.nextDouble();
        double side3 = scanner.nextDouble();

        out.println("The area of the triangle is: " + calculateTriangleArea(side1, side2, side3));


        out.println("Enter three integer numbers:");

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        out.println("The smallest number is: " + findSmallest(num1, num2, num3));

        Person[] people = new Person[5];

        for (int i = 0; i < 5; i++) {
            people[i] = new Person();
            people[i].input();
        }

        for (Person person : people) {
            person.output();
        }

    }



    public static int calculateDigitSum(int number) {
        if (number >= 100 && number <= 999) {
            int sum = 0;
            while (number > 0) {
                sum += number % 10;
                number /= 10;
            }
            return sum;
        } else {
            // Handle the error if the number is not three digits
            throw new IllegalArgumentException("The input number is not a three-digit number.");
        }
    }

    public double calculateSquareRoot(int number){
        return Math.sqrt(number);
    }
    public double calculateSquare(int number){
        return Math.pow(number, 2);
    }

    public int calculateCube(int number){
        return number * number * number;
    }


    public static double calculateTriangleArea(double side1, double side2, double side3) {
        double s = (side1 + side2 + side3) / 2.0;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }


    public static int findSmallest(int num1, int num2, int num3) {
        return Math.min(Math.min(num1, num2), num3);
    }


}

