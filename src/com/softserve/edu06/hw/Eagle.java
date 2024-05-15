package com.softserve.edu06.hw;

public class Eagle extends FlyingBird{

    public Eagle(){
        setFeathers(true);
        setLayEggs(true);
    }
    public Eagle(boolean feathers,boolean layEggs){
        super(feathers,layEggs);
    }

    public void print(){
        System.out.println("I'm eagle.\n" +
                "I have feathers:"+isFeathers()+"\n" +
                "I can lay eggs:"+isLayEggs());
    }
}
