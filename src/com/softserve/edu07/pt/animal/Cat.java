package com.softserve.edu07.pt.animal;

public class Cat implements Animal {

    //migrate to abstract Animal
    String name;// make access modifier Private

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void voice() {
        System.out.println("Meow");
    }

    //it would be nice create enum FoodType
    @Override
    public void feed(String food) {
        System.out.println("I's " + food);
        smell();

        switch (food.toLowerCase()) {
            case "milk", "meat", "fish" ->
                System.out.println("Mmm, ok, good food");
            default ->
                System.out.println("Nah, I don't want it");
        }
    }

}
