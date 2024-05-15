package com.softserve.edu06_oop1.train;

public class Parent {
	
	//protected int f() {
	//private final int f() {
	int f() {
		System.out.println("running f() from Parent");
		return 1;
	}

	public int useF() {
		return f();
	}
}
