package com.java_studies.p50;

import java.util.Scanner;

public class UsingThrows {

	public static void main(String[] args) {

		try {
			System.out.println(number());
		} catch (Exception e) {
			System.err.print("ERROR DETECTED BY ME ");
			e.printStackTrace();
			e.getMessage();
		}
	}

	public static double number() throws Exception {
		Scanner scan1 = new Scanner(System.in);
		double number1 = scan1.nextDouble();
		return number1;

	}

}
