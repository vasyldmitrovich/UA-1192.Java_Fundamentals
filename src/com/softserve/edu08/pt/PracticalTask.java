package com.softserve.edu08.pt;


public class PracticalTask {

    public void task1() throws CloneNotSupportedException {// Ok

        Department department1 = new Department("Innovative", "Vinnytsia", "Soborna", 23);

        Department department2 = (Department) department1.clone();
        department2.getAddress().setCity("LVIV");
        System.out.println(department1);
        System.out.println(department2);
    }
}

