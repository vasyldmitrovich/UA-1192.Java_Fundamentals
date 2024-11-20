package com.softserve.edu06.hw;

public class Developer extends Empolyee{

    private String developerClass;

      public Developer(String name, int age, double salary) {
        super(name, age, salary);
    }

    public Developer(String name, int age, double salary, String developerClass) {
        super(name, age, salary);
        this.developerClass = developerClass;
    }

    public String getDeveloperClass() {
        return developerClass;
    }

    public void setDeveloperClass(String developerClass) {
        this.developerClass = developerClass;
    }

    @Override
    public String report() {
        return String.format("Name: %s, Age: %d, Position: %s" +
                " Salary: \u20B4 %.2f", getName(), getAge(), getDeveloperClass(), getSalary());
    }
}
