package com.softserve.edu09.hw;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StudentsOperator {

    public ArrayList<Student> removePromote(int average, ArrayList<Student> students){
        ArrayList<Student> modified = new ArrayList<>(students);
        students.forEach(student -> {
            int avg = student.getGrades().stream().reduce(0, Integer::sum)/student.getGrades().size();
            if(avg < average){
                modified.remove(student);
            }else {
                student.setCourse(student.getCourse()+1);
            }
        });

        return modified;
    }

    public String printStudents(List<Student> students, int course){
        StringBuilder output = new StringBuilder("Students of " + course + " course: ");
        for (Student student: students) {
            if(student.getCourse() == course){
                output.append("'" + student.getName() + "' ");
            }
        }
        return output.toString();
    }


    public ArrayList<Student> createStudents(int number){
        String[] firstNames = new String[]{"James", "Michael", "Robert", "John", "David", "William", "Richard",
                                            "Mary", "Patricia", "Jenifer", "Linda", "Elizabeth", "Barbara", "Susan"};
        String[] lastNames = new String[]{"Alpha", "Beta", "Gamma", "Delta", "Epsilon", "Zeta", "Theta", "Omicron", "Sigma", "Tau"};
        String[] groups = new String[]{"AB-10", "AF-12", "AR-14"};
        Random random = new Random();
        ArrayList<Student> students = new ArrayList<>();

        for (int i=0; i < number; i++){
            Student student = new Student();
            student.setName(firstNames[random.nextInt(0, firstNames.length-1)] + " " + lastNames[random.nextInt(0, lastNames.length-1)]);
            student.setGroup(groups[random.nextInt(0,groups.length-1)]);
            student.setCourse(random.nextInt(1, 4));

            ArrayList<Integer> grades = new ArrayList<>();

            for (int j= 0; j < 8; j++){
                grades.add(random.nextInt(1,7));
            }

            student.setGrades(grades);

            students.add(student);
        }

        return students;
    }

}
