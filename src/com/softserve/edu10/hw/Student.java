package com.softserve.edu10.hw;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

class Student {
    private String name;
    private int course;


    // Конструктор з параметрами
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

    public void setName(String name) {
        this.name = name;
    }

    public void setCourse(int course) {
        this.course=course;
    }

    public static void printStudents(List<Student> students, int course) {

        Iterator<Student> iterator = students.iterator();

        System.out.println("Students enrolled in Course " + course + ":");

        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }

    }

        // Метод для порівняння студентів за ім'ям
        public static Comparator<Student> compareByName () {
            return Comparator.comparing(Student::getName);
        }

        // Метод для порівняння студентів за курсом
        public static Comparator<Student>compareByCourse () {
            return Comparator.comparingInt(Student::getCourse);
        }
    @Override
    public String toString() {
        return "Student{name='" + name + "', course=" + course + "}";
    }
    }

