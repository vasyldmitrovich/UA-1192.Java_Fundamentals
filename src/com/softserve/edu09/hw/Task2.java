package com.softserve.edu09.hw;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

class Task2 {
    private String name;
    private String group;
    private int course;
    private List<Integer> grades;

    public Task2(String name, String group, int course, List<Integer> grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public int getCourse() {
        return course;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public double averageGrade() {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }

    public void advanceCourse() {
        this.course++;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', group='" + group + "', course=" + course + ", grades=" + grades + "}";
    }
}
class Main {
    public static void main(String[] args) {

        ArrayList<Task2> students = new ArrayList<>();

        students.add(new Task2("Ivan", "Group 1", 1, List.of(4, 3, 4)));
        students.add(new Task2("Tasia", "Group 1", 1, List.of(2, 3, 2)));
        students.add(new Task2("Andriy", "Group 2", 2, List.of(3, 4, 3)));
        students.add(new Task2("Alina", "Group 2", 2, List.of(5, 5, 5)));

        removeLowGradesStudents(students);

        printStudents(students, 2);
    }

    public static void removeLowGradesStudents(ArrayList<Task2> students) {
        Iterator<Task2> iterator = students.iterator();
        while (iterator.hasNext()) {
            Task2 student = iterator.next();
            if (student.averageGrade() < 3) {
                iterator.remove();
            } else {
                student.advanceCourse();
            }
        }
    }

    public static void printStudents(List<Task2> students, int course) {
        for (Task2 student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }
}
