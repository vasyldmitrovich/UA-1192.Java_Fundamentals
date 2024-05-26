package com.softserve.edu08.pt;

public class App {
    public static void main(String[] args) {
       Department.Address address1 = new Department.Address("Kyiv", "Bankova", 110);
       Department department1 = new Department("dep1", address1);

       Department.Address address2 = new Department.Address("Odesa", "Naberezhna", 20);
       Department cloniedDep = department1.clone();
       cloniedDep.setAddress(address2);

        System.out.println(department1);
        System.out.println(cloniedDep);
       
    }
}
