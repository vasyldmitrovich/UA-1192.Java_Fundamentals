package com.softserve.edu08.pt;

public class AppPt {
    public static void main(String[] args)  {

        Department department=new Department("First Department","Kherson","Shevchenko",100);
        department.showDepartment();
        Department department2;

        try {
             department2=(Department) department.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Info about copy object");
        department2.showDepartment();
        department.setCity("Kharkiv");
        System.out.println("After change city");
        department.showDepartment();
        department2.showDepartment();
    }
    public static void pt1(){

    }
}
