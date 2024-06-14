package com.softserve.edu15_thread.hw;

public class App {

    public static void main(String[] args) throws InterruptedException {

//        task1();
//        task2();
        task3();

    }

    public static void task1() throws InterruptedException {

        Runnable m1 = new RunMassage("First Massage", 5);
        Runnable m2 = new RunMassage("Second Massage", 5);
        Runnable m3 = new RunMassage("Third Massage", 5);

        Thread t1 = new Thread(m1);
        Thread t2 = new Thread(m2);
        Thread t3 = new Thread(m3);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        t3.start();
        t3.join();

    }

    public static void task2() {

        final Object r11 = new Object();
        final Object r22 = new Object();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (r11) {
                    System.out.println("Thread 1");

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                    }

                    synchronized (r22) {
                        System.out.println("block 2");
                    }
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (r22) {
                    System.out.println("Thread 2");

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                    }

                    synchronized (r11) {
                        System.out.println("block 1");
                    }
                }
            }
        });

        thread1.start();
        thread2.start();

        try {

            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("MAIN");
    }

    public static void task3() {

        Thread threadOne = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 1 -> 2");

                Thread threadTwo = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        for (int i = 0; i < 3; i++) {
                            System.out.println("Thread number two - " + (i + 1));
                            try {
                                Thread.sleep(500);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }

                        System.out.println("Thread 2 -> 3");

                        Thread threadThree = new Thread(new Runnable() {
                            @Override
                            public void run() {
                                for (int i = 0; i < 5; i++) {
                                    System.out.println("Thread number three - " + (i + 1));
                                    try {
                                        Thread.sleep(500);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }
                            }
                        });

                        threadThree.start();

                        try {
                            threadThree.join();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                });

                threadTwo.start();

                try {
                    threadTwo.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        threadOne.start();
    }
}

