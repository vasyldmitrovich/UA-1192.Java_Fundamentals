package com.softserve.edu09.hw;

import java.util.*;

public class StudentMethods extends Student {// Nice
    private static final Random RANDOM = new Random();
    private static final Scanner SCANNER = new Scanner(System.in);
    private final String GAP = "-".repeat(60);
    private final String NL = "\n";

    public void oneStudToString(Student student) {
        System.out.println(NL + GAP + NL + "Student:" + NL +
                "Name: " + student.getName() + NL +
                "Group: " + student.getGroup() + NL +
                "Course: " + student.getCourse() + NL +
                "Grades: " + Arrays.toString(student.getGrades()) + NL +
                GAP);
    }

    public void studToString(List<Student> students) {
        for (var i : students) {
            System.out.println(NL + GAP + NL + "Student:" + NL +
                    "Name: " + i.getName() + NL +
                    "Group: " + i.getGroup() + NL +
                    "Course: " + i.getCourse() + NL +
                    "Grades: " + Arrays.toString(i.getGrades()) + NL +
                    GAP);
        }
    }

    public List<Student> crateStudList() {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Jack", "12A", 1, createGrades()));
        studentList.add(new Student("Melissa", "12B", 1, createGrades()));
        studentList.add(new Student("Kareem", "12C", 1, createGrades()));
        studentList.add(new Student("Sarah", "12A", 1, createGrades()));
        studentList.add(new Student("Dave", "12B", 1, createGrades()));
        return studentList;
    }

    public int[] createGrades() {
        int[] grades = new int[5];
        for (int i = 0; i < grades.length; i++) {
            grades[i] = RANDOM.nextInt(1, 6);
        }
        return grades;
    }

    public double findAverage(int[] array) {
        double sum = 0;
        for (var i : array) {
            sum += i;
        }
        return sum / array.length;
    }

    public void studCheck(List<Student> arraylist) {
        for (int i = 0; i < arraylist.size(); i++) {
            if (findAverage(arraylist.get(i).getGrades()) >= 3) {
                arraylist.get(i).setCourse(arraylist.get(i).getCourse() + 1);
                System.out.println(GAP + NL + "Student " + arraylist.get(i).getName() + " will join to "
                        + arraylist.get(i).getCourse() + " course!" + NL +
                        "The average grade of student is: " + findAverage(arraylist.get(i).getGrades()) + NL + GAP);
            } else {
                System.out.println(GAP + NL + "Student " + arraylist.get(i).getName() + " has left :(" +
                        NL + "The average grade of student is: " + findAverage(arraylist.get(i).getGrades()) + NL + GAP);
                arraylist.remove(i);
                i--;
            }
        }
    }

    public void printStudents(List<Student> students, int course) {
        boolean check = false;
        do {
            System.out.println("Input number of course:");
            course = SCANNER.nextInt();
            if (course != students.getFirst().getCourse()) {
                System.out.printf(GAP + NL + "There aren't students on %d course%n%s%n", course, GAP);
            } else {
                check = true;
                System.out.printf(GAP + NL + "Students from %d course:", course);
            }
        } while (!check);
        for (var i : students) {
            if (i.getCourse() == course) {
                oneStudToString(i);
            }
        }
    }

    @Override
    public String toString() {
        return NL + GAP + NL + "Student:" + NL +
                "Name: " + getName() + NL +
                "Group: " + getGroup() + NL +
                "Course: " + getCourse() + NL +
                "Grades: " + Arrays.toString(getGrades()) + NL +
                GAP;
    }
}
