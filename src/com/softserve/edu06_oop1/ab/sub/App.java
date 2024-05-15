package com.softserve.edu06_oop1.ab.sub;


public class App { // implements Serializable
	
	public static void main(String[] args) {
		System.out.println("The Start.");

/*

		//All is good
        System.out.println("Test ClassA.");
        ClassA a;
        a = new ClassA();
        System.out.println("a.i = " + a.i);
        a.m1();
        a.m2();
        a.m3();
        a.m4();	
        a.m6(); // static running A.m6();
        a.m7();
		//a.m8(); // COMPILE error
*/


		//More interesting
/*

		System.out.println("Test ClassB.");
		ClassA b; // = null;
		//System.out.println("b.i = " + b.i); // error not init
		b = new ClassB(); // 1. Polymor.
		System.out.println("b.i = " + b.i); // from A, fields not virtual; Architecture Error; Fields must be private
		b.m1(); // 2. Polymor.
		b.m2(); //From class A
		b.m3(); // 3. Polymor. non static methods are virtual!
		b.m4(); // 2. Polymor.
		//b.m5(); // Compile ERROR
		//((ClassB) b).m5(); // Code Smell
        if (b instanceof ClassB) {
        	((ClassB) b).m5(); // No Runtime Error
        }
		//b.m6(); // Running from ClassA; Architecture Error;
		ClassB.m6();
		ClassA.m6();
		//b.m8(); // Error for other package
		((ClassB) b).m8();
*/

		//All is clear
/*

        System.out.println("Test_0 ClassB.");
        ClassB b0;
        b0 = new ClassB();
        System.out.println("b0.i = " + b0.i); // from B 
        b0.m1();
        b0.m2(); // i = 1
        b0.m3();
        b0.m4();
        b0.m5();
        b0.m6(); // from B
        b0.m8();
*/


		System.out.println("The End.");
	}
}
