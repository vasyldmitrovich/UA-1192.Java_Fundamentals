package com.softserve.edu09_10_collec.list;

import java.util.Arrays;

public class AppCheck {
    private int[] a = new int[4]; // = null by defaut;
    private int i; // = 0;
    private String s; // = null;

    public static void main(String[] args) {
        //AppCheck app = new AppCheck();
        //System.out.println("a = " + Arrays.toString(app.a));
        // /*
        int[] a1 = new int[4];
        a1[0] = 11;
        a1[1] = 12;
        a1[2] = 13;
        a1[3] = 14;
        //a1 = null;
        int[] a2;
        a2 = a1;
        Object a3;
        a3 = a1;
        // */
        System.out.println("a1 = " + Arrays.toString(a1));
        System.out.println("a2 = " + Arrays.toString(a2));
        System.out.println("a3 = " + Arrays.toString((int[])a3));
        //
        //int k;
        //System.out.println("k = " + k); // compile error
    }
}
