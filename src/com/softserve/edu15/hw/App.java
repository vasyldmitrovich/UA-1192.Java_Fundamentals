package com.softserve.edu15.hw;

public class App {

    public static void main(String[] args) {// Nice
        System.out.println("Task 1");
        demonstrateThreeThreadsTask();
        System.out.println();

        System.out.println("Task 2");
        demonstrateDeadlockTask();
        System.out.println();

        System.out.println("Task 3");
        demonstrateThreadsChainTask();
    }

    private static void demonstrateThreeThreadsTask() {// Cool
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread " + Thread.currentThread().getId() + " working");
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread " + Thread.currentThread().getId() + " working");
            }
        });
        Thread t3 = new Thread(() -> {
            try {
                t1.join();
                t2.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread " + Thread.currentThread().getId() + " working");
            }
        });

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private static void demonstrateDeadlockTask() {
        Thread mainThread = Thread.currentThread();
        System.out.println("Main thread starts");

        Thread child = new Thread(() -> {
            System.out.println("Child thread starts");
            try {
                System.out.println("Child thread waiting main");
                mainThread.join();
            } catch (InterruptedException e) {
                System.out.println("Child thread interrupted");
            }
            System.out.println("Child thread ends");
        });

        Thread childBreaker = new Thread(() -> {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            child.interrupt();
        });

        child.start();
        childBreaker.start();

        System.out.println("Main thread waiting child");
        try {
            child.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Main thread ends");
    }

    private static void demonstrateThreadsChainTask() {
        Thread one = new Thread(() -> {
            Thread two = new Thread(() -> {
                for (int i = 0; i < 3; i++) {
                    System.out.println("Thread number 2");
                }

                Thread three = new Thread(() -> {
                    for (int i = 0; i < 5; i++) {
                        System.out.println("Thread number 3");
                    }
                });

                three.start();
                try {
                    three.join();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });

            two.start();
            try {
                two.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        one.start();
        try {
            one.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
