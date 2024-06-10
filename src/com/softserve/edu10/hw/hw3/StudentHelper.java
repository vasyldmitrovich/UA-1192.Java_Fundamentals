package com.softserve.edu10.hw.hw3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StudentHelper extends Student {
    private final Scanner SCANNER = new Scanner(System.in);
    List<Student> studentList = new ArrayList<>();

    public List<Student> createStudList() {
        studentList.add(createStud("Jack", 1));
        studentList.add(createStud("Monica", 1));
        studentList.add(createStud("Alice", 2));
        studentList.add(createStud("Alex", 2));
        studentList.add(createStud("Sarah", 3));
        studentList.add(createStud("Jamie", 3));
        studentList.add(createStud("Stacy", 1));
        studentList.add(createStud("Ethan", 2));
        studentList.add(createStud("Mike", 3));
        studentList.add(createStud("Jack", 3));
        studentList.add(createStud("Josh", 2));
        studentList.add(createStud("Sarah", 1));
        return studentList;
    }

    public void studToString(List<Student> studentList) {
        for (var stud : studentList) {
            System.out.println(stud);
        }
    }

    public Student createStud(String name, int course) {
        return new Student(name, course);
    }

    public void printStudents(List<Student> students, int course) {
        boolean check = false;
        System.out.println("Enter number of course to show students from here: ");
        course = Integer.parseInt(SCANNER.nextLine());
        for (var student : students) {
            if (student.getCourse() == course) {
                check = true;
                System.out.println(student);
            }
        }
        if (!check) {
            System.out.println("There aren't any students on this course:" + course);
        }
    }

    public void sortByName(List<Student> students) {
        Collections.sort(students, new ByName());
        studToString(students);
    }

    public void sortByCourse(List<Student> students) {
        Collections.sort(students, new ByCourse());
        studToString(students);
    }

    public void menu() {
        System.out.println("Choose type of sorting");
        System.out.println("""
                1  Show students
                2. Sort by name
                3. Sort by course
                4. Exit
                """);
    }

    public void appRun(List<Student> students) {
        out:
        while (true) {
            menu();
            int option = scanInput();
            switch (option) {
                case 1 -> studToString(students);
                case 2 -> sortByName(students);
                case 3 -> sortByCourse(students);
                case 4 -> {
                    System.out.println("Exit");
                    break out;
                }
            }
        }
    }

    public int scanInput() {
        int input = Integer.parseInt(SCANNER.nextLine());
        return input;
    }
}
