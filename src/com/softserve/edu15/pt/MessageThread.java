package com.softserve.edu15.pt;

public class MessageThread extends Thread{// This class ok
   private String message;
   private int sleepTime;

    public MessageThread(String message, int sleepTime){
        this.message = message;
        this.sleepTime = sleepTime;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(message);
            try {
                Thread.sleep(sleepTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
