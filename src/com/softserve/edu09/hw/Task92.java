package com.softserve.edu09.hw;

import java.util.ArrayList;

public class Task92 {

    public static void execute() {
        StudentsOperator sop = new StudentsOperator();
        ArrayList<Student> students = sop.createStudents(8);

        System.out.println("Manipulations with students");
        System.out.printf("Initial list of %d students: %s%n", students.size(), students);
        ArrayList<Student> mod = sop.removePromote(3,students);
        System.out.printf("Modified list of %d students: %s%n", mod.size(), mod);
        System.out.println(sop.printStudents(mod, 3));
    }
}
