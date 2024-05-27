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
        return String.format("\"First name: %s, Last name: %s, Age: %d, Course: %s\"", getFullName().getFirstName(), getFullName().getLastName(), getAge(), course);
    }

    @Override
    public String activity() {
        return "I study at university";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {// Good
        Student cloned = (Student) super.clone();
        cloned.setFullName((FullName) cloned.getFullName().clone());
        return cloned;
    }
}
