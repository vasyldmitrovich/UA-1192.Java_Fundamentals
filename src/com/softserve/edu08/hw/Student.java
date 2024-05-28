package com.softserve.edu08.hw;

public class Student extends Person implements Cloneable {
    private int currentCourse;

    public Student() {
    }

    public Student(FullName fullName, int age, int currentCourse) {
        super(fullName, age);
        this.currentCourse = currentCourse;

    }

    public int getCurrentCourse() {
        return currentCourse;
    }

    protected void setCurrentCourse(int currentCourse) {
        this.currentCourse = currentCourse;
    }

    public void showHW() {
        String gap = "\n";
        String lines = "-".repeat(40);
        System.out.println(lines + gap + info() + gap + activity() + gap + lines);
    }

    @Override
    public String info() {
        String gap = "\n";
        return super.info() + gap + "Current course: " + getCurrentCourse();
    }

    @Override
    public String activity() {
        return "Student is studying Java Core .";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Student stClone = (Student) super.clone();
        return stClone;
    }

}
