package com.softserve.edu08.hw;

public class Student extends Person implements Cloneable{
    private int course;

    public Student(FullName fullName, int age,int course) {
        super(fullName, age);
        this.course=course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public String info(){
        return super.info()+", Course:"+course;
    }
    @Override
    public String activity() {
        return "I study at university";
    }
    @Override
    protected Object clone() throws CloneNotSupportedException{
        Student copyStudent = (Student) super.clone();
        return copyStudent;
    }
}
