package com.softserve.edu10.hw.hw3;

import java.util.Comparator;

public class ByName implements Comparator<Student> {// Make inner
    @Override
    public int compare(Student s1, Student s2) {
        return s1.getName().compareTo(s2.getName());
    }
}
