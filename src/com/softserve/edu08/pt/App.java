package com.softserve.edu08.pt;

public class App {
    public static void main(String[] args) {
        Department department1 = new Department("SoftServe", "Lviv", "Sadova", 2);

        Department department2 = department1.clone();
        department2.getAddress().setCity("Kyiv");

        System.out.println(department1);
        System.out.println(department2);
    }
}
