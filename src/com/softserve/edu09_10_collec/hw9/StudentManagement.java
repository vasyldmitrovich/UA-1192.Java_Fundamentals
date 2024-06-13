package com.softserve.edu09_10_collec.hw9;

import java.util.ArrayList;
import java.util.List;

public class StudentManagement {

    public void removeUnderperformingStudents(List<Student> students) {
        List<Student> toRemove = new ArrayList<>();

        for (Student student : students) {
            if (student.calculateAverageGrade() < 3.0) {
                toRemove.add(student);
            } else {
                student.promoteToNextCourse();
            }
        }

        students.removeAll(toRemove);
    }

    public void printStudents(List<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public void printStudents(List<Student> students, int course) {
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }
}

