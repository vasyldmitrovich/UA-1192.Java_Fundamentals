package com.softserve.edu14.hw14.hw1;
import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Product {
    private String manufacturer;
    private String category;
    private LocalDate dateOfManufacture;
    private double price;

    public Product(String manufacturer, String category, LocalDate dateOfManufacture, double price) {
        this.manufacturer = manufacturer;
        this.category = category;
        this.dateOfManufacture = dateOfManufacture;
        this.price = price;
    }


    public String getManufacturer() {
        return manufacturer;
    }

    public String getCategory() {
        return category;
    }

    public LocalDate getDateOfManufacture() {
        return dateOfManufacture;
    }

    public double getPrice() {
        return price;
    }

    public static List<Product> getFilteredAndSortedProducts(List<Product> products, String category, double minPrice, LocalDate dateThreshold) {
        return products.stream()
                .filter(p -> p.getCategory().equalsIgnoreCase(category))
                .filter(p -> p.getPrice() > minPrice)
                .filter(p -> p.getDateOfManufacture().isBefore(dateThreshold))
                .sorted(Comparator.comparing(Product::getPrice))
                .collect(Collectors.toList());
    }

    public static Optional<String> mostPopularName(Stream<Product> products) {
        return Optional.empty();
    }

    public static List<Product> createProductList() {
        LocalDate now = LocalDate.now();
        List<Product> productList = List.of(
                new Product("Apple", "Phone", now.minusYears(2), 4000),
                new Product("Samsung", "Phone", now.minusYears(1), 3500),
                new Product("Sony", "TV", now.minusYears(1), 2500),
                new Product("Google", "Phone", now.minusYears(3), 3200),
                new Product("LG", "Phone", now.minusYears(2), 2800),
                new Product("Apple", "Tablet", now.minusYears(1), 1500),
                new Product("Huawei", "Phone", now.minusYears(1), 2900),
                new Product("Sony", "Phone", now.minusYears(2), 3100),
                new Product("Motorola", "Phone", now.minusYears(1), 3800),
                new Product("OnePlus", "Phone", now.minusYears(2), 3300),
                new Product("Xiaomi", "Phone", now.minusYears(1), 2700),
                new Product("Nokia", "Phone", now.minusYears(3), 3600),
                new Product("HTC", "Phone", now.minusYears(1), 3000),
                new Product("BlackBerry", "Phone", now.minusYears(2), 2900),
                new Product("Lenovo", "Laptop", now.minusYears(1), 2000),
                new Product("Dell", "Laptop", now.minusYears(2), 1800),
                new Product("HP", "Laptop", now.minusYears(1), 2100),
                new Product("Acer", "Laptop", now.minusYears(3), 2200),
                new Product("Asus", "Laptop", now.minusYears(1), 1900),
                new Product("Microsoft", "Tablet", now.minusYears(2), 1700)
        );
        return productList;
    }

    public static void main(String[] args) {// Move to App class
        List<Product> productList = createProductList();

        LocalDate oneYearAgo = LocalDate.now().minusYears(1);
        List<Product> filteredProducts = getFilteredAndSortedProducts(productList, "Phone", 3000, oneYearAgo);

        System.out.println("Filtered and sorted products (Category: Phone, Price > 3000, Manufactured > 1 year ago):");
        filteredProducts.forEach(p -> System.out.println(p.getManufacturer() + " - $" + p.getPrice()));
    }
}
