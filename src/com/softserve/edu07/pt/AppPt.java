package com.softserve.edu07.pt;

public class AppPt {
    public static void main(String[] args) {// Oo this is nice
        System.out.println("--------------------------First task--------------------------");
        firstTask();
        System.out.println("--------------------------Second task--------------------------");
        secondTask();
    }

    public static void firstTask(){
        Animal[]animal = {
                new Cat(),
                new Dog(),
                new Cat(),
                new Cat(),
                new Dog(),
                new Dog(),
        };
        showWhatICan(animal);
    }
    public static void showWhatICan(Animal[] animal){

        for (int i =0;i< animal.length;i++){
            animal[i].voice();
            animal[i].feed();
            System.out.println("|------------------------------|");
        }
    }

    public static void secondTask(){
        Person [] persons = {
                new Student("Pavlo"),
                new Student("Ivan"),
                new Teacher("Vasyl"),
                new Teacher("Dima"),
                new Cleaner("Nina"),
                new Cleaner("Natali")
        };
        showPersonInfo(persons);
    }

    public static void showPersonInfo(Person[]persons){
        for (var Person:persons){
            Person.print();
            if(Person instanceof Staff staff){
                System.out.println("My salary:"+staff.salary());
            }
            System.out.println("****************************");
        }
    }
}

