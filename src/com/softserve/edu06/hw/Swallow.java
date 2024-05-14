package com.softserve.edu06.hw;

public class Swallow extends FlyingBird{
    public Swallow(){
        setFeathers(true);
        setLayEggs(true);
    }
    public Swallow(boolean feathers,boolean layEggs){
        super(feathers, layEggs);
    }
    public void print(){
        System.out.println("I'm swallow.\n" +
                "I have feathers:"+isFeathers()+"\n" +
                "I can lay eggs:"+isLayEggs());
    }
}
