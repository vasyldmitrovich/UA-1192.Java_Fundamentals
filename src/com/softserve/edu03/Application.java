package com.softserve.edu03;

public class Application { // extends Object by default

    private String name = "Ivan";

    // Overload
    public void print() {
        System.out.println("Running ... public void print()");
        System.out.println("name = " + name);
    }

    // Overload
    public void print(String s) {
        System.out.println("Running ... public void print(String s)");
        System.out.println("s = " + s + "  name = " + name);
    }

    // Overload
    public void print(int... keys) {
        System.out.println("Running ... print(int... key), keys:");
        for (int key : keys) {
            System.out.println("key = " + key);
        }
    }

    public void print(Object... keys) {
        System.out.println("Running ... public void print2(Object... keys):");
        for (Object key : keys) {
            System.out.println("key = " + key.toString()); // key.toString()
        }
    }

    // Overload
    public void print3(int k1, int k2) {
        System.out.println("Running ... public void print(int k1, int k2)");
        System.out.println("k1 = " + k1 + "  k2 = " + k2);
    }

    // Overload
    public void print3(long k1, long k2) {
        System.out.println("Running ... public void print(long k1, long k2)");
        System.out.println("k1 = " + k1 + "  k2 = " + k2);
    }

    public static void main(String[] args) {
        System.out.println("Edu4");
        /*
        byte b = 1;
        b = (byte) (b + 1); // 1 is int
        System.out.println("b = " + b);
        //
        float f = 1;
        f = f + 311.5f;
        System.out.println("f = " + f);
        b = (byte) f; // Code Smell
        System.out.println("new b = " + b);  // 56
        //
        f = (float) Math.sqrt(2.25);
        System.out.println("f = " + f);
        //
        int k; // Not dafault
        // System.out.println("k = " + k); // Error, Variable 'k' might not have been initialized
        Student student;
        student = new Student();
        k = student.getAge();
        System.out.println("k = " + k);
        //
        k = b;
        System.out.println("k = b: " + k);
        b = (byte) 128;
        System.out.println("b = (byte) 128 = " + b);  // -128
        b = (byte) 255;
        System.out.printf("b = (byte) 255 = " + b + "  as Hex b = %h", b);  // -1  toString();
        */
        // /*-
        Student student = new Student("Vova","Belbo",33);
        System.out.println(student);
        System.out.println(student.aLong);

        student.setFirstName("bla bla");
        System.out.println("Student First name = " + student.getFirstName());


        /*Appl app = new Appl();
        app.print();
        app.print("hello");
        app.print("Super", "hello");
        */
        //
        //app.print(1, 2, 3); // Overload Error
        // app.print(10, 20, 30, 40);
        //app.print("abc", 1.1, 123, student); // 1.1->double->Double;  123->int->Integer
        //
//        app.print3(1, 2); // 1 and 2 int
//        app.print3(3L, 4L); // 1 and 2 long
        // */
    }
}
