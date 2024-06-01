package edu10.hw;

import java.util.ArrayList;
import java.util.List;

public class Task103 {


    public static void execute() {

        List<Student> students = new ArrayList<>();

        for (int i=0; i < 5; i++){
            students.add(StudentCreator.create());
        }
        System.out.println("Initial students list: " + students);

//        System.out.println("Students of 3 course: " +Student.printStudents(3,students));
        System.out.println("Students sorted by name: " + students.stream().sorted(Student.compareByName()).toList());


        System.out.println("Students sorted by course: " + students.stream().sorted(Student.compareByCourse()).toList());
    }

}
