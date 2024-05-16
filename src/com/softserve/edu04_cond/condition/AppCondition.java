package com.softserve.edu04_cond.condition;

public class AppCondition {
    public static void main(String[] args) { //throws IOException {
        byte b = 1;
        b = 2 + 1; // Ok
        //b = b + 1; // Compile Error. By Default 1 is int type. (byte = int)
        b = (byte) (b + 1);
        //b = b + (byte) 1; // Compile Error.
        //b = (byte) 1 + b; // Compile Error.
        System.out.println("b=" + b);

        //
/*

        float f = 12.5f;
        f = f + (float) 1.1;
        System.out.println("f = " + f);
        //
        var vi = 123; // From Java 10.
        System.out.println("var i = " + vi);
        String s = "abc";
        s = s + 1; // OK, symbol 1 is 49 in memory.
        System.out.println("s=" + s);
*/


        //
        /*
        int x = 1;
        int y = 0;
        //double result = x / y;     // Runtime Exception
        double result = 1.0 * x / y; // result = Infinity
        System.out.println("result = " + result);
*/

        //
/*
        int x = 11;
        int y = 7;
        //
        int a = x + y;  // a = 18
        System.out.println("a = " + a);
        int s = x - y;  // s = 4
        System.out.println("s = " + s);
        int m = x * y;  // m = 77
        System.out.println("m = " + m);
        int d = x / y;  // d = 1;  11 = 1 * 7 + 4
        System.out.println("d = " + d);
        int r = x % y;  // r = 4
        System.out.println("r = " + r);
        */

        //
/*

        int x = 5;
        int a, b;
        a = x++; // a = 5 x = 6
        System.out.println("a = " + a + "   x = " + x);
        x--; // x = 5
        b = ++x; // x = 6 b = 6
        System.out.println("b = " + b + "   x = " + x);
        ++x; // x = 7
        //
        x = 5;
        a = x++ + x; // a = x+++x; 5 (x=6) + x = 11
        System.out.println("a = " + a + "   x = " + x);
        //
        x = 5;
        a = x++ + ++x; // 5 (x=6) + (x=7) 7 = 12
        System.out.println("a = " + a + "   x = " + x);
*/


        //
/*

        boolean bool = true;
        System.out.println(bool);    // true
        System.out.println(!bool);   // false
*/


        //
/*
        int x = 5;
        int y = -5;
        System.out.println(x == y); // false
        System.out.println(x != y); // true
        System.out.println(x >= y); // true
        boolean bool = x < y;
        System.out.println("bool = " + bool); // false
*/

        //
/*
        int t = 5, s = 4, v = 7;
        System.out.println( (t > s && t > v) || (s < v) ); // true
        System.out.println( (t < v || s > v) && (t < s) ); // false
*/
        //
/*

        byte b = 0x0A; // 0000 1010 --This is 16 number system Hex = A
        System.out.println("b1 = " + b); // 10
        b = (byte) (b | 0xA0); // 0000 1010 | 1010 0000
        System.out.println("b2 =" + b); // 170 = 1010 1010 = -86
        int k = b;
        System.out.println("k1 =" + k);  // -86
        k = k & 0x000000FF;  //I kill first bits
        System.out.println("k2 =" + k); // 170 = 00...00 1010 1010
*/


        //***Binary***
/*

        int a = 42;
        int b = 15;
        int c = a | b;
        int d = a & b;
        int e = a ^ b;
        int f = ~b;
        System.out.println("a = " + Integer.toBinaryString(a));
        System.out.println("b = " + Integer.toBinaryString(b));
        System.out.println("a | b = " + Integer.toBinaryString(c));
        System.out.println("a & bb = " + Integer.toBinaryString(d));
        System.out.println("a ^ b = " + Integer.toBinaryString(e));
        System.out.println("~ b = " + Integer.toBinaryString(f));
*/

        //***Statements***
        /*
        int d = 0;
        int num = 10;
        if (d != 0 && num / d > 10) {
        //if (d != 0 & num / d > 10) {  // Runtime error
                System.out.println("We go to if statement. num = " + num);
        }
*/
        //
        /*
        int a = 1;
        int b = 2;
        int x = 3;
        System.out.print(a < x && x < b);
        // System.out.print(a < x < b);  //Compiler error
*/

        //
/*

        int a = 37, b = 24;
        if (a > 5 && (b = 42) < 50) {
        //if (a > 50 && (b = 72) < 50) {
        //if (a > 50 & (b = 72) < 50) {
            System.out.println("\tDo something...");
            System.out.println("\tVariable 'b' = " + b);
        }
        System.out.println("Variable 'a' = " + a);
        System.out.println("Variable 'b' = " + b);
*/

        //
        /*
        int a = 67, b = 24;
        if (a > 50 || (b = 72) < 50) {
        //if (a > 500 || (b = 72) < 50) {
        //if (a > 50 | (b = 72) < 50) {
            System.out.println("\tDo something...");
        }
        System.out.println("Variable 'a' = " + a);
        System.out.println("Variable 'b' = " + b);
*/

        //
        /*
        boolean b1 = true;
        boolean b2 = true;
        b1 &= b2;  //It is the same as b1 = b1 & b2;
        System.out.println("Was boolean b1 = true; \t is\t " + b1);
        b1 |= b2;  //It is the same as b1 = b1 | b2;
        System.out.println("Was boolean b1 = true; \t is\t " + b1);
        b1 ^= b2;  //It is the same as b1 = b1 ^ b2;
        System.out.println("Was boolean b1 = true; \t is\t " + b1);
*/

        //
/*
        int temperature = 1;
        if (temperature < 10) {
        	System.out.println("if: It is too cold");
        } else {
        	System.out.println("if: It is Ok");
        }
        temperature = 11;
        String result = temperature < 10 ? "It is too cold" : "It is Ok";
        System.out.println("ter1: " + result);
        System.out.println("ter2: " + (temperature < 10 ? "It is too cold" : "It is Ok") );
*/

        //
/*
        boolean isLeap;
        int year = 1900;
        //int year = 2000;
        //int year = 2024;
        if (year % 4 != 0) {
            isLeap = false;
        } else {
            if (year % 100 != 0) {
                isLeap = true;
            } else {
                if (year % 400 == 0) {
                    isLeap = true;
                } else {
                    isLeap = false;
                }
            }
        }
        System.out.println("isLeap = " + isLeap);
*/

        //
/*
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Do you enjoy Java? (yes/no/maybe): ");
        String input = br.readLine();
        //
        switch (input.toLowerCase()) {  //Can be expression
        case "yes":  //Must be number constant or char constant or enum
        	System.out.println("Ok!");
        case "maybe":
        	System.out.println("Great!");
        	break;
        case "no":
        	System.out.println("Too bad!");
        	break;
        default:
        	System.out.println("Wrong!");
        }
        //
        String s = input.toLowerCase();
        if (s.equals("yes")) {
        	System.out.println("Ok! 2");
        } 
        if (s.equals("yes") || s.equals("maybe")) {
        	System.out.println("Great! 2");
        } else if (s.equals("no")) {
        	System.out.println("Too bad! 2");
        } else {
        	System.out.println("Wrong! 2");
        }
*/
    }
}
