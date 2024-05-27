package com.softserve.edu09.hw;

import java.util.*;

public class App {

    public static final Random RAND = new Random(System.currentTimeMillis());

    private static final String[] NAMES = {"James", "Henry", "Emma", "William", "Evelyn"};
    private static final String[] GROUPS = {"CS", "CE", "AI", "AS"};

    public static void main(String[] args) {// Nice it is nice
        System.out.println("Task 1");
        demonstrateIntegersTask();
        System.out.println();

        System.out.println("Task 2");
        demonstrateStudentsTask();
    }

    private static void demonstrateIntegersTask() {
        List<Integer> myCollection = generateIntegers(10);
        printCollection(myCollection);
        System.out.println();

        swapMinAndMax(myCollection);
        printCollection(myCollection);
        System.out.println();

        insertDigitsBeforeNegative(myCollection);
        printCollection(myCollection);
        System.out.println();

        insertZeroBetween(myCollection);
        printCollection(myCollection);
        System.out.println();

        int k = myCollection.size() / 3;
        List<Integer> directOrder = copyInDirectOrder(myCollection, k);
        List<Integer> reverseOrder = copyInReverseOrder(myCollection, k);
        printCollection(directOrder);
        printCollection(reverseOrder);
        System.out.println();

        removeLastEven(myCollection);
        printCollection(myCollection);
        System.out.println();

        removeAfterMinimum(myCollection);
        printCollection(myCollection);
        System.out.println();
    }

    private static void demonstrateStudentsTask() {
        List<Student> students = generateStudents(10);
        printStudents(students);
        System.out.println();

        removeBadStudents(students);
        printStudents(students);
        System.out.println();

        promoteToNextCourse(students);
        printStudents(students);
        System.out.println();

        printStudents(students, 3);
        System.out.println();
    }

    private static List<Integer> generateIntegers(int size) {
        List<Integer> list = new ArrayList<>(size);

        for (int i = 0; i < size; i++) {
            list.add(RAND.nextInt(200) - 100);
        }

        return list;
    }

    private static void printCollection(Iterable<?> collection) {
        System.out.print('[');

        Iterator<?> iter = collection.iterator();
        while (iter.hasNext()) {
            System.out.print(iter.next().toString());

            if (iter.hasNext()) {
                System.out.print(' ');
            }
        }
        System.out.println(']');
    }

    private static void swapMinAndMax(List<Integer> list) {
        int maxPos = getMaximumPos(list);
        int minPos = getMinimumPos(list);

        int temp = list.get(minPos);
        list.set(minPos, list.get(maxPos));
        list.set(maxPos, temp);
//        list.set(maxPos, list.set(minPos, list.get(maxPos)));
    }

    private static int getMaximumPos(List<Integer> list) {
        int maxPos = 0;
        int maxInt = list.get(0);

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > maxInt) {
                maxPos = i;
                maxInt = list.get(i);
            }
        }

        return maxPos;
    }

    private static int getMinimumPos(List<Integer> list) {
        int minPos = 0;
        int minInt = list.get(0);

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < minInt) {
                minPos = i;
                minInt = list.get(i);
            }
        }

        return minPos;
    }

    private static void insertDigitsBeforeNegative(List<Integer> list) {
        int firstNegativePos = getFirstNegativePos(list);

        if (firstNegativePos == -1) {
            System.out.println("No negatives in collection");
        } else {
            for (int i = 0; i < 3; i++) {
                list.add(firstNegativePos++, RAND.nextInt(100));
            }
        }
    }

    private static int getFirstNegativePos(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 0) {
                return i;
            }
        }
        return -1;
    }

    private static void insertZeroBetween(List<Integer> list) {
        if (!list.isEmpty()) {
            ListIterator<Integer> iter = list.listIterator();
            int first = iter.next();

            while (iter.hasNext()) {
                int second = iter.next();

                if (first * second < 0) {
                    iter.previous();
                    iter.add(0);
                    iter.next();
                }

                first = second;
            }
        }
    }

    private static List<Integer> copyInDirectOrder(List<Integer> list, int lastIndex) {
        List<Integer> dest = new ArrayList<>(lastIndex);

        for (int i = 0; i < lastIndex; i++) {
            dest.add(list.get(i));
        }

        return dest;
    }

    private static List<Integer> copyInReverseOrder(List<Integer> list, int firstIndex) {
        List<Integer> dest = new ArrayList<>(list.size() - firstIndex);

        for (int i = list.size() - 1; i >= firstIndex; i--) {
            dest.add(list.get(i));
        }

        return dest;
    }

    private static void removeLastEven(List<Integer> list) {
        ListIterator<Integer> iter = list.listIterator(list.size());

        while (iter.hasPrevious()) {
            if (iter.previous() % 2 == 0) {
                iter.remove();
                return;
            }
        }

        System.out.println("No evens in collection");
    }

    private static void removeAfterMinimum(List<Integer> list) {
        int minPos = getMinimumPos(list);

        if (minPos == list.size() - 1) {
            System.out.println("Minimum is the last element");
        } else {
            list.remove(minPos + 1);
        }
    }

    private static List<Student> generateStudents(int size) {
        List<Student> students = new ArrayList<>(size);
        int subjectsCount = 4;

        for (int i = 0; i < size; i++) {
            Student student = new Student(
                    NAMES[RAND.nextInt(NAMES.length)],
                    GROUPS[RAND.nextInt(GROUPS.length)],
                    RAND.nextInt(4) + 1
            );

            int[] grades = new int[subjectsCount];
            for (int j = 0; j < grades.length; j++) {
                grades[j] = RAND.nextInt(5) + 1;
            }
            student.setGrades(grades);
            students.add(student);
        }
        return students;
    }

    private static void removeBadStudents(List<Student> students) {
        Iterator<Student> iter = students.iterator();

        while (iter.hasNext()) {
            Student student = iter.next();
            if (student.getAverageGrade() < 3) {
                iter.remove();
            }
        }
    }

    private static void promoteToNextCourse(List<Student> students) {
        Iterator<Student> iter = students.iterator();

        while (iter.hasNext()) {
            Student student = iter.next();
            if (student.getCourse() == 4) {
                iter.remove();
            } else {
                student.setCourse(student.getCourse() + 1);
            }
        }
    }

    private static void printStudents(List<Student> students) {
        if (students.isEmpty()) {
            System.out.println("There is no students");
        } else {
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }

    private static void printStudents(List<Student> students, int course) {
        List<Student> studentsInCourse = new ArrayList<>();

        for (Student student : students) {
            if (student.getCourse() == course) {
                studentsInCourse.add(student);
            }
        }

        printStudents(studentsInCourse);
    }
}
