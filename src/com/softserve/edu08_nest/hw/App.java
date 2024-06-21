package com.softserve.edu08_nest.hw;

public class App {
    public static void main(String[] args) throws CloneNotSupportedException {// Ok
        FullName nameStudent1 = new FullName("Anastasia", "Teliatnyk");
        Student student1 = new Student(nameStudent1, 25, 2);
        System.out.println(student1.info() + "\n" + student1.activity());

        FullName nameStudent2 = new FullName("Oleksandr", "Teliatnyk");
        Student student2 = new Student(nameStudent2, 23, 1);
        System.out.println(student2.info() + "\n" + student2.activity());

        Student student3 = (Student) student1.clone();
        student3.setCourse(3);
        System.out.println("The copy of the first student: " + student1.info() + "\n" + student1.activity());


    }
}
