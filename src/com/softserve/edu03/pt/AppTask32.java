package com.softserve.edu03.pt;

public class AppTask32 {

    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.setName("Boba Fett");
        employee1.setRate(8.5);
        employee1.setHours(30);
        Employee employee2 = new Employee("Biba Fett", 7.0, 40);
        Object[] info = new Object[]{"Feta Cheese", 6.5, 30};
        Employee employee3 = new Employee(info);

        process(employee1);
        process(employee2);
        process(employee3);

//        System.out.println(employee2);

        System.out.println("Total salary of all employees with bonuses: " + Employee.getTotalSum());

    }

    private static void process(Employee employee){
        Employee.setTotalSum(employee.getSalary() + employee.getBonuses());
        System.out.println(employee);
    }
}
