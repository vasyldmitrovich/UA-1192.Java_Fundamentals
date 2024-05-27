package com.softserve.edu08.pt;

import java.util.Scanner;

public class App {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {// Nice
        System.out.println("Enter the name for your department");
        String name = sc.nextLine();
        System.out.println("Enter the city for your department");
        String city = sc.nextLine();
        System.out.println("Enter the street for your department");
        String street = sc.nextLine();
        System.out.println("Enter the number of building for your department");
        try {
            int building = sc.nextInt();
            sc.nextLine();
            Department department = new Department(name, new Department.Address(city, street, building));
            System.out.println(department.toString());// Do not need to string
            changeCity(department);
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

    public static void changeCity (Department department) throws CloneNotSupportedException {
        System.out.println("Enter the city for your cloned department");
        String newCity = sc.nextLine();
        Department clonedDepartment = department.clone();
        clonedDepartment.getAddress().setCity(newCity);
        System.out.println("Changed department is " + clonedDepartment.toString());
    }
}
