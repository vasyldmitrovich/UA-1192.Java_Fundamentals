package com.softserve.edu05.hw;

import com.softserve.edu05.pt.Task1;

import java.util.*;

public class App {
    public static void main(String[] args) {
        System.out.println("Start");

        //Task1
        Task1.task1();

        //Task2
        Task2.task2();

        //Task3
        Task3();
    }

    public static void Task3() {// name of method should start from lowercase
        class Car {// Move to file Car.java
            String type;// Make fields private
            int year;
            double engineVolume;

            // Add constructor without parameters

            public Car(String type, int year, double engineVolume) {
                this.type = type;
                this.year = year;
                this.engineVolume = engineVolume;
            }

            // Getters and setters equals and hashCode

            public String toString() {
                return "Type: " + type + ", Year: " + year + ", Engine Volume: " + engineVolume;
            }
        }

        class Main {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);


                Car car1 = new Car("Sedan", 2018, 2.0);
                Car car2 = new Car("SUV", 2015, 3.5);
                Car car3 = new Car("Hatchback", 2020, 1.6);
                Car car4 = new Car("Coupe", 2010, 2.5);


                List<Car> cars = new ArrayList<>();
                cars.add(car1);
                cars.add(car2);
                cars.add(car3);
                cars.add(car4);


                System.out.print("enter year for output of cars: ");
                int yearInput = scanner.nextInt();


                System.out.println("cars " + yearInput + " year:");
                for (Car car : cars) {
                    if (car.year == yearInput) {
                        System.out.println(car);
                    }
                }


                Collections.sort(cars, Comparator.comparingInt(car -> car.year));


                System.out.println("sorted cars for year:");
                for (Car car : cars) {
                    System.out.println(car);

                }
            }
        }
    }
}