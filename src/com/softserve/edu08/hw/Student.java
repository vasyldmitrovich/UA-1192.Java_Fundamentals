package com.softserve.edu08.hw;

public class Student extends Person{
    private int currentCourse;

    public Student(FullName fullName, int age, int currentCourse) {
        super(fullName, age);
        this.currentCourse = currentCourse;
    }

    public void setCurrentCourse(int currentCourse) {
        this.currentCourse = currentCourse;
    }

    @Override
    public String activity() {
        return "\n I study in university";
    }

    @Override
    public String info() {
        return  "\n Course: " + currentCourse + super.info();


    }
}
