package com.softserve.edu14.hw;

import com.softserve.edu12.pt.Color;
import com.softserve.edu12.pt.ColorException;

import java.text.Format;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.IllegalFormatException;
import java.util.List;
import java.util.Objects;

public class Product {
    private Category category;
    private LocalDate localDate;
    private int price;

    public Product(int price, String categoryStr, LocalDate localDate) throws CategoryException, IllegalFormatException {
        if (price < 0) {
            throw new IllegalArgumentException("The price cannot be less than zero!");
        } else {
            this.price = price;
        }

        Category category = categoryStrToEnam(categoryStr);
        this.category = category;

        this.localDate = localDate;

    }


    private Category categoryStrToEnam(String categoryStr) throws CategoryException {
        for (var category : Category.values()) {
            if (categoryStr.equalsIgnoreCase(category.name())) {
                return category;
            }
        }
        throw new CategoryException("No such category exists");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return price == product.price && category == product.category && Objects.equals(localDate, product.localDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(category, localDate, price);
    }

    @Override
    public String toString() {
        return "Product{" +
                "category=" + category +
                ", localDate=" + localDate +
                ", price=" + price +
                '}';
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
