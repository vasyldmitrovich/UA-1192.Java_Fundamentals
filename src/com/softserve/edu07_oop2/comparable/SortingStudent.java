package com.softserve.edu07_oop2.comparable;


import java.util.Arrays;

public class SortingStudent {
    public static void main(String[] args) {
        Student[] students = new Student[4];

        students[0] = new Student("Oksana", 28);
        students[1] = new Student("Oksana", 19);
        students[2] = new Student("Bogdan", 42);
        students[3] = new Student("Orest", 17);

        for (Student student : students) {
            System.out.println(student);
        }
        Arrays.sort(students);

        for (Student student : students) {
            System.out.println(student);
        }

    }
}
