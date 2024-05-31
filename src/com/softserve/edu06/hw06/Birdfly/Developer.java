package com.softserve.edu06.hw06.Birdfly;

public class Developer extends Employee {

    private String programmingLanguage;

    public Developer(String name, int age, double salary, String programmingLanguage) {
        super(name, age, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public String report() {
        return String.format("Name: %s, Age: %d years, Position: %s developer, Salary: ₴ %.2f", getName(), getAge(), programmingLanguage, getSalary());
    }

    public static void main(String[] args) {// Move to App.java or your class Main not here, this class represent entity Developer not running logic
        Employee employee = new Employee("John Doe", 30, 75000);
        Developer developer = new Developer("Jane Doe", 28, 80000, "Java");

        System.out.println(employee.report());
        System.out.println(developer.report());
    }
}
