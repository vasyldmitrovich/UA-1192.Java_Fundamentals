package com.softserve.edu08_nest.hw;

public abstract class Person implements Cloneable {

    private FullName fullName = new FullName();// Make private and add getters and setters for this field
    private int age;

    public Person(String firstName, String lastName, int age) {
        fullName.setFirstName(firstName);
        fullName.setLastName(lastName);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public FullName getFullName() {
        return fullName;
    }

    public void setFullName(FullName fullName) {
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", fullName=" + fullName +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String info() {
        return "First name: " + fullName.getFirstName() + " Last name: " + fullName.getLastName() + " Age: " + age;
    }

    public abstract String activity();


}
