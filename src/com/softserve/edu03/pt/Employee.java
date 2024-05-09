package com.softserve.edu03.pt;

public class Employee {


    private String name;
    private float rate;
    private float hours;
    public static float totalSum;

    public Employee() {
        this.name = "n/a";
        this.rate = 0.0f;
        this.hours = 0.0f;

//        this("N/A", 0.0f, 0.0f);
        totalSum += (this.getSalary() + this.getBonuses());
    }

    public Employee(String name, float rate, float hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
//        totalSum += (this.getSalary() + this.getBonuses()); // 6 годин війни з цим рядком, він переміг і мовчить
    }

    float getSalary() {
        return rate * hours;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                '}';
    }

    float getBonuses() {
        return getSalary() * 0.1f;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    public float getHours() {
        return hours;
    }

    public void setHours(float hours) {
        this.hours = hours;
    }

    public static float getTotalSum() {
        return totalSum;
    }
}
