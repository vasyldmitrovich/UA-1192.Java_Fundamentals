package com.softserve.edu15.hw;

public class MessageThread implements Runnable{
   private String message;


    public MessageThread(String message){
        this.message = message;

    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(message);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
