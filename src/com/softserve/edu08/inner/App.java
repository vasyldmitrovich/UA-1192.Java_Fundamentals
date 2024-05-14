package com.softserve.edu08.inner;

public class App {
	public static void main(String[] args) throws InterruptedException {

		//Inner class
/*

		Person p1 = new Person("Ivan", "Ivanov", 25);
		Person p2 = new Person("Petro", "Petrov", 30);
		System.out.println(p1);
		System.out.println(p2);
*/


		//More interesting
/*

		//Person p3 = new Person();
		Person p3 = new Person("Petro", "Petrov", 30);
		System.out.println("1. p3 = " + p3);
		// Person.FullName fn = new Person().new FullName("Ivan", "Ivanov");
		Person.FullName fn = p3.new FullName("Ivan", "Ivanov");
		System.out.println("2. p3 = " + p3);
		System.out.println("A.fn = " + fn);
		p3.setAge(20);
		System.out.println("3. p3 = " + p3);
		System.out.println("B.fn = " + fn);
		p3 = null;
		Thread.sleep(10000);
		System.out.println("C. After sleep fn = " + fn);
*/


		//Local class

		Person p4 = new Person();
		p4.run();
		System.out.println("p4 = " + p4);

	}
}
