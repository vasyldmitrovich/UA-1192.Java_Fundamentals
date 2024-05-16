package com.softserve.edu06.hw;

class Employee {

    private String name;
    private int age;
    private String position;
    private double salary;

    public Employee(String name, int age, String position, double salary) {
        this.name = name;
        this.age = age;
        this.position = position;
        this.salary = salary;
    }

    // Getters and setters
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

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Method to generate report
    public String report() {
        return "Name: " + name + ", Age: " + age + " years, Position: " + position + ", Salary: $" + salary;
    }
}

class Developer extends Employee {
    private String speciality;

    public Developer(String name, int age, String position, double salary, String speciality) {
        super(name, age, position, salary);
        this.speciality = speciality;
    }

    @Override
    public String report() {
        return super.report() + ", Speciality: " + speciality;
    }
}

class main {
    public static void main(String[] args) {
        Employee employee = new Employee("Myke", 30, "Manager", 50000);
        Developer developer = new Developer("Jerry", 32, "Average Java developer", 32735.35, "Java");

        // Print information about employee and developer using the report method
        System.out.println("Employee: " + employee.report());
        System.out.println("Developer: " + developer.report());
    }
}
