package com.softserve.edu06.ab;

public class ClassB extends ClassA {
	public double i = 1.1;

	@Override
	public void m1() {
		System.out.println("ClassB, metod m1, i=" + i);
		// super.m1();
	}

	@Override
	public void m4() {
		System.out.println("ClassB, metod m4, i = " + i);
	}

	// @Override // Error
	public void m5() {
		System.out.println("ClassB, metod m5");
	}

	// @Override // Error
	public static void m6() {
		System.out.println("ClassB, static metod m6");
		// ClassA.m6();
	}

	// @Override
	// public void m71() { // @Override Error
//	 private void m7() { // Compile Error
//	 	System.out.println("ClassB, metod m7");
//	 }

	public void m8() {
		System.out.println("ClassB, metod m8");
		super.m8();
	}
}
