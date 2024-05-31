package com.softserve.edu10.hw10;

import java.util.*;

class Student implements Comparable<Student> {
    private String name;
    private int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    public static void printStudents(List<Student> students, int courseNumber) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getCourse() == courseNumber) {
                System.out.println(student.getName());
            }
        }
    }

    @Override
    public int compareTo(Student other) {
        return this.name.compareTo(other.getName());
    }
}

class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Alice", 101));
        students.add(new Student("Bob", 102));
        students.add(new Student("Charlie", 101));
        students.add(new Student("David", 103));
        students.add(new Student("Emma", 102));

        System.out.println("Students sorted by name:");
        Collections.sort(students);
        for (Student student : students) {
            System.out.println(student.getName());
        }

        System.out.println("\nStudents sorted by course:");
        students.sort(Comparator.comparingInt(Student::getCourse));
        for (Student student : students) {
            System.out.println(student.getName() + " - Course: " + student.getCourse());
        }

        System.out.println("\nStudents enrolled in course 101:");
        Student.printStudents(students, 101);
    }
}
