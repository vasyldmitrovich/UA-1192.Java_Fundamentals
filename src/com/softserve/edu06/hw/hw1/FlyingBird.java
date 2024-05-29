package com.softserve.edu06.hw.hw1;

public abstract class FlyingBird extends Bird {
    public FlyingBird (String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

        @Override
        public void flay (){
            System.out.println( getClass().getSimpleName() + " is flying");

        }



    }

