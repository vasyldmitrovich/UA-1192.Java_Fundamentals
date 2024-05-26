package com.softserve.edu08.hw;

public class App {
    public static void main(String[] args) {
        FullName fullName1 = new FullName("Mike", "Stones");
        FullName fullname2 = new FullName("Larry", "Angels");
        Student student1 = new Student(fullName1, 18, 1);
        Student student2 = new Student(fullname2, 20, 3);
        Student student3 = (Student) student1.clone();

        student3.setCurrentCourse(2);

        System.out.println(student1.info() + student1.activity());
        System.out.println(student2.info() + student2.activity());
        System.out.println(student3.info()+ student3.activity());


    }
}
