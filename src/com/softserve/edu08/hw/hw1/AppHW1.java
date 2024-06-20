package com.softserve.edu08.hw.hw1;

public class AppHW1 {
    public static void main(String[] args) throws CloneNotSupportedException {// Good
        Student student1 = new Student(new FullName("Andrew", "Tandyriak"), 29);
        Student student2 = new Student(new FullName("Student", "two"), 24);
        Student student3 = (Student) student2.clone();

        System.out.println(student1.info());
        System.out.println(student2.info());
        System.out.println(student3.info());

    }
}
