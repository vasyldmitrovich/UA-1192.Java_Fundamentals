package com.softserve.edu06.hw;

public class Developer extends Employee {

    private String position;

    public Developer() {
        super();
        this.position = "Developer";
    }

    public Developer(String name, int age, double salary) {
        super(name, age, salary);
        this.position = "Developer";
    }

    public Developer(String name, int age, double salary, String position) {
        super(name, age, salary);
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String report() {
        return String.format("Name: %s, Age: %d, " +
                "Salary: ₴ %.2f, Position: %s", this.getName(), this.getAge(), this.getSalary(), this.position);
    }
}
