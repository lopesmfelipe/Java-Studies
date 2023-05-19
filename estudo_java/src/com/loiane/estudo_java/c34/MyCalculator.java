package com.loiane.estudo_java.c34;

public class MyCalculator {  // classe utilitária, por ter vários "static".

	public static double divisao(double numero1, double numero2) {
		return numero1 / numero2;
	}
	
	public static double divisor(double numero1, double numero2) {
		return numero1 / numero2;
	}

	public static int divisao(int numero1, int numero2) {
		return numero1 / numero2;
	}

	public static double divisao(double numero1, double numero2, double numero3) {
		return numero1 / numero2;
	}

	public static int divisao(int[] array) {

		int total = 0;

		for (int i = 0; i < array.length; i++) {
			total += array[i];
		}

		return total; 

	}
	
}
