package com.softserve.edu03.stat;

public final class Helper {
    private static String message; // = "Hello";
    public static String pathToImage= "c/users/vbazh/lv";
    public String notStat;

    static {
        boolean bbb = false;//чи наша система лінукс чи вінда
        message = "Hello World";
        System.out.println("static Block: First message = " + message);
        if ( bbb) {
            pathToImage="home/vbazh";
        }

    }

    {
        if (notStat != null) {
            notStat = "bla bla bla";
        }

    }

//    public Helper() {
//        System.out.println("Helper public Helper() Constructor");
//    }

    private Helper() {
    }

    public static void setMessage(String message) {
        Helper.message = message;
    }

    public static void print() {


        System.out.println(message);
    }
}
