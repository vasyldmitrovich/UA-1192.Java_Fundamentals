package com.softserve.edu08.pt;

import java.util.Random;

public class App {

    private static final Random RAND = new Random(System.currentTimeMillis());
    private static final String[] STREETS = {"Street A", "Street B", "Street C", "Street D"};
    private static final String[] CITIES = {"City A", "City B", "City C", "City D"};

    public static void main(String[] args) {
        Department[] departments = new Department[4];
        departments[0] = generateDepartment();

        try {
            for (int i = 1; i < departments.length; i++) {
                departments[i] = departments[0].clone();
                departments[i].changeCity(CITIES[RAND.nextInt(CITIES.length)]);
            }
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        for (Department department : departments) {
            if (department != null) {
                System.out.println(department);
            }
        }
    }

    private static Department generateDepartment() {
        Department department = new Department("dep");
        String city = CITIES[RAND.nextInt(CITIES.length)];
        String street = STREETS[RAND.nextInt(STREETS.length)];
        int buildingNumber = RAND.nextInt(100) + 1;
        department.setAddress(city, street, buildingNumber);
        return department;
    }
}
