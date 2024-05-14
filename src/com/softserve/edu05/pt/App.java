package com.softserve.edu05.pt;

import java.util.*;

public class App {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {// In general all is good
        practicalTask1();
        System.out.println("End of the first task");

        practicalTask2();
        System.out.println("End of the second task");

        practicalTask3();
        System.out.println("End of the third task");
        sc.nextLine();

        practicalTask4();
        System.out.println("End of the fourth task");
    }

    public static void practicalTask1 () {
        String [] strings = sortArray();
        System.out.println("End of the first subtask");

        averageValue();
        System.out.println("End of the second subtask");

        sc.nextLine();
        searchString(strings);
        System.out.println("End of the third subtask");

    }

    public static String [] sortArray () {
        List<String> stringList = new ArrayList<>();
        boolean stop = true;
        String line = "";

        while (stop) {
            System.out.println("Enter the string. Enter stop if you want to end");
            line = sc.nextLine();
            if (line.equals("stop")) {
                stop = false;
            } else {
                stringList.add(line);
            }
        }

        String [] stringArray = stringList.toArray(new String[0]);
        Arrays.sort(stringArray);
        System.out.println(Arrays.toString(stringArray));

        return stringArray;
    }

    public static void averageValue () {
        int [] numbers = new int[5];
        int count = 0;

        while (count != 5) {
            System.out.println("Enter the number");
            try {
                numbers[count] = sc.nextInt();
                count++;
            } catch (Exception e) {
                System.out.println("Error");
                System.exit(0);
            }
        }

        double average = (double) (numbers[0] + numbers[1] + numbers [2] + numbers[3] + numbers[4])/5;
        System.out.println("Average value is " + average);
    }

    public static void searchString (String [] strings) {
        System.out.println("Enter the string which you want to find in the array from the first subtask");
        String find = sc.nextLine();

        for (int i = 0; i < strings.length; i++) {
            if (find.equals(strings[i])) {
                System.out.println("The appropriate string is at position " + i + " in the array");
                System.exit(0);
            }
        }

        System.out.println("There is no appropriate string in the array");
    }

    public static void practicalTask2 () {
        System.out.println("Enter the positive integer");

        try {
            int number = sc.nextInt();

            if (number < 0) {
                System.out.println("You enter negative integer");
                System.exit(0);
            }

            if (number == 0 || number == 1) {
                System.out.println(number + " is not prime number");
            } else {
                int m = number/2;
                for (int i = 2; i <= m; i++) {
                    if (number % i == 0) {
                        System.out.println(number + " is not prime number");
                    } else {
                        System.out.println(number + " is prime number");
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

    public static void practicalTask3 () {
        int [] array = new int[10];

        for (int i = 0; i < 10; i++) {
            array [i] = -100 + (int) (Math.random() * ((100 - (-100)) + 1));
        }

        System.out.println(Arrays.toString(array));

        biggestNumber(array);
        System.out.println("End of the first subtask");

        sumOfPositiveNumbers(array);
        System.out.println("End of the second subtask");

        valuesInArray(array);
        System.out.println("End of the fourth subtask");
    }

    public static void biggestNumber (int [] array) {
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.println("The biggest number of the array is " + max);
    }

    public static void sumOfPositiveNumbers (int [] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                sum += array[i];
            }
        }

        System.out.println("The sum of positive numbers of the array is " + sum);
    }

    public static void valuesInArray (int [] array) {
       int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                count++;
            }
        }

        System.out.println("The number of negative values in the array is " + count);
        System.out.println("End of the third subtask");

        if (array.length - count < 5) {
            System.out.println("There are more negative values in the array");
        } else if (array.length - count > 5) {
            System.out.println("There are more positive values in the array");
        } else {
            System.out.println("There are an equal number of positive and negative values in the array");
        }
    }


    public static void practicalTask4 () {
        Employee employee1 = new Employee();
        Employee [] employees = new Employee [5];
        employees [0] = employee1;
        int count = 0;

        while (count != 4) {
            int numberOfDepartment = 0;
            int salary = 0;
            System.out.println("Enter the name for employee");
            String name = sc.nextLine();
            System.out.println("Enter the number of department for your employee");
            try {
                numberOfDepartment = sc.nextInt();
                System.out.println("Enter the salary of your employee");
                salary = sc.nextInt();
                sc.nextLine();
            } catch (Exception e) {
                System.out.println("Error");
                System.exit(0);
            }
            employees [count + 1] = new Employee(name,numberOfDepartment, salary);
            count++;
        }

        findEmpThroughDep(employees);
        System.out.println("End of the first subtask");

        sortBySalary(employees);
        System.out.println("End of the second subtask");
    }

    public static void findEmpThroughDep (Employee [] employees) {// Too long name of method
        System.out.println("Enter the number of department");
        try {
            int number = sc.nextInt();
            for (int i = 0; i < employees.length; i++) {
                if (number == employees[i].getDepartmentNumber()) {
                    System.out.println(employees[i].toString());
                }
            }
        }catch (Exception e) {
            System.out.println("Error");
        }
    }

    public static void sortBySalary (Employee [] employees) {
        for (int i = 0; i < employees.length; i++) {
            for (int j = i + 1; j < employees.length; j++) {
                Employee temp;
                if (employees[i].getSalary() <= employees[j].getSalary()) {
                    temp = employees[j];
                    employees[j] = employees[i];
                    employees[i] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(employees));
    }
}
