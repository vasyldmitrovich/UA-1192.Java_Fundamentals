package com.softserve.edu03.pt;

public class Employee {
           private String name;
        private double rate;
        private double hours;
        private double totalSalary; // Added totalSalary field

        public Employee(String name, double rate, double hours) {
            this.name = name;
            this.rate = rate;
            this.hours = hours;
            this.totalSalary = calculateSalary();
        }

        private double calculateSalary() {
            return rate * hours;
        }

        public static void main(String[] args) {
            Employee first = new Employee("Alex", 22, 40);
            Employee second = new Employee("Lise", 25, 35);
            Employee third = new Employee("Mary", 30, 45);
            System.out.println(first);
            System.out.println(second);
            System.out.println(third);
            double totalSum = first.getTotalSalary() + second.getTotalSalary() + third.getTotalSalary();
            System.out.println("Total salary of all employees: " + totalSum);
        }

        public double getTotalSalary() {
            return totalSalary;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "name='" + name + '\'' +
                    ", rate=" + rate +
                    ", hours=" + hours +
                    ", totalSalary=" + totalSalary +
                    '}';
        }
    }
