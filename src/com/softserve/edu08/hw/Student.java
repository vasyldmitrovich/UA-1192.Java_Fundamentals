package com.softserve.edu08.hw;

import com.softserve.edu08.pt.Department;

public class Student extends Person implements Cloneable {
    private int course;

    public Student() {
        super.setFullName("null","null");
        super.setAge(0);
        setCourse(0);
    }

    public Student(String firstName, String lastName, int age, int course) {
        super(firstName, lastName, age);
        this.course = course;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public void info() {
        System.out.println("Course: <" + course + ">");
        super.info();
    }

    @Override
    String activity() {
        return "I study at university";
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Student myClone = (Student) super.clone();
        myClone.setCourse(getCourse());
        return myClone;
    }
}
