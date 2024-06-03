package com.softserve.edu10.hw;

import java.util.Comparator;

public class StudentComparatorByName implements Comparator<Student> {// Make this class inner in Student
    @Override
    public int compare(Student s1, Student s2) {
        return s1.getFirstName().compareTo(s2.getFirstName());
    }
}

