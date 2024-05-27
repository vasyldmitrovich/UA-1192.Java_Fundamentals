package com.softserve.edu09.hw;

import java.util.*;

public class ArrayListOperator {


    public ArrayList<Integer> swapMaxMin(ArrayList<Integer> numbers) {

        Collections.swap(numbers, numbers.indexOf(Collections.max(numbers)), numbers.indexOf(Collections.min(numbers)));
        return numbers;
    }


    public ArrayList<Integer> insert3Digs(ArrayList<Integer> numbers) {

        Iterator<Integer> iterator = numbers.iterator();

        while (iterator.hasNext()) {
            Integer element = iterator.next();
            if (element < 0) {
                Random random = new Random();
                numbers.add(numbers.indexOf(element), random.nextInt(100, 1000));
                break;
            }
        }

        return numbers;
    }


    public ArrayList<Integer> insertZero(ArrayList<Integer> numbers) {

        for (int i = 1; i < numbers.size(); i++) {
            int a = numbers.get(i);
            int b = numbers.get(i - 1);
            if (a * b < 0) {
                numbers.add(i, 0);
            }
        }
        return numbers;
    }

    public ArrayList<Integer> copyRev(int index, ArrayList<Integer> numbers) {

        List<Integer> list1 = numbers.subList(0, index);
        List<Integer> list2 = numbers.subList(index, numbers.size());

        Collections.reverse(list2);

        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);

        return numbers;
    }


    public ArrayList<Integer> removeLastEven(ArrayList<Integer> numbers) {

        for (int i = numbers.size()-1; i >= 0; i--) {
            if (numbers.get(i) % 2 == 0) {
                numbers.remove(i);
                break;
            }
            if (i == 0) {
                System.out.println("No even elements in the list");
            }
        }
        return numbers;
    }

    public ArrayList<Integer> removeFollowing(ArrayList<Integer> numbers) {

        int index = numbers.indexOf(Collections.min(numbers));

        if (index < numbers.size()-1){
            numbers.remove(index+1);
        }

        return numbers;
    }
}
