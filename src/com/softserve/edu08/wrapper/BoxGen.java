package com.softserve.edu08.wrapper;

import java.io.Serializable;

public class BoxGen<T> {
//public class BoxGen<T extends Serializable> {
	// private static T obj; // Error
	private T obj;
	
//	public BoxGen() {
//		obj = new T(); // Error
//	}

	public T get() {
		return obj;
	}

	public void set(T obj) {
		this.obj = obj;
	}

//    public static T todo() { // Error
//		return null;
//    }
}
