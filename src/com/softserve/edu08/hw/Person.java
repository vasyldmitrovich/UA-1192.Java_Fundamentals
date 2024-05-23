package com.softserve.edu08.hw;

public abstract class Person implements Cloneable{
    FullName fullName;
    int age;

    public Person(FullName fullName, int age){
        this.fullName = fullName;
        this.age = age;
    }

    public String info(){
        return String.format("\"First name: %s, Last name: %s, Age: %d\"", fullName.getFirstName(), fullName.getLastName(), age);
    }

    public abstract String activity();

}
