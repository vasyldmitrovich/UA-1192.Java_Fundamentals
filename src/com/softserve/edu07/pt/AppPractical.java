package com.softserve.edu07.pt;

import com.softserve.edu07.pt.entity.t2.*;
import com.softserve.edu07.pt.intf.Animal;
import com.softserve.edu07.pt.entity.t1.Cat;
import com.softserve.edu07.pt.entity.t1.Dog;

public class AppPractical {
    public static void main(String[] args) {
       //task1
        Animal[] animals = new Animal[3];
        animals[0] = new Dog();
        animals[1]=new Cat();
        animals[2]=new Dog();

        for (Animal animal : animals){
            animal.voice();
            animal.feed();
        }
        //task2
       Person[] people = new Person[4];
        people[0] = new Teacher("John Smith");
        people[1] = new Cleaner("Mary Johnson");
        people[2] = new Student("James Williams");
        people[3] = new Teacher("Linda Brown");

        for(Person person: people){
            person.print();
            if (person instanceof Staff){
                ((Staff) person).salary();
            }
        }
    }
}





