package com.softserve.edu06.hw;

public class Penguin extends NonFlyingBird{
    public Penguin(){
        setFeathers(false);
        setLayEggs(true);
    }
    public Penguin(boolean feathers,boolean layEggs){
        super(feathers, layEggs);
    }
    public void print(){
        System.out.println("I'm penguin.\n" +
                "I have feathers:"+isFeathers()+"\n" +
                "I can lay eggs:"+isLayEggs());
    }
}
