package com.softserve.edu06.train2;

import com.softserve.edu06.train.Parent;

public class Child extends Parent {

	//@Override
	public int f() {
		System.out.println("running f() from Child");
		return 2;
	}

	public int useF2() {
		return useF();
	}
}
