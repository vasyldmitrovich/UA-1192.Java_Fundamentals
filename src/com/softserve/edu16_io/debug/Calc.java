package com.softserve.edu16_io.debug;

public class Calc {
	private int number = 0;

	public Calc(int number) {
		this.number = number;
	}

	public int sumDigits() {
		int sum = 0;
		while (number != 0) {
			sum = sum + number % 10;
//			number = number - 1; // Defect.
			number = Math.abs(number / 10); // Defect.
		}
		try {
			number = 1 / number;
		} catch (Exception e) {
		}
//		System.out.println("Sum is: " + sum);
		return sum;
	}

	//@Deprecated // form JDK 1.5
	/**
	 * @_deprecated form JDK 1.0
	 * @return description.
	 */
	public int countNonZeroDigits() {
		int count = 0;
		int temp = 0;
		while (number != 0) {
			temp = number % 10;
			if (temp > 0) {
				count++;
			}
			number = number / 10;
		}
		return count;
	}
}
