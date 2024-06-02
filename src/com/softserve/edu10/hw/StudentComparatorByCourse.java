package com.softserve.edu10.hw;

import java.util.Comparator;

public class StudentComparatorByCourse implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.getCourse()-s2.getCourse();
    }
}
