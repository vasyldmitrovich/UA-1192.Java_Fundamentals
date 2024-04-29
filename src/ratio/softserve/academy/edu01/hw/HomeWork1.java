package ratio.softserve.academy.edu01.hw;

import ratio.softserve.academy.AbstractHomeWork;

import java.util.HashMap;
import java.util.Scanner;

public class HomeWork1 extends AbstractHomeWork {

    public HomeWork1() {
        HashMap<Integer, Runnable> steps = getSteps();
        steps.put(1, HomeWork1::part1);
        steps.put(2, HomeWork1::part2);
        steps.put(3, HomeWork1::part3);
        steps.put(4, HomeWork1::part4);
        steps.put(5, HomeWork1::part5);
        steps.put(6, HomeWork1::part6);
        steps.put(7, HomeWork1::part7);
    }

    @Override
    public void accept(Integer step) {
        Runnable runnable = getSteps().get(step);
        if (runnable != null) {
            runnable.run();
        } else {
            System.out.println("Invalid step number.");
        }
    }

    /**
     * Write a program that reads three strings and outputs them in the reverse order, each on a new line.
     */
    public static void part1() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Task description: Write a program that reads three strings and outputs them in the reverse order, each on a new line.");
        System.out.println("Enter the first string:");
        String string1 = scanner.nextLine();

        System.out.println("Enter the second string:");
        String string2 = scanner.nextLine();

        System.out.println("Enter the third string:");
        String string3 = scanner.nextLine();

        System.out.println("You entered:");
        System.out.println(string1);
        System.out.println(string2);
        System.out.println(string3);
    }

    /**
     * Write a program that takes three numbers from console as input to calculate and print output
     * the average of the numbers
     */
    public static void part2() {
        System.out.println("Task description: Write a program that takes three numbers from console as input to calculate and print output the average of the numbers.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculating the reverse order of three strings.");
        System.out.println("Enter the first number:");
        double number1 = scanner.nextDouble();

        System.out.println("Enter the second number:");
        double number2 = scanner.nextDouble();

        System.out.println("Enter the third number:");
        double number3 = scanner.nextDouble();

        double average = (number1 + number2 + number3) / 3;
        System.out.println("The average of the numbers is: " + average);

    }

    /**
     * 3*. Create Console Application project in Java.
     * In main() method write code for solving next tasks:
     * 1) 1. Define integer variables a and b. Read values a and b from Console and calculate:
     * • a + b
     * • a - b
     * • a * b
     * • a / b.
     */
    public static void part3() {
        System.out.println("Task description: Define integer variables a and b. Read values a and b from Console and calculate: a + b, a - b, a * b, a / b.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = scanner.nextInt();
        System.out.println("Enter the second number:");
        int b = scanner.nextInt();

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
    }

    /**
     * 4*. Output question “How are you?“.
     * Define string variable answer. Read the value
     * answer and output: “You are (answer)".
     */
    public static void part4() {
        System.out.println("Task description: Output question “How are you?“. Define string variable answer. Read the value answer and output: “You are (answer)\".");
        Scanner scanner = new Scanner(System.in);
        System.out.println("How are you?");
        String answer = scanner.nextLine();
        System.out.println("You are " + answer);
    }

    /**
     * 1. Flower bed is shaped like a circle. Calculate its perimeter and area. Input the radius
     * from the console, and output obtained results.
     */
    public static void part5() {
        System.out.println("Task description: Flower bed is shaped like a circle. Calculate its perimeter and area. Input the radius from the console, and output obtained results.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius of the circle:");
        double radius = scanner.nextDouble();
        System.out.println("The perimeter of the circle is: " + (2 * Math.PI * radius));
        System.out.println("The area of the circle is: " + (Math.PI * Math.pow(radius, 2)));
    }

    /**
     * 2. Define two String variables name and address. Output question "What is your name?
     * to the console. Read the value of name and output next question: “Where do you live,
     * (name)?“ to the console. Read the value of address from the console and output the
     * complete information.
     */
    public static void part6() {
        System.out.println("Task description: Define two String variables name and address. Output question \"What is your name?\" to the console. Read the value of name and output next question: \"Where do you live, (name)?\" to the console. Read the value of address from the console and output the complete information.");

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("Where do you live, " + name + "?");
        String address = scanner.nextLine();
        System.out.println("Name: " + name + ", Address: " + address);
    }

    /**
     * 3*. Three phone calls were made from different countries, each with a different cost per
     * minute (c1, c2, and c3) and duration (t1, t2, and t3). Input all the source data from the
     * console, calculate the cost of each call and the total cost, and output the results to the
     * console.
     */
    public static void part7() {
        System.out.println("Task description: Three phone calls were made from different countries, each with a different cost per minute (c1, c2, and c3) and duration (t1, t2, and t3). Input all the source data from the console, calculate the cost of each call and the total cost, and output the results to the console.");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the cost per minute of the first call:");
        double c1 = scanner.nextDouble();
        System.out.println("Enter the duration of the first call:");
        double t1 = scanner.nextDouble();

        System.out.println("Enter the cost per minute of the second call:");
        double c2 = scanner.nextDouble();
        System.out.println("Enter the duration of the second call:");
        double t2 = scanner.nextDouble();

        System.out.println("Enter the cost per minute of the third call:");
        double c3 = scanner.nextDouble();
        System.out.println("Enter the duration of the third call:");
        double t3 = scanner.nextDouble();

        double cost1 = c1 * t1;
        double cost2 = c2 * t2;
        double cost3 = c3 * t3;

        System.out.println("The cost of the first call is: " + cost1);
        System.out.println("The cost of the second call is: " + cost2);
        System.out.println("The cost of the third call is: " + cost3);
        System.out.println("The total cost of all calls is: " + (cost1 + cost2 + cost3));
    }
}
