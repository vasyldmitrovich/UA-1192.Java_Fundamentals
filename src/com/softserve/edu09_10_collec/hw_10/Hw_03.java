package com.softserve.edu09_10_collec.hw_10;

import java.util.ArrayList;
import java.util.Collections;

import static com.softserve.edu09_10_collec.hw_10.Student.printStudents;

public class Hw_03 {
    public static void main(String... args) {

        ArrayList<Student> studentList = new ArrayList<>();

        studentList.add(new Student("Ivan", 1));
        studentList.add(new Student("Taras", 1));
        studentList.add(new Student("Roman", 2));
        studentList.add(new Student("Oleksandr", 3));
        studentList.add(new Student("Pavlo", 4));

        printStudents(studentList, 2);

        Collections.sort(studentList);
        System.out.println("Sorted by name:");
        for (Student student : studentList) {
            System.out.println(student.getName() + " : Course " + student.getCourse());
        }

        Collections.sort(studentList, Student.compareByCourse());
        System.out.println("Sorted by course:");
        for (Student student : studentList) {
            System.out.println(student.getName() + " : Course " + student.getCourse());
        }
    }
}

