package com.softserve.edu10.hw;

import java.util.*;
import java.util.stream.Collectors;

public class Student {
    private String name;
    private int course;

    public Student(){}

    public Student(String name, int course){
        this.name=name;
        this.course=course;
    }

    //Using stream api
    public static String printStudents(int course, List<Student> students){
        if(students == null) return "Students list is missing";
        if (students.isEmpty()) return "Students list is empty";

        return students.stream().filter(student -> student.getCourse() == course).map(Student::getName).collect(Collectors.joining(", "));
    }

    //Using iterator
//    public static String printStudents(int course, List<Student> students){
//        if(students == null) return "Students list is missing";
//        if (students.isEmpty()) return "Students list is empty";
//
//        List<Student> filtered = new ArrayList<>();
//
//        Iterator<Student> iterator = students.iterator();
//        while (iterator.hasNext()){
//            Student current = iterator.next();
//            if(current.getCourse() == course){
//                filtered.add(current);
//            }
//        }
//
//        return filtered.toString();
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public static Comparator<Student> compareByName(){
        return Comparator.comparing(Student::getName);
    }

    public static Comparator<Student> compareByCourse(){
        return Comparator.comparing(Student::getCourse);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, course);
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Course: " + course;
    }
}
