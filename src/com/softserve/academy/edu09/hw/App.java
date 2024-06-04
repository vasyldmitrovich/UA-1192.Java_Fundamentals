package com.softserve.academy.edu09.hw;

import java.util.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class App {

    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1() {
        System.out.println("Task 1:" +
                "Declare collection myCollection of 10 integers and fill it (from the console or random).\n" +
                "• Swap the maximum and minimum elements in the list.\n" +
                "• Insert a random three-digit number before the first negative element of the list\n" +
                "• Insert a zero between all neighboring elements collection myCollection with different signs\n" +
                "• Copy the first k elements of the myCollection to the list1, in direct order, and the rest to the\n" +
                "list2 in reverse order.\n" +
                "• In a list myCollection remove the last even element (if there are even elements in the list). If\n" +
                "there is no such element, display a message.\n" +
                "• Remove from the list myCollection the element following the first minimum. If the minimum\n" +
                "element is the last one, nothing needs to be removed.\n");

        List<Integer> myCollection = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            myCollection.add(rand.nextInt(200) - 100);
        }
        System.out.println("Initial collection: " + myCollection);

        int maxIndex = myCollection.indexOf(Collections.max(myCollection));
        int minIndex = myCollection.indexOf(Collections.min(myCollection));
        Collections.swap(myCollection, maxIndex, minIndex);
        System.out.println("After swapping max and min: " + myCollection);

        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) < 0) {
                myCollection.add(i, rand.nextInt(900) + 100);
                break;
            }
        }
        System.out.println("After inserting a random three-digit number: " + myCollection);

        for (int i = 0; i < myCollection.size() - 1; i++) {
            if (myCollection.get(i) * myCollection.get(i + 1) < 0) {
                myCollection.add(i + 1, 0);
                i++;
            }
        }
        System.out.println("After inserting zeros: " + myCollection);

        int k = 5;
        List<Integer> list1 = new ArrayList<>(myCollection.subList(0, k));
        List<Integer> list2 = new ArrayList<>(myCollection.subList(k, myCollection.size()));
        Collections.reverse(list2);
        System.out.println("list1: " + list1);
        System.out.println("list2: " + list2);

        for (int i = myCollection.size() - 1; i >= 0; i--) {
            if (myCollection.get(i) % 2 == 0) {
                myCollection.remove(i);
                break;
            }
            if (i == 0) {
                System.out.println("No even element found.");
            }
        }
        System.out.println("After removing the last even element: " + myCollection);

        minIndex = myCollection.indexOf(Collections.min(myCollection));
        if (minIndex < myCollection.size() - 1) {
            myCollection.remove(minIndex + 1);
        }
        System.out.println("After removing the element following the first minimum: " + myCollection);
    }

    public static void task2() {
        System.out.println("Task 2:" +
                "Create a class called Student which includes the following fields: name, group, course, and\n" +
                "grades in different subjects. Create a collection that holds all objects. Write a methods that:\n" +
                " removes students with a grade point average of less than 3. If a student's average score is\n" +
                "3 or higher, then they will be automatically promoted to the next course level.\n" +
                " printStudents(List<Student> students, int course) which takes a list of students and a\n" +
                "course number as inputs. This method should print out the names of the students who\n" +
                "are enrolled in the specified course number to the console.\n" +
                " In main() method create collection and output result.\n");

        List<Student> students = new ArrayList<>();
        Student student1 = new Student("John", "A", 1, Map.of("Math", 5, "Physics", 4, "Chemistry", 3));
        Student student2 = new Student("Jane", "B", 2, Map.of("Math", 4, "Physics", 3, "Chemistry", 2));
        Student student3 = new Student("Alice", "A", 1, Map.of("Math", 3, "Physics", 2, "Chemistry", 1));
        students.add(student1);
        students.add(student2);
        students.add(student3);

        removeLowScorers(students);
        printStudents(students, 2);
    }

    public static void removeLowScorers(List<Student> students) {
        students.removeIf(s -> s.getAverageGrade() < 3);
        students.forEach(s -> {
            if (s.getAverageGrade() >= 3) {
                s.course++;
            }
        });
    }

    public static void printStudents(List<Student> students, int course) {
        students.stream()
                .filter(s -> s.course == course)
                .forEach(s -> System.out.println(s.name));
    }
}
