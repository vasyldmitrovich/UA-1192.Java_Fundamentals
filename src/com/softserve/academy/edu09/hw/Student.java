package com.softserve.academy.edu09.hw;

import java.util.Map;

public class Student {
    String name;// Make private and add getters and setters and equals hashCode and toString
    String group;
    int course;
    Map<String, Integer> grades;

    public Student(String name, String group, int course, Map<String, Integer> grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    public double getAverageGrade() {
        return grades.values().stream().mapToInt(Integer::intValue).average().orElse(0.0);
    }
}