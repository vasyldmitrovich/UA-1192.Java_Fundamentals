package com.softserve.edu03.hw;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    public Person() {

    }
    public Person(String firstName,String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge()
    {
        return 2024-birthYear;
    }

    public void input(String firstName,String lastName,int birthYear){
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }
    public void output(){
        System.out.println("////////////////////////\n" +"Info about person"+
                "\nName:"+firstName+
                "\nLast name:"+lastName+
                "\nAge:"+getAge());
    }

    public void changeName(String fn,String ln){
        setFirstName(fn);
        setLastName(ln);
    }
}
