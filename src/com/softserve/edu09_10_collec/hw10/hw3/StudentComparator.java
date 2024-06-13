package com.softserve.edu09_10_collec.hw10.hw3;

import java.util.Comparator;

public class StudentComparator {

    // Comparator to compare students by name
    public static class CompareByName implements Comparator<Student> {
        @Override
        public int compare(Student s1, Student s2) {
            return s1.getName().compareTo(s2.getName());
        }
    }

    // Comparator to compare students by course
    public static class CompareByCourse implements Comparator<Student> {
        @Override
        public int compare(Student s1, Student s2) {
            return Integer.compare(s1.getCourse(), s2.getCourse());
        }
    }
}

