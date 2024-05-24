package com.softserve.edu06.pt.pt2;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class App {
    public static void main(String[] args) {
        Car[] cars = createObj();
        getInfo(cars);
    }

    public static Car[] createObj() {
        Car[] cars = {
                new Sedan("Infiniti Q50", 280, 2018),
                new Sedan("Lexus IS 500 F", 265, 2022),
                new Truck("Scania R770", 162, 2023),
                new Truck("MAN TGX", 183, 2020),
        };
        return cars;
    }

    public static Car[] getInfo(Car[] cars) {
        for (var i : cars) {
            System.out.println(i);
        }
        return null;
    }

}
