package com.softserve.edu07_oop2.comparable;

public class Student implements Comparable<Student> {

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

    //    @Override
//    public int compareTo(Student student) { // Default Sort
//        // return name.compareTo(((Student) student).getName());
//        return -age + student.getAge();
//        // return age - student.getAge();
//    }
    @Override
    public int compareTo(Student student) {
        if (this.name.compareTo(student.name) != 0) {
            return this.name.compareTo(student.name);
        } else {
            return Integer.compare(this.age, student.age);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (age != student.age) return false;
        return name.equals(student.name);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + age;
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
