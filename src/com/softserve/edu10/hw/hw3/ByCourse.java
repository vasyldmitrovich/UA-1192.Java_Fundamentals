package com.softserve.edu10.hw.hw3;

import java.util.Comparator;

public class ByCourse implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.getCourse(), s2.getCourse());
    }
}
