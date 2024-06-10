package com.softserve.edu12.pt;

public class AppPt12 {

    public static void main(String[] args) {
        System.out.println("Perform practical task 12.1");
        try {
            Task121.execute();
        } catch (IllegalArgumentException exception){
            System.out.println("Sorry! " + exception.getMessage());
            System.out.println("Please try again");
        }

        System.out.println();

        System.out.println("Perform practical task 12.2");
        Task122.execute();
    }
}
