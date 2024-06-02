package com.softserve.edu09.hw;

import java.util.List;

public class App {
    public static void main(String[] args) {

        //Homework1

        CollectionMethods collectionMethods = new CollectionMethods();
        List<Integer> myCollection = collectionMethods.createArrayList();
        collectionMethods.swapMaxMin(myCollection);
        collectionMethods.changeEl(myCollection);
        collectionMethods.insertZeroBetweenSigns(myCollection);
        collectionMethods.listCopy(myCollection);
        collectionMethods.removeLastEvenEl(myCollection);
        collectionMethods.removeAfterMin(myCollection);

        //Homework2

        StudentMethods studMethods = new StudentMethods();
        List<Student> studentList = studMethods.crateStudList();
        studMethods.studToString(studentList);
        studMethods.studCheck(studentList);
        studMethods.studToString(studentList);
        studMethods.printStudents(studentList, studMethods.getCourse());
    }

}
