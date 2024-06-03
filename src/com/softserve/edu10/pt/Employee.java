package com.softserve.edu10.pt;

import java.util.Comparator;
import java.util.Map;
import java.util.Objects;

public class Employee {// Good

    private int id;
    private String name;
    private String position;
    private double salary;
    private int dateOfBirth;

    public Employee() {}

    public Employee(int id, String name, String position, double salary, int dateOfBirth) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.salary = salary;
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

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }

    public static class IdComparator<K> extends EmployeeComparator<K> {

        public IdComparator(Map<K, Employee> relatedMap) {
            super(relatedMap);
        }

        @Override
        public int compare(K k1, K k2) {
            return Integer.compare(relatedMap.get(k1).getId(), relatedMap.get(k2).getId());
        }

    }

    public static class NameComparator<K> extends EmployeeComparator<K> {

        public NameComparator(Map<K, Employee> relatedMap) {
            super(relatedMap);
        }

        @Override
        public int compare(K k1, K k2) {
            return relatedMap.get(k1).getName().compareTo(relatedMap.get(k2).getName());
        }

    }

    public static class PositionComparator<K> extends EmployeeComparator<K> {

        public PositionComparator(Map<K, Employee> relatedMap) {
            super(relatedMap);
        }

        @Override
        public int compare(K k1, K k2) {
            return relatedMap.get(k1).getPosition().compareTo(relatedMap.get(k2).getPosition());
        }

    }

    private static abstract class EmployeeComparator<K> implements Comparator<K> {

        protected Map<K, Employee> relatedMap;

        public EmployeeComparator(Map<K, Employee> relatedMap) {
            this.relatedMap = relatedMap;
        }

    }
}
