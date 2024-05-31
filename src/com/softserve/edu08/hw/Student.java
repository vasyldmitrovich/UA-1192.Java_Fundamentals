package com.softserve.edu08.hw;

public class Student extends Person implements Cloneable{
    int course;

        // Constructor
        public Student(FullName fullName, int age, int i) {
            super(fullName, age);
        }

        public void setCourse() {
            this.course = course;

        }

    @Override
    public String activity() {
        return "I study at academy";
    }
    @Override
    protected Object clone()throws CloneNotSupportedException{
            Student copyStudent =(Student) super.clone() ;
            return copyStudent;
    }

}
