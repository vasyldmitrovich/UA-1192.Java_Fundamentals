package com.softserve.edu07_oop2;

import java.util.Comparator;

public class Student { //implements Comparable<Student> {


	public static class ByDestName implements Comparator<Student> {
		@Override
		public int compare(Student st1, Student st2) {
			return -st1.getName().compareTo(st2.getName());
		}
	}

	public class ByAge implements Comparator<Student> {
		@Override
		public int compare(Student st1, Student st2) {
			return st1.getAge() - st2.getAge();
		}
	}

	public static class ByNameAndAge implements Comparator<Student> {
		@Override
		public int compare(Student st1, Student st2) {
			int byName = st1.getName().compareTo(st2.getName());
			return byName == 0 ? st1.getAge() - st2.getAge() : byName;
		}
	}

	// ----------------------------------------------------------------
	
	private String name;
	private int age;

	public Student() {
		name = "";
		age = 0;
	}

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if ((obj == null) || (getClass() != obj.getClass())) {
			return false;
		}
		Student other = (Student) obj;
		if ((age != other.age) || ((name == null) && (other.name != null))
				|| ((name != null) && (other.name == null))) {
			return false;
		}
		if ((name == null) && (other.name == null)) {
			return true;
		}
		return name.equals(other.name);
	}

	@Override
	public String toString() {
		return "\n\tStudent [name=" + name + ", age=" + age + "]";
	}

/*
	@Override
	public int compareTo(Student student) { // Default Sort
		return name.compareTo(student.getName());
		//return -age + student.getAge();
		//return age - student.getAge();
	}
*/


/*
	public int compareTo(Object student) { // Default Sort
		return name.compareTo(((Student) student).getName());
		// return -age + student.getAge();
		// return age - student.getAge();
	}
*/
}
