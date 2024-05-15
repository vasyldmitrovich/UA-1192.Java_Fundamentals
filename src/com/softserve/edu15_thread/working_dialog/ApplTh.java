package com.softserve.edu15_thread.working_dialog;

public class ApplTh {
	public static void main(String[] args) {
		DialogTime dt = new DialogTime();
		dt.setVisible(true);
		System.out.println("Appl: Thread ID = " + Thread.currentThread().getId());
	}
}