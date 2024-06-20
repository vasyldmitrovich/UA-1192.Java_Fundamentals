package com.softserve.edu15.hw;

public class App {

    public static void main(String[] args) {
        homework1();
        System.out.println("End of the first homework");

        homework2();
        System.out.println("End of the second homework");

        homework3();
        System.out.println("End of the third homework");
    }

    public static void homework1() {
        try {

            Thread thread1 = new Thread(() ->{
                for (int i = 0; i < 5; i++) {
                    System.out.println("The first message");

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            });

            Thread thread2 = new Thread(() -> {
                for (int i = 0; i < 5; i++) {
                    System.out.println("The second message");

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            });

            Thread thread3 = new Thread(() -> {
                for (int i = 0; i < 5; i++) {
                    System.out.println("The third message");
                }
            });

            thread1.start();
            thread2.start();
            thread1.join();
            thread2.join();
            thread3.start();
            thread3.join();
        }catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void homework2() {
        String string1 = "Java";
        String string2 = "Softserve";

        Thread thread1 = new Thread(() -> {
            synchronized (string1) {
                System.out.println("Thread 1 locked " + string1);

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                synchronized (string2) {
                    System.out.println("Thread 1 locked " + string2);
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized (string2) {
                System.out.println("Thread 2 locked " + string2);

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                synchronized (string1) {
                    System.out.println("Thread 2 locked " + string1);
                }
            }

        });

        Thread interruptThread = new Thread(() -> {
            try {
                Thread.sleep(100);
                thread1.interrupt();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        interruptThread.start();
        thread1.start();
        thread2.start();

        System.out.println("If one of the streams is not interrupted while it is sleeping, deadlock will occur");

        try {
            thread1.join();
            thread2.join();
            interruptThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        System.out.println("Both threads have ended");
    }

    public static void homework3() {

        Thread thread1 = new Thread(() -> {

            Thread thread2 = new Thread(() -> {
                for (int i = 0; i < 3; i++) {
                    System.out.println("Thread number two");
                }

                Thread thread3 = new Thread(() -> {
                    for (int i = 0; i < 5; i++) {
                        System.out.println("Thread number three");
                    }
                });

                thread3.start();
                try {
                    thread3.join();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });

            thread2.start();
            try {
                thread2.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        thread1.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
    }
    }
}




