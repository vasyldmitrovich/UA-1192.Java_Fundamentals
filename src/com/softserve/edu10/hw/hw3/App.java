package com.softserve.edu10.hw.hw3;

import java.util.List;

public class App {
    public static void main(String[] args) {// Ok
        StudentHelper studentHelper = new StudentHelper();
        List<Student> studentList = studentHelper.createStudList();
        studentHelper.studToString(studentList);
        studentHelper.printStudents(studentList, 3);
        studentHelper.appRun(studentList);
    }
}
