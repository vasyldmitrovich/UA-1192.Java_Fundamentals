package com.softserve.edu09.hw;

import java.util.*;

public class CollectionMethods {// Good
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final Random RANDOM = new Random();
    private final String GAP = "-".repeat(175);
    private final String NL = "\n";

    public List<Integer> createArrayList() {
        Integer[] array = new Integer[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = RANDOM.nextInt(-100, 100);
        }
        return new ArrayList<>(List.of(array));
    }

    public void swapMaxMin(List<Integer> arraylist) {
        int maxIndex = arraylist.indexOf(Collections.max(arraylist));
        int minIndex = arraylist.indexOf(Collections.min(arraylist));
        System.out.println(GAP + NL + "ArrayList Starter pack:" + NL + arraylist + NL + GAP);
        Collections.swap(arraylist, maxIndex, minIndex);
        System.out.printf(GAP + NL + "Max value %d in list swapped from index %d to index %d %n", Collections.max(arraylist), maxIndex, minIndex);
        System.out.printf("Min value %d in list swapped from index %d to index %d %n", Collections.min(arraylist), minIndex, maxIndex);
        System.out.println(arraylist + NL + GAP);
    }

    public void changeEl(List<Integer> arraylist) {
        int rand = RANDOM.nextInt(100, 1000);
        for (int i = 0; i < arraylist.size(); i++) {
            if (arraylist.get(i) < 0) {
                arraylist.add(i, rand);
                System.out.printf(GAP + NL + "Three-digit number %d has added on %d position%n", rand, i);
                break;
            }
        }
        System.out.println(arraylist + NL + GAP);
    }

    public void insertZeroBetweenSigns(List<Integer> arraylist) {
        for (int i = 0; i < arraylist.size() - 1; i++) {
            if ((arraylist.get(i) > 0 && arraylist.get(i + 1) < 0)
                    || (arraylist.get(i) < 0 && arraylist.get(i + 1) > 0)) {
                arraylist.add(i + 1, 0);

            }
        }
        System.out.println(GAP + NL + "Inserted 0 between different signs numbers\n" + arraylist + NL + GAP);
    }

    public void listCopy(List<Integer> arraylist) {
        System.out.println(GAP + NL + "Input quantity elemnts to copy: ");
        int kElements = SCANNER.nextInt();
        System.out.println(GAP + NL + "Initial list: " + arraylist);
        List<Integer> list1 = new ArrayList<>(arraylist.subList(0, kElements));
        System.out.println(GAP + NL + "List1 with " + kElements + " elements: " + list1);
        List<Integer> list2 = new ArrayList<>(arraylist.subList(kElements, arraylist.size()).reversed());
        System.out.println(GAP + NL + "Reversed List2 with other elements: " + list2 + NL + GAP);
    }

    public void removeLastEvenEl(List<Integer> arraylist) {
        System.out.println(GAP + NL + "Initital List: " + arraylist);
        if (arraylist.getLast() % 2 == 0) {
            arraylist.remove(arraylist.getLast());
            System.out.println("After remove: " + arraylist + NL + GAP);
        } else System.out.println("There isn't even number on last position in List" + NL + GAP);
    }

    public void removeAfterMin(List<Integer> arraylist) {
        int minIndex = arraylist.indexOf(Collections.min(arraylist));
        System.out.println(GAP);
        System.out.printf("Minimal value is %d on %d position%n", arraylist.get(minIndex), minIndex);
        System.out.println(GAP + NL + "Initial List: " + arraylist + NL + GAP);

        if (minIndex == arraylist.size() - 1) {
            System.out.println("Minimal value is last in List.\nList didn't change: " + arraylist + NL + GAP);
        } else {
            System.out.printf("Remove next element %d from %d position after first minimum" +
                    " %d on %d position%n", arraylist.get(minIndex + 1), minIndex + 1, Collections.min(arraylist), minIndex);
            arraylist.remove(minIndex + 1);
            System.out.println(GAP + NL + "List after remove: " + arraylist + NL + GAP);
        }
    }
}





