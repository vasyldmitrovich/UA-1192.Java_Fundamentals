package com.softserve.edu15.pt;

public class App {

    public static void main(String[] args) {
        practicalTask1();
        System.out.println("End of the first practical task");

        practicalTask2();
        System.out.println("End of the second practical task");
    }

    public static void practicalTask1() throws RuntimeException{
        try {
            Thread thread = new Thread(new IStudyJava());
            thread.start();
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void practicalTask2() throws RuntimeException{
        try {
            Thread thread1 = new Thread(new HelloWorld());
            Thread thread2 = new Thread(new PeaceInThePeace());
            thread1.start();
            thread2.start();
            thread1.join();
            thread2.join();
            System.out.println("My name is Marian");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


}

class IStudyJava implements Runnable {

    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("I study Java");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}

class HelloWorld implements Runnable {

    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello, world");
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class PeaceInThePeace implements Runnable {

    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Peace in the peace");
                Thread.sleep(3000);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
