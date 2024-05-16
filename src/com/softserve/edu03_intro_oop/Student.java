package com.softserve.edu03_intro_oop;

public class Student { //extends Object {
    private String firstName; // = null
    private String lastName; // = null
    private int age; // = 0
    long aLong = 77l;
    protected String protectVariable = "this is protected var";
    public static int count= 77;

    public Student() {
        firstName = "";
        lastName = "";
        age = -1;
        count= count+1;
    }

    public Student(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        Teacher teacher = new Teacher();
        String teacherString = teacher.teacherName;
        System.out.println(teacherString);
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        int my = 1;
        return age;
    }

    public long getaLong() {
        return aLong;
    }

    public void setaLong(long aLong) {
        this.aLong = aLong;
    }

    public String getProtectVariable() {
        return protectVariable;
    }

    public void setProtectVariable(String protectVariable) {
        this.protectVariable = protectVariable;
    }

    public void setFirstName(String firstName) {
        if (firstName.equals("bla bla")) {
            firstName = "Vasyl";

        }
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "\tStudent{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
class Teacher {
    public String teacherName = "Mr. Anderson";
}
