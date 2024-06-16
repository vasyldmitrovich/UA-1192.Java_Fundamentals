package com.softserve.edu15.hw;

public class HomeWorkTask {
    private final static Object first = new Object();
    private final static Object second = new Object();

    public void task1() {

        MyThread thread1 = new MyThread("Thread 1");
        MyThread thread2 = new MyThread("Thread 2");
        MyThread thread3 = new MyThread("Thread 3");
        thread1.run();
        thread2.run();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
        }

        thread3.run();

    }

    public void task2() {

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (first) {
                    System.out.println("t1 lock object first");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                    }
                    synchronized (second) {
                        System.out.println("t1 lock object second");
                    }
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (second) {
                    try {
                        System.out.println("t2 lock object second");
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                    }
                    synchronized (first) {
                        System.out.println("t2 lock object first");
                    }
                }
            }
        });
        t1.start();
        t2.start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(t1.getState());
        System.out.println(t2.getState());
        System.out.println("Deadlock exit through 10 sek");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
        }
        return;
    }

    public void task3() {

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Thread t2 = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        for (int i = 0; i < 3; i++) {
                            System.out.println("Thread number two");
                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException e) {
                            }
                        }

                        Thread t3 = new Thread(new Runnable() {
                            @Override
                            public void run() {
                                for (int i = 0; i < 5; i++) {
                                    System.out.println("Thread number three");
                                    try {
                                        Thread.sleep(1000);
                                    } catch (InterruptedException e) {
                                    }
                                }
                            }
                        });

                        t3.start();
                        try {
                            t3.join();
                        } catch (InterruptedException e) {
                        }
                    }
                });

                t2.start();
                try {
                    t2.join();
                } catch (InterruptedException e) {
                }
            }
        });
        t1.start();
        return;
    }

}
