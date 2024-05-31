package com.softserve.edu09_10_collec.hw10;

import java.util.*;

import static com.softserve.edu09_10_collec.hw10.Student.printStudents;

public class App {

    public final static Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

//task1();
//        task2();
        task3();

    }

    public static void task1() {

        Set<String> set1 = new HashSet<>();
        set1.add("Element 1");
        set1.add("Element 2");
        set1.add("Element 3");

        System.out.println("set1 =" + set1);

        Set<String> set2 = new HashSet<>();
        set2.add("Element 4");
        set2.add("Element 5");
        set2.add("Element 6");
        set2.add("Element 2");

        System.out.println("set2 =" + set2);
        System.out.println("union =" + union(set1, set2));
        System.out.println("intersect =" + intersect(set1, set2));

    }

    public static void task2() {

        Map<String, String> personMap = new HashMap<>();
        personMap.put("Roi", "Oleksii");
        personMap.put("Lastname 1", "Name 1");
        personMap.put("Lastname 2", "Name 2");
        personMap.put("Lastname 2", "Name 3");
        personMap.put("Lastname 4", "Oleksii");
        personMap.put("Lastname 5", "Name 5");
        personMap.put("Lastname 6", "Name 6");
        personMap.put("Lastname 7", "Name 7");
        personMap.put("Lastname 8", "Name 8");
        personMap.put("Lastname 9", "Name 9");

        for (Map.Entry person : personMap.entrySet()) {
            System.out.println(person.getKey() + ": " + person.getValue());
        }

        String key = "1";
        for (Map.Entry person : personMap.entrySet()) {
            if (person.getValue().equals("Name 6")) {
                key = (String) person.getKey();
                break;
            }
        }

        personMap.remove(key);


        for (Map.Entry person : personMap.entrySet()) {
            System.out.println(person.getKey() + ": " + person.getValue());
        }
    }

    public static void task3(){

        System.out.println("Homework 10 task 3");

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Alex",1));
        students.add(new Student("Tamara",1));
        students.add(new Student("Olga",1));
        students.add(new Student("Bibo",5));
        students.add(new Student("Bobo",3));

        int courseForPrint;
        System.out.print("Input course for print: ");

        courseForPrint = SCANNER.nextInt();

        printStudents(students, courseForPrint);

        Collections.sort(students, Student.compareByName());
        System.out.println("\nStudents sorted by name:");
        for (Student student : students) {
            System.out.println(student.getName() + " - " + student.getCourse());
        }


        Collections.sort(students, Student.compareByCourse());
        System.out.println("\nStudents sorted by course:");
        for (Student student : students) {
            System.out.println(student.getName() + " - " + student.getCourse());
        }

    }

    public static <T> Set<T> union(Set<T> set1, Set<T> set2) {
        Set<T> resultSet = new HashSet<>(set1);
        resultSet.addAll(set2);
        return resultSet;
    }


    public static <T> Set<T> intersect(Set<T> set1, Set<T> set2) {
        Set<T> resultSet = new HashSet<>(set1);
        resultSet.retainAll(set2);
        return resultSet;
    }
}
