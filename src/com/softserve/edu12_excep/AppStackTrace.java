package com.softserve.edu12_excep;

class MyException extends Exception {
	private static final long serialVersionUID = 1L;

	public MyException(String message) {
		super(message);
	}
}

public class AppStackTrace {

	public static void method1() throws MyException {
		method2();
	}

	public static void method2() throws MyException {
		method3();
	}

	public static void method3() throws MyException {
		throw new MyException("Exception thrown in method3");
	}

	public static void main(String[] args) {
		// method1();
		try {
			method1();
		} catch (Exception e) {
			// System.err.println(e.getMessage() + "\n");
			System.out.println(e.getMessage() + "\n");
			e.printStackTrace(); // Save to log (print info to file/console)
		}

	}
}
