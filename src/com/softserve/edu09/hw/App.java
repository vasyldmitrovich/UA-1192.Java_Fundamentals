package com.softserve.edu09.hw;

import java.util.*;

public class App {

    public static void main(String[] args) {// Good, all good
        homework1();
        System.out.println("End of the first homework");

        homework2();
        System.out.println("End of the second homework");
    }

    public static void homework1 () {
        List<Integer> myCollection = new ArrayList<>();
        int randomNumber;

        for (int i = 0; i < 10; i++) {
            randomNumber = -100 + (int) (Math.random() * ((100 - (-100)) + 1));
            myCollection.add(randomNumber);
        }

        System.out.println("Initial list of elements" + myCollection.toString());

        swapMinWithMax(myCollection);
        insertRandNumber(myCollection);
        insertZero(myCollection);
        directAndReverse(myCollection);
        deleteLastEven(myCollection);
        deleteAfterMin(myCollection);
    }

    public static void swapMinWithMax (List<Integer> myCollection) {
        List<Integer> otherList = new ArrayList<>(myCollection);
        otherList.sort(null);
        int min = otherList.get(0);
        int max = otherList.get(9);
        int minPos = 0;
        int maxPos = 0;

        for (int i = 1; i < myCollection.size(); i++) {

            if (myCollection.get(i) == min) {
                minPos = i;
            } else if (myCollection.get(i) == max) {
                maxPos = i;
            }
        }

        otherList = new ArrayList<>(myCollection);
        otherList.set(minPos, max);
        otherList.set(maxPos, min);

        System.out.println("List with swapped maximum and minimum elements: " + otherList.toString());
    }

    public static void insertRandNumber (List<Integer> myCollection) {
        List<Integer> otherList = new ArrayList<>(myCollection);
        otherList.sort(null);
        int min = 0;
        int minPos = 0;

        if (otherList.get(0) < 0) {
            min = otherList.get(0);

            for (int i = 1; i < myCollection.size(); i++) {
                if (myCollection.get(i) == min) {
                    minPos = i;
                    break;
                }
            }

            if (minPos == 0) {
                otherList = new ArrayList<>();
                otherList.add(100 + (int)(Math.random() * ((999 - 100) + 1)));
                otherList.addAll(myCollection);
                System.out.println("List with inserted random three-digit number before the first negative number is: "
                + otherList.toString());
            } else {
                otherList = new ArrayList<>();

                for (int i = 0; i < minPos; i++) {
                    otherList.add(myCollection.get(i));
                }

                otherList.add(100 + (int)(Math.random() * ((999 - 100) + 1)));

                for (int i = minPos; i < myCollection.size(); i++) {
                    otherList.add(myCollection.get(i));
                }

                System.out.println("List with inserted random three-digit number before the first negative number is: "
                        + otherList.toString());
            }
        } else {
            System.out.println("There is no negative number in the list");
        }
    }

    public static void insertZero (List<Integer> myCollection) {
        List<Integer> otherList = new ArrayList<>();
        List<Integer> posList = new ArrayList<>();
        int count = 0;

        for (int i = 0, j = 1; i < myCollection.size() - 1; i++, j++) {

            if ((myCollection.get(i) < 0 && myCollection.get(j) > 0)
                    || (myCollection.get(i) > 0 && myCollection.get(j) < 0)) {
                posList.add(i);
            }
        }

        for (int i = 0; i < myCollection.size(); i++) {

            if (i == posList.get(count)) {
                otherList.add(myCollection.get(i));
                otherList.add(0);
                count++;

                if (count == posList.size()) {
                    count--;
                }
            } else {
                otherList.add(myCollection.get(i));
            }
        }

        System.out.println("List with inserted zero between numbers with other sights is: "
                + otherList.toString());
    }

    public static void  directAndReverse (List<Integer> myCollection) {
        int k = (int) (Math.random() * 8 + 1);
        List<Integer> list1 = new ArrayList<>(myCollection.subList(0, k));
        List<Integer> list2 = new ArrayList<>(myCollection.subList(k, myCollection.size()));
        list1.sort(null);
        list2.sort(Comparator.reverseOrder());
        System.out.println("first list with " + k + " elements of myCollection in direct order is " + list1.toString()
                + "\n" + "second list with " + (myCollection.size() - k) + " elements of myCollection in reverse order is " + list2.toString() );
    }

    public static void deleteLastEven (List<Integer> myCollection) {
        int pos = -1;

        for (int i = 0; i < myCollection.size(); i++) {

            if (myCollection.get(i) % 2 == 0) {
                pos = i;
            }
        }

        if (pos != -1) {
            myCollection.remove(pos);
            System.out.println("List with deleted last even number is " + myCollection.toString());
        } else {
            System.out.println("There is no even number in the list");
        }
    }

    public static void deleteAfterMin (List<Integer> myCollection) {
        List<Integer> otherList = new ArrayList<>(myCollection);
        otherList.sort(null);
        int min = otherList.get(0);
        int minPos = 0;

        for (int i = 0; i < myCollection.size(); i++) {

            if (myCollection.get(i) == min) {
                minPos = i;
            }
        }

        if (minPos != myCollection.size() - 1) {
            myCollection.remove(minPos + 1);
        }

        System.out.println("List with deleted number following the first minimum is " + myCollection.toString());
    }

    public static void homework2 () {
        Scanner sc = new Scanner(System.in);
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student());
        studentList.add(new Student("Ivan", "Computer Engineering", 2, new int[] {4, 2, 1, 3, 2}));
        studentList.add(new Student("Nazar", "Philosophy", 3, new int[] {2, 2, 1, 3, 2}));
        studentList.add(new Student("Andriy", "Economics", 4, new int[] {4, 4, 3, 3, 5}));

        checkGrades(studentList);
        System.out.println("Enter the course number, students of which you want to see");
        try {
            int course = sc.nextInt();
            printStudents(studentList, course);
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

    public static void checkGrades (List<Student> studentList) {
        Iterator<Student> itr = studentList.iterator();
        while (itr.hasNext()) {
            Student student = itr.next();
            if (student.averageGrade() < 3) {
                itr.remove();
            } else {
                student.setCourse(student.getCourse() + 1);
            }
        }

        System.out.println("List of student with removed students with a average grade point less than 3 " +
                "& increased course for student with grade 3 or higher" + "\n" + studentList.toString());
    }

    public static void printStudents (List<Student> studentList, int course) {

        for (Student item : studentList) {
            if (item.getCourse() == course) {
                System.out.println(item.toString());
            }
        }
    }
}
