package com.softserve.edu08.pt;

public class App {
    public static void main(String[] args) {// Good
        System.out.println("Demonstrate task 1");
        task1();
    }

    public static void task1() {
        Department.Address address = new Department.Address("Lviv", "Rynkova", 22);
        Department department = new Department("Department-1", address);

        Department.Address newAddress = new Department.Address("Kyiv", "Rynkova", 22);
        Department departmentClone = department.clone();
        departmentClone.setAddress(newAddress);

        System.out.println("Department before cloning: " + department);
        System.out.println("Department after cloning: " + departmentClone);


    }
}
