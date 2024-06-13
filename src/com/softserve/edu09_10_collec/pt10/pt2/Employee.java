package com.softserve.edu09_10_collec.pt10.pt2;

public class Employee {
    private int id;
    private String name;
    private String position;
    private double salary;
    private String dateOfBirth;

    public Employee(int id, String name, String position, double salary, String dateOfBirth) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.dateOfBirth = dateOfBirth;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "ID: " + id +
                "\nName: " + name +
                "\nPosition: " + position +
                "\nSalary: " + salary +
                "\nDate of Birth: " + dateOfBirth + "\n";
    }
}

