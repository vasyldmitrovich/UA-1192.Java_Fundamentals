package com.softserve.edu07_oop2.comporator;

import java.util.Arrays;

public class SortingStudent {
    public static void main(String[ ] args) {
        Student[] students = new Student[6];

        students[0] = new Student("Oksana", 28);
        students[1] = new Student("Oksana", 25);
        students[2] = new Student("Bogdan",25);
        students[3] = new Student("Bogdan",42);
        students[4] = new Student("Orest",27);
        students[5] = new Student("Orest",17);

        System.out.println(Arrays.toString(students));
        Arrays.sort(students, new Student());
        System.out.println(Arrays.toString(students));

    }
}