package com.softserve.edu05.pt;

public class Employee {
    private String name;
    private int departmentNumber;
    private int salary;
    public Employee(){

    }
    public Employee(String name,int departmentNumber,int salary){
        this.name = name;
        this.departmentNumber=departmentNumber;
        this.salary=salary;
    }

    public String getName() {
        return name;
    }

    public int getDepartmentNumber() {
        return departmentNumber;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "\nEmployee{" +
                "name='" + name + '\'' +
                ", departmentNumber=" + departmentNumber +
                ", salary=" + salary +
                '}';
    }

    public static void findByDep(Employee [] employees, int number){
        System.out.println("Employees of a certain department");
        int employeeCounter=0;
        for(int i=0;i<employees.length;i++){
            if(employees[i].getDepartmentNumber()==number){
                employeeCounter++;
                System.out.println("*****************************\nName:"+employees[i].name +"\nDepartment Number:"
                        +employees[i].departmentNumber+"\nEmployees salary:"+employees[i].salary);
            }
        }
        if(employeeCounter==0){
            System.out.println("No one works in a given department");
        }
    }
    public static Employee[] sortBySalary(Employee [] employees){
        for(int i =0;i<employees.length-1;i++){
            for(int j=0;j<employees.length-i-1;j++){
                if(employees[j].salary < employees[j+1].salary){
                    var temp = employees[j];
                    employees[j]=employees[j+1];
                    employees[j+1]=temp;
                }
            }
        }
     return  employees;
    }
}
