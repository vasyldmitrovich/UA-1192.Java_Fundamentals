package com.softserve.edu10.pt;

public class Employee {// Nice very nice

    private int id;

    private String name;

    private double salary;

    private String position;

    private String dateOfBirth;

    public Employee() {
        this.id = 0;
        this.name = "";
        this.salary = 0.0;
        this.position = "";
        this.dateOfBirth = "";
    }

    public Employee(int id, String name, double salary, String position, String dateOfBirth) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.dateOfBirth = dateOfBirth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", position='" + position + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }
}
