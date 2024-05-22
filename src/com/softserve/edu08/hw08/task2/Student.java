package com.softserve.edu08.hw08.task2;

public class Student extends Person implements Cloneable {
    private int course;

    public Student(String name, int age, int course) {
        super(name, age);
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

    @Override
    public Student clone() {
        try {
            return (Student) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(); // Can not happen
        }
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public static void main(String[] args) {
        Student student1 = new Student("Alice", 20, 1);
        Student student2 = new Student("Bob", 22, 2);

        System.out.println(student1.info());
        System.out.println(student1.activity());

        System.out.println(student2.info());
        System.out.println(student2.activity());

        Student student3 = student1.clone();
        student3.setCourse(3);

        System.out.println(student1.info());
        System.out.println(student1.activity());

        System.out.println(student3.info());
        System.out.println(student3.activity());
    }
}
