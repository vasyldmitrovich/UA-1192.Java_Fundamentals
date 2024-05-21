package com.softserve.edu08.hw;

public class AppHw {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student student = new Student(new FullName("Petya","Ivanov"),20,3);
        System.out.println("Info about first student\n"+student.info());
        System.out.println(student.activity());
        Student student1 = (Student) student.clone();
        System.out.println("Info about second(copy) student\n"+student1.info());
        System.out.println(student1.activity());
        student.setCourse(1);
        System.out.println("Info after change cource:");
        System.out.println("Info about first student\n"+student.info());
        System.out.println(student.activity());
        System.out.println("Info about second(copy) student\n"+student1.info());
        System.out.println(student1.activity());
    }
}
