package com.softserve.edu07.pt.animal;

public class Dog implements Animal {

    //migrate to general abstract
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void voice() {
        System.out.println("Woof");
    }

    @Override
    public void feed(String food) {
        System.out.println("I's " + food);
        smell();

        switch (food.toLowerCase()) {
            case "meat", "chicken" ->
                System.out.println("Wow, so yummy, woof woof");
            default ->
                System.out.println("I don't eat that but in any case I'm happy, woof");
        }
    }

}
