package com.softserve.edu04.HW.pt;


class Product {
    String name;
    double price;
    int quantity;

    //Constructor

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    // Getter for name
    public String getName() {
        return name;
    }
    // Setter for name
    public double getPrice(){
        return price;
    }
    public int getQuantity(){
        return quantity;
    }
    @Override
    public String toString(){
        return "Product{"+
                "name='"+name+'\''+
                ",price="+price+
                ",quantity="+quantity+'}';

    }
  }
