package com.softserve.academy.edu08.pt;

public class App {

    public static void main(String[] args) {
        task1();
    }

    public static void task1() {
        System.out.println("Task 1:" +
                "        Create a class called Department that contains a name field of String type and an address\n" +
                "field of Address type.\n"  +
                " In the Department class, create an inner class called Address with has city and street\n" +
                "fields of String type and building field of type int.\n" +
                " In main() method, create an instance for one department and initialize it.\n" +
                " Then, create one more department by cloning previously created department and change\n" +
                "the city for this object.\n" +
                " Output information about all departments to the console.\n");


        Department department1 = new Department("IT", null);
        Department.Address address1 = department1.new Address("New York", "Wall Street", 10);
        department1.setAddress(address1);

        Department department2 = department1.clone();
        department2.getAddress().setCity("San Francisco");

        System.out.println(department1);
        System.out.println(department2);
    }
}
