package com.softserve.edu07_oop2.comporator;

import java.util.Comparator;

public class Student implements Comparator<Student> {

    private String name;
    private int age;

    public Student(){
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

    //ByAge
//    @Override
//    public int compare(Student o1, Student o2) {
//        return o1.getAge()-o2.getAge();
//    }
    //ByNameAndAge
    @Override
    public int compare(Student o1, Student o2) {
        int byName = o1.getName().compareTo(o2.getName());
        return byName == 0 ? o2.getAge()- o1.getAge() : byName;
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
