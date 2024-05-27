package com.softserve.edu09_10_collec.hw9;


import java.util.*;

public class App {

    public final static Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {// Nice all is good

//        task1();
        task2();
    }

    public static void task1() {

        System.out.println("HomeWork 9 Task 1");

        ArrayList<Integer> myCollection = new ArrayList<>();
        Random random = new Random();
        int numberOfElements = 10;
        int max = 50;
        int min = -20;
//

        for (int i = 0; i < numberOfElements; i++) {
            int randomNumber = random.nextInt((max - min) + 1) + min;
            myCollection.add(randomNumber);
        }

        System.out.println(myCollection.toString());

        swapMaxMin(myCollection);

        System.out.println("After swap Max/Min :" + myCollection);

        int firstNegIndex = 0;

        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) < 0) {
                firstNegIndex = i;
                break;
            }
        }

        int randomThreeDigitNumber = 100 + random.nextInt(900);

        myCollection.add(firstNegIndex, randomThreeDigitNumber);

        System.out.println("After insert a random three-digit number :" + myCollection);


        for (int i = 0; i < myCollection.size() - 1; i++) {
            int element = myCollection.get(i);
            int j = i + 1;
            int nextElement = myCollection.get(j);

            if (element < 0 && nextElement > 0 || element > 0 && nextElement < 0) {
                myCollection.add(j, 0);
            }
        }
        System.out.println("After Insert a zero :" + myCollection);


        int k = 4;


        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();


        for (int i = 0; i < k && i < myCollection.size(); i++) {
            list1.add(myCollection.get(i));
        }


        for (int i = myCollection.size() - 1; i >= k; i--) {
            list2.add(myCollection.get(i));
        }


        System.out.println("list1: " + list1);
        System.out.println("list2: " + list2);


        for (int i = myCollection.size() - 1; i >= 0; i--) {
            int element = myCollection.get(i);

            if (element % 2 == 0 && element != 0) {
                myCollection.remove(i);
                break;
            }

            if (i == 0) {
                System.out.println("There are no even elements in the array");
            }
        }
        System.out.println("After remove the last even element: " + myCollection);


        int minIndex = 0;

        for (int i = 1; i < myCollection.size(); i++) {

            if (myCollection.get(i) < myCollection.get(minIndex)) {
                minIndex = i;
            }
        }

        if (minIndex < myCollection.size() - 1) {
            myCollection.remove(minIndex + 1);
        }

        System.out.println("After Remove from the list myCollection the element following the first minimum: " + myCollection);
    }


    public static void task2() {

        System.out.println("HomeWork 9 Task 2");

        ArrayList<Student> studentArrayList = new ArrayList<Student>();

        studentArrayList.add(new Student("Alex", 5, 1, 1));
        studentArrayList.add(new Student("Tamara", 1, 1, 5));
        studentArrayList.add(new Student("Vlad", 115, 4, 2));
        studentArrayList.add(new Student("Mila", 6, 4, 1));

        for (Student student : studentArrayList) {
            System.out.println(student);
        }
        System.out.println();

        removeAndPromotedStudent(studentArrayList);

        for (Student student : studentArrayList) {
            System.out.println(student);
        }


        int courseForPrint;
        System.out.print("Input course for print: ");

        courseForPrint = SCANNER.nextInt();

        printStudents(studentArrayList, courseForPrint);
    }


    public static void swapMaxMin(ArrayList<Integer> list) {

        int maxIndex = 0;
        int minIndex = 0;

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > list.get(maxIndex)) {
                maxIndex = i;
            }
            if (list.get(i) < list.get(minIndex)) {
                minIndex = i;
            }
        }

        Collections.swap(list, maxIndex, minIndex);
    }


    public static void removeAndPromotedStudent(ArrayList<Student> list) {

        for (int i = 0; i < list.size(); i++) {
            int grade = list.get(i).getGrades();
            if (grade < 3) {
                list.remove(i);
                i--;
            } else {
                Student student = list.get(i);
                student.setCourse(student.getCourse() + 1);

            }

        }
    }

    public static void printStudents(ArrayList<Student> students, int course) {
        System.out.println("Such students moved on to the " + course + " course:");
        for (int i = 0; i < students.size(); i++) {

            if (course == students.get(i).getCourse()) {
                System.out.println("Name: " + students.get(i).getName() + ", course " + students.get(i).getCourse() );
            }

        }

    }
}
