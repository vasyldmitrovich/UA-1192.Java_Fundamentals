package com.softserve.edu12_excep;

public class ApplicationExceptions {

    public static void main(String[] args) { //throws InterruptedException {


        //ArithmeticException
		int i = 0;
		try {
			i = 10 / i;
		//} catch (ArithmeticException e) {
        } catch (IllegalArgumentException e) {
			System.out.println("Error: " + e.getMessage());
		}
		System.out.println("i = " + i);

/*

        //Runtime error
		int[] arr = new int[5];
		arr[0] = 1;
		System.out.println("arr[10] = " + arr[10]);
*/


/*
        //Checked Exception must catch
        int k = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("start start start start start start start start start start start start start start start start start start ");
            Thread.sleep(2000);
        }
        if (k == 0) {
            throw new RuntimeException("ha-ha-ha");
        }
        System.out.println("end");
*/

/*
        //Finally
        try {
            System.out.println("try start work" );
            int i = 2;
            int y = 0;
            i = i/y;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException = " + e);
            return;
        } finally {
            System.out.println("From finally");
        }
*/

    }
}
