package com.softserve.edu05.ptask;

public class Employee {
        private String name;
        private int departmentNumber;
        private double salary;
// To match spaces, should be 4 spaces
        public Employee(String name, int departmentNumber, double salary) {
            this.name = name;
            this.departmentNumber = departmentNumber;
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        public int getDepartmentNumber() {
            return departmentNumber;
        }

        public double getSalary() {
            return salary;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "name='" + name + '\'' +
                    ", departmentNumber=" + departmentNumber +
                    ", salary=" + salary +
                    '}';
        }
    }