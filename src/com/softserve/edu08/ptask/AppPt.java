package com.softserve.edu08.ptask;

import java.io.IOException;
import java.util.Scanner;

public class AppPt {
    public static void main(String[] args) throws CloneNotSupportedException {
        Department department = new Department("IT Department", "Kyiv", "Khreshchatyk street", 2);
        Department copyOfDepartment = (Department) department.clone();

        System.out.println("Original department: " + department.getName() +
                ", " + department.getAddress().getCity() +
                ", " + department.getAddress().getStreet() +
                ", " + department.getAddress().getBuilding_number());

        copyOfDepartment.getAddress().setCity("Berlin");

        System.out.println("Cloned department: " + copyOfDepartment.getName() +
                ", " + copyOfDepartment.getAddress().getCity() +
                ", " + copyOfDepartment.getAddress().getStreet() +
                ", " + copyOfDepartment.getAddress().getBuilding_number());
    }
}

