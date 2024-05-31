package com.softserve.edu08.hw08;

public class Student extends Person {
    public Student(FullName fullName, int age) {
        super(fullName, age);
    }

    @Override
    public String activity() {
        return "Studying";
    }

    public static void main(String[] args) {// This method should not be here
        FullName fullName = new FullName("John", "Doe");
        Student student = new Student(fullName, 20);
        System.out.println(student.info());
        System.out.println("Activity: " + student.activity());
    }
}
