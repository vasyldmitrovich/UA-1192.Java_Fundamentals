package com.softserve.edu09.hwork;

import java.util.*;

public class AppHw {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1() {
        List<Integer> myCollection = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter numbers " + i);
            myCollection.add(scan.nextInt());
        }

        int max = Collections.max(myCollection);
        int min = Collections.min(myCollection);

        int maxNum = myCollection.indexOf(max);
        int minNum = myCollection.indexOf(min);

        myCollection.set(maxNum, min);
        myCollection.set(minNum, max);

        System.out.println("Swap the maximum and minimum numbers: " + myCollection);

        int firstNegativeNum = -1;
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) < 0) {
                firstNegativeNum = i;
                break;
            }
        }

        if (firstNegativeNum != -1) {
            Random random = new Random();
            int randomNum = 100 + random.nextInt(500);
            myCollection.add(firstNegativeNum, randomNum);
        }

        System.out.println("Insert a random three-digit number: " + myCollection);

        for (int i = 0; i < myCollection.size() - 1; i++) {
            int element = myCollection.get(i);
            int j = i + 1;
            int nextElement = myCollection.get(j);

            if (element < 0 && nextElement > 0 || element > 0 && nextElement < 0) {
                myCollection.add(j, 0);
            }
        }
        System.out.println("Insert a zero :" + myCollection);

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        int k = 5;

        for (int i = 0; i < k && i < myCollection.size(); i++) {
            list1.add(myCollection.get(i));
        }


        for (int i = myCollection.size() - 1; i > k; i--) {
            list2.add(myCollection.get(i));
        }

        System.out.println("list1: " + list1);
        System.out.println("list2: " + list2);

        int lastNum = -1;
        for (int i = myCollection.size() - 1; i >= 0; i--) {
            if (myCollection.get(i) % 2 == 0) {
                lastNum = i;
                break;
            }
        }

        if (lastNum != -1) {
            myCollection.remove(lastNum);
            System.out.println("Removing the last even element : " + myCollection);
        } else {
            System.out.println("There are no even elements in the list.");
        }

        int minNumb = 0;
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) > myCollection.get(minNumb)) {
                minNumb = i;
            }
        }

        if (minNumb < myCollection.size() - 1) {
            myCollection.remove(minNumb + 1);
            System.out.println("Removing the element following the first minimum: " + myCollection);
        } else {
            System.out.println("There are no even elements in the list.");
        }
    }

    public static void task2() {
        ArrayList<Student> studentsList = new ArrayList<Student>();

        studentsList.add(new Student("Nastya", 1, 2, 5));
        studentsList.add(new Student("Alla", 1, 2, 4));
        studentsList.add(new Student("Olga", 2, 3, 3));
        studentsList.add(new Student("Toma", 3, 4, 2));
        studentsList.add(new Student("Ira", 3, 4, 1));

        removesStudents(studentsList);
        printStudents(studentsList, 2);

    }

    public static void removesStudents(ArrayList<Student> studentsList) {
        Iterator<Student> iterator = studentsList.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            int grade = student.getGrades();
            if (grade < 3) {
                iterator.remove();
            } else {
                student.setCourse(student.getCourse() + 1);
            }

        }
    }

    public static void printStudents(ArrayList<Student> studentsList, int course) {
        for (Student student : studentsList) {
            if (student.getCourse() == course) {
                System.out.println("Students who are enrolled in the course 2: " + student.getName());
            }
        }
    }
}






