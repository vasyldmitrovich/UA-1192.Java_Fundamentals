package com.softserve.edu06.hw;

public class Kiwi extends NonFlyingBird{
    public Kiwi(){
        setFeathers(false);
        setLayEggs(false);
    }
    public Kiwi(boolean feathers,boolean layEggs){
        super(feathers, layEggs);
    }
    public void print(){
        System.out.println("I'm kiwi.\n" +
                "I have feathers:"+isFeathers()+"\n" +
                "I can lay eggs:"+isLayEggs());
    }
}
