package com.softserve.edu09.hw;


import java.util.*;

public class HomeWorkTask {// Tasks in this class is nice

    public void task1() {

        Utils ut = new Utils();

        //create myCollection
        ut.createMyCollection();
        System.out.println("Original collection:" + ut.getMyCollection());

        //swap max and min
        int max = Collections.max(ut.getMyCollection());
        int min = Collections.min(ut.getMyCollection());
        int indexMax = ut.getMyCollection().indexOf(max);
        int indexMin = ut.getMyCollection().indexOf(min);
        ut.getMyCollection().set(indexMax, min);
        ut.getMyCollection().set(indexMin, max);
        System.out.println("Collection swap min max: " + ut.getMyCollection());

        //Insert a random three-digit number before the first negative element of the list
        Random rand = new Random();
        int number = rand.nextInt(100, 999);
        for (int i = 0; i < ut.getMyCollection().size(); i++) {
            if (ut.getMyCollection().get(i) < 0) {
                ut.getMyCollection().add(i, number);
                break;
            }
        }
        System.out.println("Collection + random number: " + ut.getMyCollection());

        //Insert a zero between all neighboring elements collection myCollection with different signs
        for (int i = 0; i < ut.getMyCollection().size() - 1; ) {
            int currentElement = ut.getMyCollection().get(i);
            int nextElement = ut.getMyCollection().get(i + 1);
            if ((currentElement < 0 && nextElement > 0) || (currentElement > 0 && nextElement < 0)) {
                ut.getMyCollection().add(i + 1, 0);
                i = i + 2;
            } else {
                i++;
            }
        }
        System.out.println("Collection + zero: " + ut.getMyCollection());

        //Copy the first k elements of the myCollection to the list1, in direct order, and the rest to the
        //list2 in reverse order.
        int k = Utils.getNumber("Enter k: ", true) - 1;
        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();
        for (int i = 0; i <= k; i++) {
            list1.add(i, ut.getMyCollection().get(i));
        }
        int index = 0;
        for (int i = ut.getMyCollection().size() - 1; i > k; i--) {
            list2.add(index, ut.getMyCollection().get(i));
            index++;
        }
        System.out.println("list1 : " + list1);
        System.out.println("list2: " + list2);

        //In a list myCollection remove the last even element (if there are even elements in the list). If
        //there is no such element, display a message.
        boolean find = false;
        for (int i = ut.getMyCollection().size() - 1; i >= 0; i--) {
            if (ut.getMyCollection().get(i) % 2 == 0 && ut.getMyCollection().get(i) != 0) {
                ut.getMyCollection().remove(i);
                System.out.println("myCollection remove last even: " + ut.getMyCollection());
                find = true;
                break;
            }
        }

        if (!find) {
            System.out.println("There is no even elements");
        }

        //Remove from the list myCollection the element following the first minimum. If the minimum
        //element is the last one, nothing needs to be removed.
        min = Collections.min(ut.getMyCollection());
        indexMin = ut.getMyCollection().indexOf(min);
        if (indexMin != list1.lastIndexOf(ut.getMyCollection())) {
            ut.getMyCollection().remove(indexMin + 1);
        }
        System.out.println("myCollection result: " + ut.getMyCollection());
    }

    public void task2() {
        List<Student> students = new ArrayList<>();

        //init grades
        int[] grades1 = {1, 2, 5};
        int[] grades2 = {5, 3, 4};
        int[] grades3 = {2, 2, 5};
        int[] grades4 = {5, 2, 3};

        //create students
        Student[] studentArr = {
                new Student("Alex", 23, 3, grades1),
                new Student("Ira", 32, 2, grades2),
                new Student("Myho", 23, 1, grades3),
                new Student("Fred", 12, 2, grades4),
        };

        //add students to list
        for (Student stud : studentArr) {
            students.add(stud);
        }

        //print original list
        System.out.println("Original list: \n" + students);

        //remove and promoted students
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getAvg() < 3) {
                students.remove(students.get(i));
            }
        }
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getAvg() >= 3) {
                int promoted = students.get(i).getCourse() + 1;
                students.get(i).setCourse(promoted);
            }
        }
        System.out.println("List after 1 task: \n" + students);

        //printStudents on course
        printStudents(students, Utils.getNumber("Enter course number:", true));
    }

    private void printStudents(List<Student> students, int course) {
        List<String> studCourse = new ArrayList<>();
        for (Student stud : students) {
            if (stud.getCourse() == course) {
                studCourse.add(stud.getName());
            }
        }
        System.out.println("Students on course " + course + " is: \n" + studCourse);
    }
}
