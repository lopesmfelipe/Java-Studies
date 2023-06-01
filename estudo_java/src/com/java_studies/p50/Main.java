package com.java_studies.p50;

public class Main {

	public static void main(String[] args) {

		int[] numbers = { 90, 100, 5, 3, 1 };
		int[] denominador = { 2, 0, 2, 2, 6 };

		for (int i = 0; i < numbers.length; i++) {
			try {
				System.out.println(numbers[i] + "/" + denominador[i] + " = " + (numbers[i] / denominador[i]));
			} catch (Exception e) {
				e.getMessage(); // Throwable class method
				e.printStackTrace(); // Throwable class method
			}
		}

	}

}
