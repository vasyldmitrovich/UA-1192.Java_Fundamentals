package com.softserve.academy.edu07.pt;


import com.softserve.academy.edu07.pt.task_2.Person;
import com.softserve.academy.edu07.pt.task_2.Cleaner;
import com.softserve.academy.edu07.pt.task_1.Animal;
import com.softserve.academy.edu07.pt.task_1.Cat;
import com.softserve.academy.edu07.pt.task_1.Dog;
import com.softserve.academy.edu07.pt.task_2.*;

public class App {

    public static void main(String[] args) {// Ok
        task1();
        task2();
    }

    public static void task1() {
        System.out.println("Task 1:" +
                "        Create an interface called Animal with methods voice() and feed(). Create two classes\n" +
                "Cat and Dog, which implement this interface. In main() method create an array of Animal\n" +
                "and add some Cats and Dogs to it. Call voice() and feed() method for all of it.\n");

        Animal[] animals = new Animal[5];
        animals[0] = new Cat();
        animals[1] = new Cat();
        animals[2] = new Cat();
        animals[3] = new Dog();
        animals[4] = new Dog();

        for (Animal animal : animals) {
            animal.voice();
            animal.feed();
        }
    }

    public static void task2() {
        System.out.println("Task 2:" +
                "        Realize next structure of classes. In abstract class\n" +
                "Person with property name, declare abstract\n" +
                "method print(). In other extended classes in body of\n" +
                "method print() output text “I am a ...”. In class Staff\n" +
                "declare abstract method salary(). In each concrete\n" +
                "class create constant TYPE_PERSON. Output type of\n" +
                "person in each constructors. In main() method\n" +
                "create an array of Person and add some Teachers,\n" +
                "Cleaners and Students. Call method print() for all of\n" +
                "it. Call method salary() for all Teachers and Cleaners.\n");

        Person[] people = {
                new Teacher("Alice"),
                new Cleaner("Bob"),
                new Student("Charlie"),
                new Teacher("David"),
        };

        for (Person person : people) {
            person.print();
        }

        for (Person person : people) {
            if (person instanceof Staff) {
                Staff staff = (Staff) person;
                System.out.println(staff.getName() + "'s salary: " + staff.salary());
            }
        }

    }
}
