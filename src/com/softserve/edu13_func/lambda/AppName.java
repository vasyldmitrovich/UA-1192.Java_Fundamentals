package com.softserve.edu13_func.lambda;

import java.util.Scanner;

//@FunctionalInterface
interface MyFunctional {
	double f(double x);
	//double g(double x);
}

class MyF implements MyFunctional {
	@Override
	public double f(double x) {
		return x * x;
	}
}

public class AppName {

	public double x2(double x) {
		return x * x;
	}

	public double mySin(double x) {
		return x * Math.sin(x);
	}

	public double integral(MyFunctional mf, double a, double b, int n) {
		double x;
		double h = (b - a) / n;
		double sum = 0;
		for (int i = 0; i < n; i++) {
			x = a + i * h;
			sum = sum + mf.f(x);
		}
		return h * sum;
	}

	public static void main(String[] args) {
		AppName app = new AppName();
		double a;
		double b;
		int n;
		//
		Scanner sc = new Scanner(System.in);
		System.out.print("a= ");
		a = sc.nextDouble();
		System.out.print("b= ");
		b = sc.nextDouble();
		System.out.print("n= ");
		n = sc.nextInt();
		//
		// Before Java-8. Call Back
		MyF myf = new MyF();
		System.out.println("x2 Integral = " + app.integral(myf, a, b, n));

		//
		// Anonymous classes from Java 7; JDK 1.7
//		System.out.println("x2 Integral = " + app.integral(
//				new MyFunctional() {
//					@Override
//					public double f(double x) {
//						return x * x;
//					}
//				},
//				a, b, n));

		//
		// Java-8. Reference
//		MyFunctional f1 = app::x2;
//		System.out.println("x2 Integral = " + app.integral(f1, a, b, n));

		//
/*

		// Java-8. Add Lambda
		MyFunctional f1 = x -> x*x;
		//MyFunctional f1 = (double x) -> { return x*x; };
		System.out.println("x2 Integral = " + app.integral(f1, a, b, n));
*/

		//
//		System.out.println("x2 Integral =  " + app.integral(x -> x * x, a, b, n));
		//
//		System.out.println("x2 Integral = " + app.integral(app::x2, a, b, n));
//		System.out.println("mySin Integral = " + app.integral(app::mySin, a, b, n));


	}
}
