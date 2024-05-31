package com.softserve.edu08_nest.hw;

public class HWTask2 {
    public static void execute() {
        // Create two instances of the Student class
        FullName fullName1 = new FullName("John", "Doe");
        Student student1 = new Student(fullName1, 20, 1);
        System.out.println(student1.info());
        System.out.println("Activity: " + student1.activity());

        FullName fullName2 = new FullName("Jane", "Smith");
        Student student2 = new Student(fullName2, 22, 2);
        System.out.println(student2.info());
        System.out.println("Activity: " + student2.activity());

        // Clone the first student and change the course
        Student student3 = student1.clone();
        student3.setCourse(3);

        // Output full information about created students
        System.out.println("Cloned and modified student information:");
        System.out.println(student3.info());
        System.out.println("Activity: " + student3.activity());
    }
}
