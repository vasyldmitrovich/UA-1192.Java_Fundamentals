package com.softserve.edu14.hw;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Task1 {//можливо намудрив з методами фільтрації і треба було все таки зробити лише 1
    //але для того, щоб наглядно на кожному етапі дивитися результат, зробив ось так.
    public static Random random = new Random();
    public static String TWENTYRISKS = "-".repeat(20);
    public static String[] categories = Arrays.stream(Category.values())
            .map(Category::name)
            .toArray(String[]::new);

    public static void run() {
        List<Product> productList = createProductList();
        System.out.println("Generated list:");
        showProduct(productList);

        List<Product> filteredlistByCategory = filterByCategory(productList);
        System.out.println("********* Filtered list by category Phone *********");
        checkNullList(filteredlistByCategory);

        List<Product> filteredlistByCategoryAndYear = filterByCategoryAndYear(productList);
        System.out.println("***** Filtered list by category Phone and date manufacture > 1 year *****");
        checkNullList(filteredlistByCategoryAndYear);

        List<Product> filteredlistByCategoryAndYearAndPrice = filterByCategoryAndYearAndPrice(productList);
        System.out.println("***** Filtered list by category Phone and date manufacture > 1 year and price > 3000 *****");
        checkNullList(filteredlistByCategoryAndYearAndPrice);
    }

    private static List<Product> filterByCategory(List<Product> productList) {
        return productList.stream()
                .filter(product -> product.getCategory().toString().equalsIgnoreCase("phone"))
                .toList();
    }

    private static List<Product> filterByCategoryAndYear(List<Product> productList) {
        int currentYear = LocalDate.now().getYear();
        List<Product> filteredlistByCategory = filterByCategory(productList);
        return filteredlistByCategory.stream()
                .filter(product -> currentYear - product.getLocalDate().getYear() > 1)
                .toList();
    }

    private static List<Product> filterByCategoryAndYearAndPrice(List<Product> productList) {
        List<Product> filteredlistByCategoryAndYear = filterByCategoryAndYear(productList);
        return filteredlistByCategoryAndYear.stream()
                .filter(product -> product.getPrice() > 3000)
                .toList();
    }

    private static void checkNullList(List<Product> productList) {
        if (productList.isEmpty()) {
            System.out.println("There are no products with such criteria");
        } else {
            showProduct(productList);
        }
    }

    private static List<Product> createProductList() {           //Сам до цього додумався, окрім генерації дня в даті, там чат підказав
        List<Product> productList = new ArrayList<>();
        int count = 0;
        try {
            do {
                productList.add(new Product(
                        random.nextInt(10000),
                        categories[random.nextInt(categories.length)],
                        getRandomDate()));
                count++;
            } while (productList.size() != 20);
        } catch (CategoryException | IllegalArgumentException | DateTimeParseException e) {
            System.err.println(e.getMessage());
        }
        return productList;
    }

    private static LocalDate getRandomDate() {
        int year = random.nextInt(2010, 2025);
        int month = random.nextInt(12) + 1;
        int day = random.nextInt(1, Month.of(month).length(LocalDate.of(year, month, 1).isLeapYear()) + 1);
        return LocalDate.of(year, month, day);


    }

    public static void showProduct(List<Product> productList) {
        for (var product : productList) {
            System.out.println(
                    "Product category:" + product.getCategory().toString().toLowerCase() +
                            "\nProduct price:" + product.getPrice() +
                            "\nProduct date of production:" + product.getLocalDate() + "\n" + TWENTYRISKS);
        }
    }

}
