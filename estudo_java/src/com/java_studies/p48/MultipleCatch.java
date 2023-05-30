package com.java_studies.p48;

public class MultipleCatch {

	public static void main(String[] args) {

		int[] numbers = { 90, 100, 5, 3, 1 };
		int[] denominador = { 2, 0, 2, 2 };

		for (int i = 0; i < numbers.length; i++) {
			try {
				System.out.println(numbers[i] + "/" + denominador[i] + " = " + (numbers[i] / denominador[i]));
			} catch (ArrayIndexOutOfBoundsException | ArithmeticException e) { // two similar exceptions can be on the
																				// same 'catch' with "or" "|"
				System.out.println("An erro ocurred.");
			} catch (Throwable y) { // Generic catch goes last
				System.out.println("An error occurred, please wait a minute and try again");
			}
		}

	}

}
