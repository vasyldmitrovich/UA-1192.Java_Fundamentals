package ratio.softserve.academy.edu04.hw;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
////        1.
        System.out.println("Enter three float numbers [-5, 5]: ");
        float a = scanner.nextFloat();
        float b = scanner.nextFloat();
        float c = scanner.nextFloat();
        HW4.checkRange(a, b, c);

////        2.
        System.out.println("Enter three integer numbers [min - max]: ");
        int d = scanner.nextInt();
        int e = scanner.nextInt();
        int f = scanner.nextInt();
        HW4.findMaxMin(d, e, f);

//        3.
        System.out.println("Enter HTTP error code: ");
        int code = scanner.nextInt();
        HW4.printHTTPError(code);

//        4
        Faculty faculty = new Faculty(100, Season.WINTER);
        System.out.println(faculty);

//        5
        Dog dog1 = new Dog("Dog1", Dog.Breed.BULLDOG, 5);
        Dog dog2 = new Dog("Dog2", Dog.Breed.BEAGLE, 3);
        Dog dog3 = new Dog("Dog3", Dog.Breed.POODLE, 7);
        Dog[] dogs = {dog1, dog2, dog3};
        for (int i = 0; i < dogs.length; i++) {
            for (int j = i + 1; j < dogs.length; j++) {
                if (dogs[i].getName().equals(dogs[j].getName())) {
                    System.out.println("There are two dogs with the same name: " + dogs[i].getName());
                }
            }
        }
        Dog oldestDog = dogs[0];
        for (int i = 1; i < dogs.length; i++) {
            if (dogs[i].getAge() > oldestDog.getAge()) {
                oldestDog = dogs[i];
            }
        }
        System.out.println("The oldest dog is: " + oldestDog.getName() + ", " + oldestDog.getBreed());
    }
}
