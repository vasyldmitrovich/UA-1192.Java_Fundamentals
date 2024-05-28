package com.softserve.edu08.hw;

public class App {
    public static void main(String[] args) throws CloneNotSupportedException {

        Student student1 = new Student(new FullName("Rostyslav", "Kushpit"), 27, 1);
        Student student2 = new Student(new FullName("Pavlo", "Chernyavckii"), 20, 1);
        Student student3 = (Student) student1.clone();
        student1.showHW();
        student2.showHW();
        student3.setCurrentCourse(3);
        student3.showHW();

    }

}
