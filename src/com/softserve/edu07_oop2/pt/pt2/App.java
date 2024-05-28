package com.softserve.edu07_oop2.pt.pt2;
import java.util.Arrays;
public class App {

    public static void main(String[] args) {
        execute();
    }

    public static void execute() {
        Person[] persons = new Person[]{
                new Teacher("Mary"),
                new Student("Bob"),
                new Student("Jim"),
                new Cleaner("Harry"),
                new Teacher("Adolf")
        };

        for (Person person : persons) {
            System.out.print("Type of person: ");
            if (person instanceof Teacher) {
                System.out.println("Teacher");
            } else if (person instanceof Cleaner) {
                System.out.println("Cleaner");
            } else if (person instanceof Student) {
                System.out.println("Student");
            }
            System.out.print("Hi! My name is " + person.name + ". " + person.print() + ". ");
            if (person instanceof Staff) {
                System.out.print(((Staff) person).salary());
            } else {
                System.out.print("I have no salary");
            }
            System.out.println();
        }
    }
}





