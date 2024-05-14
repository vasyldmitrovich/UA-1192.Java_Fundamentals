package com.softserve.edu08.clon;

public class Person implements Cloneable { // extends Object
	private FullName fullName;
	private int age;

	public Person(String firstName, String lastName, int age) {
		this.fullName = new FullName(firstName, lastName);
		this.age = age;
	}

	public FullName getFullName() {
		return fullName;
	}

	public void setFullName(FullName fullName) {
		this.fullName = fullName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [ fullName = " + fullName + ", age=" + age + " ]";
	}

	@Override
	public Object clone() throws CloneNotSupportedException { // public
		//return super.clone();

		Person myClone = (Person) super.clone();
		myClone.setFullName((FullName) getFullName().clone());
		return myClone;
	}
}
