package com.java_studies.p52;

public class UsingMyException {

	public static void main(String[] args) {

		int[] numbers = { 4, 8, 5, 16, 32, 21, 64, 128 };
		int[] denominador = { 2, 0, 4, 8, 0, 2, 4 };

		for (int i = 0; i < numbers.length; i++) {
			try {
				if (numbers[i] % 2 != 0) {
					throw new DivisionNotExact(numbers[i], denominador[i]); // throw the exception first
				}
				System.out.println(numbers[i] + "/" + denominador[i] + " = " + (numbers[i] / denominador[i]));
			} 
			catch (DivisionNotExact e) {  // catch the exception after
				System.err.println(e.toString());
				System.out.println();
				
			}
			catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
				System.err.println("Some error occurred");
				e.printStackTrace();
				e.getMessage();
			}
		}

	}

}
