package com.softserve.edu06.hw;

public class AppHw {
    public static void main(String[] args) {
        System.out.println("First homework");
        hwOne();
        System.out.println("Second homework");
        hwTwo();

    }
    public static void hwOne(){
        Bird [] birds = addBirds();
        printArr(birds);
    }
    public static void hwTwo(){
        Employee emp = new Employee("Felicia",22,100000);
        Developer dev = new Developer("Johan",30,21333,"Java developer");
        System.out.println(emp.report());
        System.out.println(dev.report());
    }

    public static Bird[] addBirds(){
        return new Bird[]{
                new Eagle(),
                new Kiwi(),
                new Penguin(),
                new Swallow(),
                new Eagle(true, false),
                new Penguin(false, false),
        };
    }
    public static void printArr(Bird[]birds){
        for(int i = 0;i<birds.length;i++){
            birds[i].print();
            birds[i].fly();
            System.out.println("**********************");
        }
    }
}
