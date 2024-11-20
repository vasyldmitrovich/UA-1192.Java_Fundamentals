package com.softserve.edu12_excep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Application {

	public static void main(String[] args) {
		System.out.println("Statr");
		try {
			mySleep(2000);
			System.out.println("div = " + div());
			//System.out.println("div = " + div2());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("ERROR InterruptedException");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("ERROR Exception");
		}
		System.out.println("done");
	}

	public static void mySleep(long milisec) throws InterruptedException {
		Thread.sleep(milisec);
	}

	public static int div() { // throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("n=");
			int n = Integer.parseInt(br.readLine());
			System.out.print("k=");
			int k = Integer.parseInt(br.readLine());
			if (k == -1) {
				throw new Exception("hahaha");
			}
			return n / k;
		}


		catch (NumberFormatException | IOException e) {
			System.out.println("NumberFormatException | IOException");
			return -1;
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException");
			e.printStackTrace();
			//System.exit(0);
			return -2;
		} catch (Exception e) {
			System.out.println("Exception");
			System.out.println("message = " + e.getMessage());
//			if (br != null) {
//				throw e;
//			}
			return -3;
		} finally {
			System.out.println("finally");
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static int div2() { // throws Exception {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			System.out.print("n=");
			int n = Integer.parseInt(br.readLine());
			System.out.print("k=");
			int k = Integer.parseInt(br.readLine());
			if (k == -1) {
				throw new Exception("hahaha");
			}
			return n / k;
		} catch (NumberFormatException | IOException e) {
			System.out.println("NumberFormatException | IOException");
			return -1;
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException");
			// System.exit(0);
			return -2;
		} catch (Exception e) {
			System.out.println("Exception");
			System.out.println("message = " + e.getMessage());
//			if (br != null) {
//				throw e;
//			}
			return -3;
		} finally {
			System.out.println("finally");
			//return 12345;
		}
	}


}
