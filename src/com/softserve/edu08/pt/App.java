package com.softserve.edu08.pt;

public class App {

    public static void main(String[] args) throws CloneNotSupportedException {

        Department department = new Department("ІТ", "Chernivtsi", "Karmelyuka street", 67);
        Department copyOfDepartment = (Department) department.clone();

        System.out.println("Original department: " + department.getName() +
                ", " + department.getAddress().getCity() +
                ", " + department.getAddress().getStreet() +
                ", " + department.getAddress().getBuilding_number());

        copyOfDepartment.getAddress().setCity("Lviv");

        System.out.println("Cloned department: " + copyOfDepartment.getName() +
                ", " + copyOfDepartment.getAddress().getCity() +
                ", " + copyOfDepartment.getAddress().getStreet() +
                ", " + copyOfDepartment.getAddress().getBuilding_number());
    }


}



