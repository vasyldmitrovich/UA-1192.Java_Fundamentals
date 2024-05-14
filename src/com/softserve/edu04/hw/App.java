package com.softserve.edu04.hw;

public class App {
    public static void main(String[] args) {

//Here we have 4 tasks of homework. Calling their methods. 5-th task of hw is under these methods.

        hw1.inRange();
        hw1.maxMinNum();
        HTTPError.HW3();
        Faculty.getSeason();


//Created 3 objects by Dog class.I added it to array.


    Dog[] dogs = new Dog[3];
    dogs[0] = new Dog("Gucci", Breed.HUSKY, 5);
    dogs[1] = new Dog("Gucci", Breed.SHEPHERD, 4);
    dogs[2] = new Dog("Check", Breed.LABRADOR, 6);

//Condition which find that we have similar names of our dogs.

    if (dogs[0].getName() == dogs[1].getName()) {
            System.out.println("\nFirst and second dogs have similar names\n");
    } else if (dogs[1].getName() == dogs[2].getName()) {
            System.out.println("\nSecond and third dogs have similar names\n");
    } else if (dogs[2].getName() == dogs[0].getName()) {
            System.out.println("\nFirst and third dogs have similar names\n");
    } else System.out.println("There aren't similar names\n");

//Calling method which find the oldest dog and output this dog name and breed to the console.

        findTheOldest(dogs);
    }

    public static void findTheOldest(Dog[] dogs) {
        Dog theOldest = dogs[0];
        for (int i = 0; i < dogs.length; i++) {
            if (dogs[0].getAge() < dogs[i].getAge()) {
                theOldest = dogs[i];
            }
        }
        System.out.println("Name of the oldest dog is: " + theOldest.getName() +
                "\n" + "Breed of dog is: " + theOldest.getBreed());
    }
}
