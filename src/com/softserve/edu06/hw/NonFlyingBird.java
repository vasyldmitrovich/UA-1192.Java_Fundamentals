package com.softserve.edu06.hw;

public class NonFlyingBird extends Bird{
    public NonFlyingBird(){
        setFeathers(false);
        setLayEggs(true);
    }
    public NonFlyingBird(boolean feathers,boolean layEggs){
        super(feathers, layEggs);
    }
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }

    @Override
    public void print() {

    }
}
