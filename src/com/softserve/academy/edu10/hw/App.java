package com.softserve.academy.edu10.hw;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Task 1:" +
                "Develop parameterized methods union(Set set1, Set set2) and intersect(Set set1, Set\n" +
                "set2), realizing the operations of union and intersection of two sets. Test the operation\n" +
                "of these techniques on two pre-filled sets.\n");


        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8));

        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);

        Set<Integer> unionSet = union(set1, set2);
        System.out.println("Union of Set 1 and Set 2: " + unionSet);

        Set<Integer> intersectSet = intersect(set1, set2);
        System.out.println("Intersection of Set 1 and Set 2: " + intersectSet);
    }

    public static <T> Set<T> union(Set<T> set1, Set<T> set2) {
        Set<T> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);
        return unionSet;
    }

    public static <T> Set<T> intersect(Set<T> set1, Set<T> set2) {
        Set<T> intersectSet = new HashSet<>(set1);
        intersectSet.retainAll(set2);
        return intersectSet;
    }

    public static void task2() {
        System.out.println("Task 2:" +
                "Create a map called personMap and populate it with ten entries of type <String,\n" +
                "String>, where each entry corresponds to a person's last name and first name. Display\n" +
                "the contents of the map on the screen. Are there at least two persons with the same\n" +
                "first name among these ten people? Remove the person from the map whose first\n" +
                "name is \"Orest\" (or any other specified name). Print the resulting map after the\n" +
                "removal.\n");
        Map<String, String> personMap = new HashMap<>();
        personMap.put("Shevchenko", "Taras");
        personMap.put("Franko", "Ivan");
        personMap.put("Skovoroda", "Hryhorii");
        personMap.put("Kosach", "Orest");
        personMap.put("Stus", "Vasyl");
        personMap.put("Zhadan", "Serhii");
        personMap.put("Rylskyi", "Maksym");
        personMap.put("Tychyna", "Orest");
        personMap.put("Petliura", "Symon");
        personMap.put("Konovalets", "Yevhen");
        personMap.put("Vishnia", "Ostap");
        personMap.put("Bandera", "Stepan");

        System.out.println("Initial Map: " + personMap);

        Map<String, Long> firstNameCounts = personMap.values().stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        boolean hasDuplicateFirstNames = firstNameCounts.values().stream().anyMatch(count -> count > 1);
        System.out.println("Are there at least two persons with the same first name? " + hasDuplicateFirstNames);

        personMap.values().removeIf(firstName -> firstName.equals("Orest"));
        System.out.println("Map after removal: " + personMap);
    }

    public static void task3() {
        System.out.println("Task 3:" +
                "Create a class named Student that stores information about the student's name and\n" +
                "course.\n" +
                "• The class should include properties to access these fields, a constructor with\n" +
                "parameters, and a method called printStudents that takes a List of students and an\n" +
                "Integer representing the course number as arguments.\n" +
                "• This method should print the names of the students from the list who are enrolled in\n" +
                "the specified course to the console using an iterator.\n" +
                "• Additionally, add methods to compare students by name and by course.\n" +
                "• In the main() method, create a List named \"students\" and add five different Student\n" +
                "objects to it. Then, display the list of students sorted by name and sorted by course.\n");
        List<Student> students = new ArrayList<>();
        students.add(new Student("Taras", 1));
        students.add(new Student("Ivan", 2));
        students.add(new Student("Hryhorii", 1));
        students.add(new Student("Orest", 3));
        students.add(new Student("Vasyl", 2));
        students.add(new Student("Serhii", 1));
        students.add(new Student("Maksym", 3));

        Collections.sort(students);
        System.out.println("Students sorted by name:");
        for (Student student : students) {
            System.out.println(student.getName() + " - " + student.getCourse());
        }

        System.out.println("Students filtered by course:");
        Student.printStudents(students, 1);

        System.out.println("Students sorted by course:");
        Collections.sort(students, Student.CourseComparator);
        for (Student student : students) {
            System.out.println(student.getName() + " - " + student.getCourse());
        }
    }
}
