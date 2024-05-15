package com.softserve.edu03_intro_oop.student;

public class Student { // extends Object {
    private static int count; //  = 0;
    private int id;
    private String name;

    static {
        count = 0;
        System.out.println("static block done");
    }

    public Student() {
        id = -1;
        name = "";
        count++;
    }

    public Student(int id, String name) {
        this();
        this.id = id;
        this.name = name;
    }

    public static int getCount() {
        return count;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    /*@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return getId() == student.getId() && Objects.equals(getName(), student.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName());
    }*/

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
