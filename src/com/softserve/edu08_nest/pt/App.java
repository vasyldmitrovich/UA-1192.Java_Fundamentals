package com.softserve.edu08_nest.pt;

public class App {
    public static void main(String[] args) throws CloneNotSupportedException {
        Department department = new Department("HR people department", "Lviv", "Chervona kalyna avenue", 104);

        Department copyOfDepartment = (Department) department.clone();

        System.out.println("Original department: " + department.getName() + ", " + department.getAddress().getCity() +
                ", " + department.getAddress().getCity() +
                ", " + department.getAddress().getStreet() +
                ", " + department.getAddress().getBuilding_number());

        copyOfDepartment.getAddress().setCity("Kyiv");
        System.out.println("Cloned department: " + copyOfDepartment.getName() + ", " + copyOfDepartment.getAddress().getCity() +
                ", " + copyOfDepartment.getAddress().getStreet() +
                ", " + copyOfDepartment.getAddress().getBuilding_number());

    }


}
