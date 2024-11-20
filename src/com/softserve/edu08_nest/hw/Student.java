package com.softserve.edu08_nest.hw;

import java.util.Objects;

public class Student extends Person implements Cloneable {

    private int course;

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
    public String toString() {
        return "Student{" +
                "course=" + course +
                ", fullName=" + getFullName() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(course);
    }

    @Override
    public String info(){
        return  "First name: " + getFullName().getFirstName() + " Last name: " + getFullName().getLastName() + " Age: " + getAge() + " Course:" + getCourse() ;
    }

    @Override
    public java.lang.String activity() {
        return "I study at university";
    }
}
