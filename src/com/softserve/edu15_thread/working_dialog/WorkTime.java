package com.softserve.edu15_thread.working_dialog;

public class WorkTime implements Runnable {
	private DialogTime dialogTime;

	public WorkTime(DialogTime dialogTime) {
		this.dialogTime = dialogTime;
	}

	public void run() {
		long current;
		long ms = System.currentTimeMillis();
		current = ms;
		//
		while (System.currentTimeMillis() - ms < 5000) {
			if (System.currentTimeMillis() - current > 1) {
				current = System.currentTimeMillis();
				dialogTime.setTOutput(new Long(System.currentTimeMillis()).toString());
			}
		}
		dialogTime.setTOutput(new Long(System.currentTimeMillis()).toString());
		System.out.println("WorkTime: Thread ID = " + Thread.currentThread().getId());
	}

}