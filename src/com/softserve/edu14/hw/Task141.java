package com.softserve.edu14.hw;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Task141 {

    public static void execute(){
        List<Product> products = Stream.generate(Product::createRandom).limit(20).toList();

        List<Product> processed = products.stream().
                sorted(Comparator.comparing(Product::getPrice)).
                filter(product -> product.getManufactureCategory().equalsIgnoreCase("phone")).
                filter(product -> product.getPrice() > 3000).
                filter(product -> product.getManufactureDate().compareTo(LocalDate.now().minusYears(1)) < 0).
                toList();

        processed.forEach(product -> System.out.println(product.getManufactureCategory() +
                " " + product.getPrice() +
                " " + product.getManufactureDate()));

    }

}
