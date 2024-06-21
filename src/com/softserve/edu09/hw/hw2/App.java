package com.softserve.edu09.hw.hw2;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        List<Integer> grades1 = new ArrayList<>();
        grades1.add(4);
        grades1.add(3);
        grades1.add(4);
        Student student1 = new Student("Student1", "Group A", 1, grades1);
        students.add(student1);

        List<Integer> grades2 = new ArrayList<>();
        grades2.add(2);
        grades2.add(3);
        grades2.add(3);
        Student student2 = new Student("Student2", "Group B", 1, grades2);
        students.add(student2);

        List<Integer> grades3 = new ArrayList<>();
        grades3.add(3);
        grades3.add(6);
        grades3.add(1);
        Student student3 = new Student("Student3", "Group A", 2, grades3);
        students.add(student3);

        System.out.println("All students:");
        for (Student student : students) {
            System.out.println(student.getName() + ", Course: " + student.getCourse() + ", Avg Grade: " + student.calculateAverageGrade());
        }

        List<Student> studentsToRemove = new ArrayList<>();
        for (Student student : students) {
            if (student.calculateAverageGrade() < 3) {
                studentsToRemove.add(student);
            } else {
                student.promoteToNextCourse();
            }
        }
        students.removeAll(studentsToRemove);

        System.out.println("\nStudents after removing and promoting:");
        for (Student student : students) {
            System.out.println(student.getName() + ", Course: " + student.getCourse() + ", Avg Grade: " + student.calculateAverageGrade());
        }

        int courseToPrint = 1;
        System.out.println("\nStudents in course " + courseToPrint + ":");
        printStudents(students, courseToPrint);
    }

    public static void printStudents(List<Student> students, int course) {
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }
}
