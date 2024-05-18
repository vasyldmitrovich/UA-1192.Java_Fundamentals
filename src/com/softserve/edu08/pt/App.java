package com.softserve.edu08.pt;

public class App {
    public static void main(String[] args) {
        task1();
    }

    public static void task1() {
        Department.Address address = new Department.Address("Lviv", "Rynkova", 22);
        Department department = new Department("Department-1", address);

        Department departmentClone = department.clone();
        Department.Address addressClone = address.clone();
        addressClone.setCity("Kyiv");
        departmentClone.setAddress(addressClone);

        System.out.println("Department before cloning: " + department);
        System.out.println("Department after cloning: " + departmentClone);


    }
}
