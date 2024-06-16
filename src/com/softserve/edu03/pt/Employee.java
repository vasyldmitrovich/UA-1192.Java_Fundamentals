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
