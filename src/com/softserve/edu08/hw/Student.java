package com.softserve.edu08.hw;

public class Student extends Students implements Cloneable {
    private int course;
    private String name;

    // Constructor to initialize all fields
    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    // Overriding the info() method
    @Override
    public String info() {
        return "Student name: " + name + ", Course: " + course;
    }

    // Overriding the activity() method from Person class
    @Override
    public String activity() {
        return "I study at university";
    }

    // Method to clone the Student object
    @Override
    public Student clone() {
        try {
            return (Student) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Clone not supported", e);
        }
    }

    // Getter and Setter for course
    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    // Getter and Setter for name (if needed)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    // Main method to demonstrate the functionality
    public static void main(String[] args) {// Move to App.java not here
        // Creating two instances of Student
        Student student1 = new Student("Alice", 1);
        Student student2 = new Student("Bob", 2);

        // Outputting information about the students
        System.out.println(student1.info());
        System.out.println(student1.activity());

        System.out.println(student2.info());
        System.out.println(student2.activity());

        // Cloning the first student
        Student clonedStudent = student1.clone();
        clonedStudent.setCourse(3); // Changing the course for the cloned student

        // Outputting information about the cloned student
        System.out.println(clonedStudent.info());
        System.out.println(clonedStudent.activity());
    }
}
