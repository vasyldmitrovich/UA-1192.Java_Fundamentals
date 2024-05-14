package com.softserve.edu06.hw;

public class FlyingBird extends Bird{
    public FlyingBird(){
        setFeathers(true);
        setLayEggs(true);
    }
    public FlyingBird(boolean feathers,boolean layEggs){
        super(feathers, layEggs);
    }
    @Override
    public void fly() {
        System.out.println("I can fly");
    }

    @Override
    public void print() {

    }
}
