package com.softserve.edu08.hwork;

import java.util.Scanner;

public class AppHw {
    public static void main(String[] args) throws CloneNotSupportedException {// All is good
        FullName nameStudent1 = new FullName("Anastasia", "Rakuta");
        Student student1 = new Student(nameStudent1, 22, 2);

        FullName nameStudent2 = new FullName("Alla", "Plastyn");
        Student student2 = new Student(nameStudent2, 20, 3);

        Student student3 = (Student) student1.clone();
        student3.setCourse(1);

        System.out.println(student1.info() + "\n" + student1.activity());
        System.out.println(student2.info() + "\n" + student2.activity());
        System.out.println(student3.info() + "\n" + student3.activity());
    }
}
