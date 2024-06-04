package com.softserve.academy.edu08.hw;

public class Student extends Person {
    private int course;

    public Student(FullName fullName, int age, int course) {
        super(fullName, age);
        this.course = course;
    }

    @Override
    public String info() {
        return super.info() + ", Course: " + course;
    }

    @Override
    public String activity() {
        return "I study at university";
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public FullName getFullName() {
        return fullName;
    }

    @Override
    public Student clone() {
        return new Student(new FullName(getFullName().getFirstName(), getFullName().getLastName()), getAge(), course);
    }
}