package com.softserve.edu15.pt;

public class MyThreadMsg extends Thread{
    private String msg;
    private int interval;
    public MyThreadMsg(String msg, int interval){
        this.msg=msg;
        this.interval= interval;
    }
    @Override
    public void run(){
        for (int i = 0; i<5 ; i++){
            System.out.println(msg);
            try {
                sleep(interval);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
