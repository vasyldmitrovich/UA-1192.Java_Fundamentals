package com.softserve.edu09.pt;

import java.util.*;

public class App {

    public static void main(String[] args) {// Ok

        task1();
        task2();
        task3();

    }

    public static void task1() {

        // Створення динамічного масиву
        ArrayList<HeavyBox> boxes = new ArrayList<>();

        // Додавання об'єктів HeavyBox до масиву
        boxes.add(new HeavyBox(20, "Toys"));
        boxes.add(new HeavyBox(15, "Books"));
        boxes.add(new HeavyBox(10, "Electponics"));
        // Виведення вмісту масиву за допомогою циклу for-each
        for (HeavyBox box : boxes)
            System.out.println(box);

    }


    public static void task2() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a set of numbers separated by commas:");
        String input = scanner.nextLine();

        // Розділити введений рядок на окремі числа
        String[] numbers = input.split(",\\s*");

        // Видалити дублікати
        Set<String> uniqueNumbers = new LinkedHashSet<>(Arrays.asList(numbers));

        // З'єднати унікальні числа назад у рядок
        String result = String.join(", ", uniqueNumbers);

        // Вивести результат
        System.out.println("Result: " + result);
    }

    public static void task3() {
        Random random = new Random();
        List<Integer> myCollection = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            myCollection.add(random.nextInt(50));

        }
        System.out.println("myCollection: " + myCollection);

        List<Integer> newCollection = new ArrayList<>();
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) > 5) {
                newCollection.add(i);
            }
        }
        System.out.println("newCollection: " + newCollection);

        myCollection.removeIf(num -> num > 20);
        System.out.println("myCollection after removing >20: " + myCollection);

        try {
            myCollection.add(2, 1);
            myCollection.add(8, -3);
            myCollection.add(5, -4);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("error (Element out of bound)");
        }
        System.out.println("myCollection with added elements: ");
        for (int i = 0; i < myCollection.size(); i++) {
            System.out.println("Position - " + i + ", value of element - " + myCollection.get(i));
        }
        Collections.sort(myCollection);
        System.out.println("myCollection: " + myCollection);

    }

}





