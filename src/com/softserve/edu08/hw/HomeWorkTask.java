package com.softserve.edu08.hw;


public class HomeWorkTask {

    public void task1() throws CloneNotSupportedException {
        Student[] students = {
                new Student("Oleksandr", "Khomenko", 30, 4),
                new Student("Iryna", "Khomenko", 25, 2),
                new Student(),
        };
        students[2] = (Student) students[0].clone();
        students[2].setCourse(1);
        for (Student student : students) {
            student.info();
            System.out.println(student.activity());
        }
    }
}
