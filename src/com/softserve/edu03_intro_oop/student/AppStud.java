package com.softserve.edu03_intro_oop.student;

public class AppStud {

    public static void main(String[] args) {
        Student st0 = new Student(1,"Ivan");
        Student st1 = new Student(3,"Petro");
        Student st2 = new Student(10,"Ira");
        Student st3 = new Student(10,"Stepan");
        Student st4 = new Student();
        st4.setId(12);
        st4.setName("Oksana");
        //
        System.out.println("st4 = " + st4);
        //
        System.out.println("Students count = " + Student.getCount());
//        System.out.println("Students count = " + st4.getCount());

        String myS = "Home";
        for (int i =0; i < 5; i++) {
            System.out.println("i = " + i + " myS= " + myS);
        }
        System.out.println("i = " + "myS= " + myS);;
    }
}
