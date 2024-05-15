package com.softserve.edu03_intro_oop.param;

public class AppParam {

    // Overload
    public void work(int i) { // Overload
        System.out.println("start work(...), i = " + i);
        i = i + 1;
        System.out.println("done work(...), i = " + i);
    }

    public void work(StringBuilder sb) { // Overload
        System.out.println("start work(...), sb = " + sb);
        sb.append(" work added");
        System.out.println("done work(...), sb = " + sb);
    }

    public void work(String s) { // Overload
        System.out.println("start work(...), s = " + s);
        s = s + " work added";
        System.out.println("done work(...), s = " + s);
    }

    public void work(Integer... i) { // Overload
        System.out.println("start work(...), i = " + i);
        for (Integer bla : i
             ) {
            System.out.println("bla = " + bla);
        }
        //i = i + 2;
        System.out.println("done work(...), i = " + i.toString());
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        AppParam app = new AppParam();
        //
        // 1. By Value, Value Type (Primitive)
        int i = 1;
        app.work(i);
        System.out.println("done main(...), i = " + i);
        //
        // 2. By Value, Reference Type
        StringBuilder sb = new StringBuilder("123");
        app.work(sb);
        System.out.println("done main(...), sb = " + sb);
        //
        // 3. By Value, Reference Immutable Type
        String s = "1234"; // s = new String("1234");
        app.work(s);
        System.out.println("done main(...), s = " + s);
        //
        // 4. By Value, Reference Immutable Type
        Integer ib = 12; // = new Integer(12);
        app.work(ib,10,33);
        System.out.println("done main(...), i = " + ib); // i.toString();
    }
}
