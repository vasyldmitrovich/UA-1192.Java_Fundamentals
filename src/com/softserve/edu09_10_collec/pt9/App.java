package com.softserve.edu09_10_collec.pt9;

import java.util.*;

public class App {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

//        task1();
//        task2();
        task3();

    }

    public static void task1() {

        List<HeavyBox> listarr = new ArrayList<>();

        listarr.add(new HeavyBox("First", 1500));
        listarr.add(new HeavyBox("Second", 1600));
        listarr.add(new HeavyBox("Third", 100));
        listarr.add(new HeavyBox("Forth", 250));
        listarr.add(new HeavyBox("Fifth", 860));

        // Access through new for-loop
        for (HeavyBox object : listarr) {
            System.out.println(object);
        }

        System.out.println();


        HeavyBox firstBox = listarr.get(0);
        firstBox.setWeight(firstBox.getWeight() + 1);

        // Access through new for-loop
        for (HeavyBox object : listarr) {
            System.out.println(object);
        }

        System.out.println();

        listarr.removeLast();
        // Access through new for-loop
        for (HeavyBox object : listarr) {
            System.out.println(object);
        }

        System.out.println("Remove all");

        listarr.removeAll(listarr);
        // Access through new for-loop
        for (HeavyBox object : listarr) {
            System.out.println(object);
        }
    }

    public static void task2() {

        List<String> listArr = new ArrayList<>();


        for (int i = 0; i < 10; i++) {
            System.out.print("Input number #" + i + ": ");
            String number = SCANNER.nextLine();
            listArr.add(number);
        }

        System.out.println(listArr.toString());
        System.out.println();

        Set<String> set = new HashSet<>(listArr);
        listArr.clear();
        listArr.addAll(set);

        System.out.println(listArr.toString());

    }

    public static void task3() {

        List<Integer> myCollection = new ArrayList<>();
        Random random = new Random();
        int numberOfElements = 10;

        for (int i = 0; i < numberOfElements; i++) {
            int randomNumber = random.nextInt(50);
            myCollection.add(randomNumber);
        }

        System.out.println(myCollection.toString());

        List<Integer> newCollection = new ArrayList<>();

        for (int i = 0; i < myCollection.size();i++) {
            int number = myCollection.get(i);
            if(number>5){
                newCollection.add(number);
            }
        }

        System.out.println(newCollection.toString());

        for (int i = 0; i < newCollection.size();i++) {
            int number = newCollection.get(i);
            if(number>20){
                newCollection.remove(i);
                i--;
            }
        }

        System.out.println(newCollection.toString());

        myCollection.set(2,1);
        myCollection.set(8,-3);
        myCollection.set(5,-4);

        System.out.println(myCollection.toString());

        Collections.sort(myCollection);

        System.out.println(myCollection.toString());
    }
}
