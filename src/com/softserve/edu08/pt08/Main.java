package com.softserve.edu08.pt08;

public class Main {
    public static void main(String[] args) {
        try {
            Address address1 = new Address("New York", "5th Avenue", 101);
            Department dept1 = new Department("Human Resources", address1);

            Department dept2 = (Department) dept1.clone();
            dept2.getAddress().setCity("San Francisco");

            System.out.println(dept1);
            System.out.println(dept2);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
