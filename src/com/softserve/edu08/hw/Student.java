package com.softserve.edu08.hw;

public class Student extends Person {
    private int course;


    public Student(FullName fullName, int age, int course) {
        super(fullName, age);
        this.course = course;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public String info() {
        return String.format("\"First name: %s, Last name: %s, Age: %d, Course: %s\"", fullName.getFirstName(), fullName.getLastName(), age, course);
    }

    @Override
    public String activity() {
        return "I study at university";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Student cloned = (Student) super.clone();
        cloned.fullName = (FullName) cloned.fullName.clone();
        return cloned;
    }
}
