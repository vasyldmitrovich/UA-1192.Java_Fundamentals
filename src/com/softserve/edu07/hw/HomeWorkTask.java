package com.softserve.edu07.hw;

import com.softserve.edu07.hw.company.ContractEmployee;
import com.softserve.edu07.hw.company.Employee;
import com.softserve.edu07.hw.company.SalariedEmployee;
import com.softserve.edu07.hw.travel.*;


import java.util.Arrays;


public class HomeWorkTask {

    public void task1() {
        // create array of workers
        Employee[] workers = {
                new ContractEmployee("123", "Alex", 156, 23345455),
                new SalariedEmployee("124", "Iryna", 25000.6, "ac345643"),
                new SalariedEmployee("1100", "Calico", 15000.8, "ah457843"),
                new ContractEmployee("10", "Versio", 145, 45787954),
                new SalariedEmployee("12", "Sergio", 12500.5, "ar34561234")
        };

//      print not sorting array
        for (Employee employee : workers) {
            System.out.println(employee.toString());
        }
        Arrays.sort(workers, new Employee.WageComparator());
        System.out.println();

//      print array after sort
        for (Employee employee : workers) {
            System.out.println(employee.toString());
        }
    }

    public void task2(){
        Passengers[] vehicles = {
                new Liner(),
                new Boat(),
                new Plane(),
                new Helicopter(),
                new Bus(),
                new Motorcycle(),
                new Car(),
        };
        for (Passengers vehicle:vehicles) {
            if (vehicle instanceof WaterVehicle) {
                ((WaterVehicle) vehicle).isSailing();
            } else if (vehicle instanceof FlyingVehicle) {
                ((FlyingVehicle) vehicle).fly();
                ((FlyingVehicle) vehicle).land();
            }else if (vehicle instanceof  GroundVehicle){
                ((GroundVehicle) vehicle).drive();
            }
        }
    }
}
