package com.softserve.edu05.hw;

import com.softserve.edu05.hw.entity.Car;
import com.softserve.utils.ScannerUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AppHomework {
    public static void main(String[] args) {// You can call task1 here too
        task2();

        List<Car> carList = new ArrayList<>();

        //task3
        carList.add(new Car("jeep", "2004", 20));
        carList.add(new Car("torun", "1999", 15));
        carList.add(new Car("land", "1999", 19));
        carList.add(new Car("torun", "2023", 26));

        String year = ScannerUtils.getValue("Enter year for filter: ", String.class);

        carList.stream()
                .filter(c -> c.getYearOfProduction().equals(year))
                .sorted(Car::compareTo)
                .forEach(System.out::println);

        //task4
        task4();

    }

    private static void task4() {
        System.out.println("Guess random number: ");
        Random random = new Random();
        Integer randomNumber = random.nextInt(10);
        Integer guessNumber = 0;
        do{
            guessNumber =  ScannerUtils.getValue("Enter value: ", Integer.class);

            if ((guessNumber > randomNumber)) {
                System.out.println("Too high, try again");
            } else if (guessNumber<randomNumber) {
                System.out.println("Too low, try again");
            }
        }while (!guessNumber.equals(randomNumber));
        System.out.println("You win!");
    }

    private static void task2() {
        Boolean repeat;
        do {
            Integer a = ScannerUtils.getValue("Enter first number: ", Integer.class);
            Integer b = ScannerUtils.getValue("Enter second number: ", Integer.class);
            System.out.println(a * b);
            repeat = ScannerUtils.getValue("Do you want to repeat set true or false: ", Boolean.class);
        } while (repeat);
        System.out.println("Bye!");
    }
}
