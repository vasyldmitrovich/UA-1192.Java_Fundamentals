package com.softserve.edu08_nest.clon;

public class App {
	public static void main(String[] args) throws CloneNotSupportedException {

		Person person1 = new Person("Mike", "Green", 25);
		System.out.println("1. person1 = " + person1);
		Person person2 = (Person) person1.clone();
		System.out.println("1. person2 = " + person2);
		//
		person1.setAge(30);
		person1.getFullName().setFirstName("Michael");
		System.out.println("2. person1 = " + person1);
		System.out.println("2. person2 = " + person2);
		//
/*

		People people1 = new People("Mike", "Green", 25);
		System.out.println("1. people1 = " + people1);
		People people2 = (People) people1.clone();
		System.out.println("1. people2 = " + people2);
		//
		people1.setAge(30);
		people1.setFirstName("Michael");
		System.out.println("2. people1 = " + people1);
		System.out.println("2. people2 = " + people2);
*/

	}

}
