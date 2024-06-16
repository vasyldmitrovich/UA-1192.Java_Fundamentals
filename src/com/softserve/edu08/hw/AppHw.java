package com.softserve.edu08.hw;

public class AppHw {

    public static void main(String[] args) {// Ok

        Student student1 = new Student(new FullName("Bob", "Met"), 30, 2);
        Student student2 = new Student(new FullName("Svitlana", "Babiuk"), 33, 1);

        System.out.println("Information about student 1:");
        System.out.println(student1.info());
        System.out.println(student1.activity());
        System.out.println();

        System.out.println("Information about student 2:");
        System.out.println(student2.info());
        System.out.println(student2.activity());
        System.out.println();

        // Cloning student1 and changing the course for the cloned object
        try {
            Student clonedStudent = (Student) student1.clone();
            clonedStudent.course = 4; // Change the course for the cloned student

            // Outputting full information about created students
            System.out.println("Full information about students after cloning:");
            System.out.println("Information about student 1:");
            System.out.println(student1.info());
            System.out.println(student1.activity());
            System.out.println();

            System.out.println("Information about cloned student:");
            System.out.println(clonedStudent.info());
            System.out.println(clonedStudent.activity());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}

