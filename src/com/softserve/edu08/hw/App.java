package com.softserve.edu08.hw;

import java.util.Scanner;

public class App {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {// Good
        Student [] students = new Student[3];
        System.out.println("Enter the first name for your student");
        String firstName = sc.nextLine();
        System.out.println("Enter the last name for your student");
        String lastName = sc.nextLine();
        System.out.println("Enter the age for your student");

        try {
            int age = sc.nextInt();
            System.out.println("Enter the course for your student");
            int course = sc.nextInt();
            sc.nextLine();
            Student student1 = new Student(new FullName(firstName, lastName), age, course);
            students [0] = student1;
            students [1] = new Student();
            students [2] = changeCourse(student1);

            for (Student item: students) {
                System.out.println(item.info());
                System.out.println(item.activity());
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

    public static Student changeCourse(Student student) throws CloneNotSupportedException {
        Student student2 = student.clone();
        System.out.println("Enter changed course for your student");
        try {
            student2.setCourse(sc.nextInt());
        } catch (Exception e) {
            System.out.println("Error");
        }
        return student2;
    }
}
