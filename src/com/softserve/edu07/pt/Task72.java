package com.softserve.edu07.pt;

import java.util.Arrays;

public class Task72 {

/*
    Realize next structure of classes. In abstract class Person with property name, declare abstract
    method print(). In other extended classes in body of method print() output text “I am a …”. In class Staff
    declare abstract method salary(). In each concrete class create constant TYPE_PERSON. Output type of
    person in each constructor. In main() method create an array of Person and add some Teachers,
    Cleaners and Students. Call method print() for all of it. Call method salary() for all Teachers and Cleaners.
 */

    public static void execute(){
    Person[] persons = new Person[]{
            new Teacher("Mary"),
            new Student("Bob"),
            new Student("Jim"),
            new Cleaner("Harry"),
            new Teacher("Adolf")
    };

        Arrays.stream(persons).forEach(person -> {
            System.out.print("Hi! My name is " + person.name + ". " + person.print() + ". ");
            if(person instanceof Staff){
                System.out.print(((Staff) person).salary());
            }else {
                System.out.print("I have no salary");
            }
            System.out.println();
        });

    }
}
