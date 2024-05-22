package com.softserve.edu08_nest.hw;

public class App {

    public static void main(String[] args) throws CloneNotSupportedException {

        Student person1 = new Student("Tamara", "Xan", 10, 5);
        Student person2 = new Student("Bogdan", "Juk", 25, 2);

        System.out.println(person1.info() + "\n" + person1.activity());
        System.out.println(person2.info() + "\n" + person2.activity());

        Student copyOfPerson1 = (Student) person1.clone();

        copyOfPerson1.setCourse(0);

        System.out.println(person1.info() + "\n" + person1.activity());
        System.out.println(person2.info() + "\n" + person2.activity());
        System.out.println(copyOfPerson1.info() + "\n" + copyOfPerson1.activity());

    }


}
