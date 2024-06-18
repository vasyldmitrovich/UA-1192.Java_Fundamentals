package com.softserve.edu15.hw;

public class MsgThread extends Thread {
    private String msg;

    public MsgThread(String msg) {
        this.msg = msg;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                System.err.println(e.getMessage());
            }
            System.out.println(msg);
        }
    }
}
