package com.softserve.edu08.hw;

public class Student extends Person implements Cloneable{// Good but do not write implement here because you parent have this implementation you cat simply override method

    private int course;

    public Student () {
        super(new FullName("Pavlo", "Dub"), 20);
        this.course = 4;
    }

    public Student (FullName fullName, int age, int course) {
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
        return super.info() + ", Course: " + this.course;
    }

    @Override
    public String activity() {
        return "I study at university";
    }

    @Override
    public Student clone() throws CloneNotSupportedException {
        return (Student) super.clone();
    }
}
