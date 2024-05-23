package com.softserve.edu08.hw;

public class TaskHw82 {
/*
In the main() method, create two instances of the Student class and output information
about them by calling the appropriate methods info() and activity().
• Create one more instance of Student class by cloning the first student, change a course
for this object and output full information about created students.
 */

    public static void execute(){
        Student student1 = new Student(new FullName("Mary", "Perry"), 20, 2);
        Student student2 = new Student(new FullName("Joe", "Shizo"), 22, 4);
        Student cloned = null;
        try {
            cloned = (Student) student1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }


        System.out.println("Student 1: " + student1.info() + " " + student1.activity());
        System.out.println("Student 2: " + student2.info() + " " + student2.activity());
        System.out.println("Cloned student 1: " + cloned.info() + " " + cloned.activity());
        System.out.println();

        cloned.setCourse(3);

        System.out.println("Student 1: " + student1.info() + " " + student1.activity());
        System.out.println("Student 2: " + student2.info() + " " + student2.activity());
        System.out.println("Cloned student 1: " + cloned.info() + " " + cloned.activity());
    }


}
