package com.java_studies.p48;

public class MultipleCatch {

	public static void main(String[] args) {
		
		int[] numbers = {90, 100, 5, 3, 1};
		int[] denominador = {2, 0, 2, 2, 9};
		
		for(int i = 0; i < numbers.length; i++) {
			try {
			System.out.println(numbers[i] + "/" + denominador[i] + " = " + (numbers[i]/denominador[i]));
			}
			catch(ArithmeticException exception1) {
				System.out.println("Error - division by zero");
			}
		}
		
		
	}

}
