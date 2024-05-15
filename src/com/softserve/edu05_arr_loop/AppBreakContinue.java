package com.softserve.edu05_arr_loop;

public class AppBreakContinue {
	public static void main(String[] args) {


		//***Break, Continue***
/*
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = -1;
		}
		System.out.println("arr = " + Arrays.toString(arr));
		//
		Scanner sc = new Scanner(System.in);
		int n = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Input number: ");
			n = Integer.parseInt(sc.nextLine());
			if (n < 0) {
				break;
				//continue;
			}
			arr[i] = n;
		}
		System.out.println("Array: " + Arrays.toString(arr));
		sc.close();
*/


		//***Sum***
/*
		int[] arr = { 2, -5, 7, 8, -4, 1 };
		//
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println("Sum = " + sum);
		//
		int product = 1;
		for (int i = 0; i < arr.length; i++) {
			product = product * arr[i];
		}
		System.out.println("Product = " + product);
		//
		int amount = 0;
		for (int a : arr) {
			if (a > 0 && a <= 7) {
				amount++;
			}
		}
		System.out.println("Amount = " + amount);
*/

		//***Max***
/*
		int[] arr = { 2, -5, 7, 8, -4, 1, 7 };
	    int imax = 0;
		int max = arr[imax];
		System.out.println("Current max = " + max + "  position = " + (imax + 1));
		for (int i = 0; i < arr.length; i++) {
			System.out.println("\t Review element arr[" + (i + 1) + "] = " + arr[i]);
			if (arr[i] > max) {
				imax = i;
				max = arr[imax];
				System.out.println("New max = " + max + "  position = " + (imax + 1));
			}
		}
		System.out.print("Maximum = " + max);
		System.out.println(" is in " + (imax + 1) + " place");
*/
	}
}
