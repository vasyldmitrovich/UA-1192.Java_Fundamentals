package com.softserve.edu03_intro_oop.stat;

public class Application {
    
    static {
        System.out.println("static Block: Tappl Static block");
    }
    
    public static void main(String[] args) {
        System.out.println("Start");
        Helper.print();
        Helper.setMessage("hello1");
        Helper.print();
        String logoPage = Helper.pathToImage+"logo.jpg";
        //
        // Not recommended:
        //Helper helper = new Helper();
//        helper.setMessage("new message");
//        helper.print();
        //
//        Helper helper2 = new Helper();
//        helper2.print();
    }

    static {
        System.out.println("static Block: Tappl Static block, The same static block but in the end class");
    }
}