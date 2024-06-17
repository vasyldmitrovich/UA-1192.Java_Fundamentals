package com.softserve.edu07.pt.pt2;

public class App {
    public static void main(String[] args) {

    Person[] persons = {
            new Teacher("Teacher"),
            new Cleaner("Cleaner"),
            new Student("Student")
    };

        for (var person : persons) {
            person.print();
            if (person instanceof Staff staff) {
                System.out.println("Salary: " + staff.salary());

            }
        }
    }
}







