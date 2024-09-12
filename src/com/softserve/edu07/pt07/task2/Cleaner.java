package com.softserve.edu07.pt07.task2;

public class Cleaner extends Staff {

    private static final String TYPE_PERSON = "Прибиральник";

    public Cleaner(String name) {
        super(name);
        System.out.println("Тип особистості: " + TYPE_PERSON);
    }

    @Override
    public void print() {
        System.out.println("Я прибиральник, моє ім'я: " + getName());
    }

    @Override
    public double salary() {
        return 30000.0;
    }
}
