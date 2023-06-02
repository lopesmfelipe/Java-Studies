package com.java_studies.p52;

public class UsingMyException {

	public static void main(String[] args) {

		try {
			checkNumbersDivision();
		} catch (DivisionNotExact e) {  // catch the exception after
			System.err.println(e.toString());
			e.getMessage();
			System.out.println();
		}

	}

	public static void checkNumbersDivision() throws DivisionNotExact { // Passes that responsibility of handling the exception to the class that calls the method

		int[] numbers = { 4, 8, 5, 16, 32, 21, 64, 128 };
		int[] denominador = { 2, 3, 4, 8, 1, 2, 4 };

		for (int i = 0; i < numbers.length; i++) {
			try {
				if (numbers[i] % 2 != 0) {
					throw new DivisionNotExact(numbers[i], denominador[i]); // throw the exception first
				}
				
				System.out.println(numbers[i] + "/" + denominador[i] + " = " + (numbers[i] / denominador[i]));
			} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
				System.err.println("Some error occurred");
				e.getMessage();
			}
		}

	}

}
