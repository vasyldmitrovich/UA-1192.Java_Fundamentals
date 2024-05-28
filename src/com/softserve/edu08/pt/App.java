package com.softserve.edu08.pt;

public class App {
    public static void main(String[] args) throws CloneNotSupportedException {
        Department department1 = new Department("Police Dept", "Oklahoma", "42A-Street", 1);
        System.out.println(department1);
        Department department2 = (Department) department1.clone();
        System.out.println(department2);
        department2.setName("SoftServe");
        department2.getAdress().sets("Florida", "12800 University Drive " +
                "Fort Myers, FL 33907", 2);
        System.out.println(department2);

    }
}
