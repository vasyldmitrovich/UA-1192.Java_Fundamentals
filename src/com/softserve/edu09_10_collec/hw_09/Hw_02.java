package com.softserve.edu09_10_collec.hw_09;

import java.util.ArrayList;
import java.util.Iterator;

public class Hw_02 {
    public static void main(String... args) {
        ArrayList<Student> studentsList = new ArrayList<Student>();

        studentsList.add(new Student("Anastasiia", 1, 2, 5));
        studentsList.add(new Student("Anna", 1, 2, 4));
        studentsList.add(new Student("Roman", 2, 3, 3));
        studentsList.add(new Student("Tom", 3, 4, 2));
        studentsList.add(new Student("Max", 3, 4, 1));

        removesStudents(studentsList);
        printStudents(studentsList, 2);

    }

    public static void removesStudents(ArrayList<Student> studentsList) {
        Iterator<Student> iterator = studentsList.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            int grade = student.getGrades();
            if (grade < 3) {
                iterator.remove();
            } else {
                student.setCourse(student.getCourse() + 1);
            }
        }
    }

    public static void printStudents(ArrayList<Student> studentsList, int course) {
        for (Student student : studentsList) {
            if (student.getCourse() == course) {
                System.out.println("Students who are enrolled in the course 2: " + student.getName());

            }
        }
    }
}
