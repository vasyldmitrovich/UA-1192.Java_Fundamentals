package com.softserve.edu15.hw;

public class App {
    public static void main(String[] args) {
//        System.out.println("Task 1");
//        task1();

//        System.out.println("Task 2");
//        task2();

        System.out.println("Task 3");
        task3();
    }

    public static void task1() {
        try {
            Runnable runnable = () -> {
                for (int i = 0; i < 5; i++) {
                    System.out.println(Thread.currentThread().getName() + " " + i);
                }
            };

            Thread firstThread = new Thread(runnable);

            Thread secondThread = new Thread(runnable);

            Thread thirdThread = new Thread(runnable);

            firstThread.start();
            secondThread.start();

            firstThread.join();
            secondThread.join();

            thirdThread.start();

            thirdThread.join();
        } catch (InterruptedException e) {
            System.out.println("Task 1 interrupted");
        }
    }

    public static void task2() {
        final Object resource1 = "Resource 1";
        final Object resource2 = "Resource 2";

        Thread firstThread = new Thread(() -> {
            synchronized (resource1) {
                System.out.println("Thread 1: locked resource 1");

                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    System.out.println("Thread 1: interrupted");
                }

                synchronized (resource2) {
                    System.out.println("Thread 1: locked resource 2");
                }
            }
        });

        Thread secondThread = new Thread(() -> {
            synchronized (resource2) {
                System.out.println("Thread 2: locked resource 2");

                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    System.out.println("Thread 2: interrupted");
                }

                synchronized (resource1) {
                    System.out.println("Thread 2: locked resource 1");
                }
            }
        });

        firstThread.start();
        secondThread.start();

        try {
            firstThread.join();
            secondThread.join();
        } catch (InterruptedException e) {
            System.out.println("Task 2 interrupted");
        }

        System.out.println("Main thread finished");
    }

    public static void task3() {
        Thread threadTwo = new Thread(() -> {

            for (int i = 0; i < 3; i++) {
                System.out.println("Thread number two");
            }

            Thread threadThree = new Thread(() -> {
                for (int j = 0; j < 5; j++) {
                    System.out.println("Thread number three");
                }
            });

            threadThree.start();

            try {
                threadThree.join();
            } catch (InterruptedException e) {
                System.out.println("Thread 3 interrupted");
            }

        });

        Thread threadOne = new Thread(() -> {
            threadTwo.start();
            try {
                threadTwo.join();
            } catch (InterruptedException e) {
                System.out.println("Thread 2 interrupted");
            }
        });

        threadOne.start();

        try {
            threadOne.join();
        } catch (InterruptedException e) {
            System.out.println("Task 3 interrupted");
        }
    }
}
