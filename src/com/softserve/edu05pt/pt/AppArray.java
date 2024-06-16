package com.softserve.edu05pt.pt;

import java.util.*;

public class AppArray {// This class is ok
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        pt2();
        pt3();


        Employee emp1 = new Employee("John", 1, 50000);
        Employee emp2 = new Employee("Alice", 2, 60000);
        Employee emp3 = new Employee("Bob", 1, 55000);
        Employee emp4 = new Employee("Emma", 3, 48000);
        Employee emp5 = new Employee("David", 2, 62000);

        // Додавання об'єктів до списку
        List<Employee> employees = new ArrayList<>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);
        employees.add(emp5);

        // Створення сканера для введення даних з консолі
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть номер відділу: ");
        int department = scanner.nextInt();
        System.out.println("Працівники відділу " + department + ":");

        // Виведення працівників з вказаного відділу
        for (Employee employee: employees) {
            if (employee.getDepartmentNumber() == department) {
                System.out.println(employee.getName() + " - $" + employee.getSalary());
            }
            // Сортування працівників за зарплатою в порядку спадання
            Collections.sort(employees, Comparator.comparingDouble(Employee::getSalary).reversed());
            System.out.println("\nПрацівники, впорядковані за заробітною платою в порядку спадання:");
            for (Employee emp : employees) {
                System.out.println(emp.getName() + " - $" + emp.getSalary());
            }

        }


        String[] names = {"Bob", "Elizabet", "Mary", "Tom", "Marly" };
        System.out.println(Arrays.toString(names));
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        double[] numbers = {4, 5, 8, 2.5, 6};
        double summa = 0;
        for (double number : numbers) {
            summa += number;

        }
        double average = summa / numbers.length;
        System.out.println("The average value is:" + average);

        System.out.println("Enter name to search:");
        String nameToSearch = scanner.nextLine();
        boolean found = false;
        for (var name : names) {
            if (name.equals(nameToSearch)) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("The name'" + nameToSearch + "'is on the list");
        } else {
            System.out.println("The name'" + nameToSearch + "'Is not found in the array");
        }

        int ix = Arrays.binarySearch(names, nameToSearch);


    }


    public static void pt2() {
        System.out.println("Enter a number:");
        int number = scanner.nextInt();
        if (isPrime(number)) {
            System.out.println("The number" + number + "Is prime");
        } else {
            System.out.println("The number" + number + "'Is not prime");
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        if (number <= 3) {
            return true;
        }
        if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= number; i = i + 6) {
            if ((number % i == 0 || number % (i + 2) == 0)) {
                return false;
            }
        }
        return true;
    }

    public static void pt3(){
        int [] number = new int[10];
        Random random =new Random();
        for ( int i=0; i<number.length;i++) {
            number[i] = random.nextInt();
        }

            int max=Integer.MIN_VALUE;
            int[] numbers;
            for (int num: number) {
                if (num > max) {
                    max = num;
                }
            }
                System.out.println("The biggest number in the array is: " + max);
            int sumOfPositives =0;
            int negativeCount=0;
            for (int num :number){
                if (num > 0) {
                    sumOfPositives += num; // Add to sum if positive
                } else if (num < 0) {
                    negativeCount++; // Increment count if negative
                }
            }
            System.out.println("The sum of positive numbers is: " + sumOfPositives);
            System.out.println("The count of negative numbers is: " + negativeCount);
            if (negativeCount > number.length / 2) {
                System.out.println("There are more negative values in the array.");
            } else if (negativeCount < number.length / 2) {
                System.out.println("There are more positive values in the array.");
            } else {
                System.out.println("There are an equal number of positive and negative values in the array.");
            }
        }
    }


