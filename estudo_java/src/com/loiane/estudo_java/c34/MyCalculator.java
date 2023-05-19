package com.loiane.estudo_java.c34;

public class MyCalculator {

	public double divisao(double numero1, double numero2) {
		return numero1 / numero2;
	}
	
	public double divisor(double numero1, double numero2) {
		return numero1 / numero2;
	}

	public int divisao(int numero1, int numero2) {
		return numero1 / numero2;
	}

	public double divisao(double numero1, double numero2, double numero3) {
		return numero1 / numero2;
	}

	public int divisao(int[] array) {

		int total = 0;

		for (int i = 0; i < array.length; i++) {
			total += array[i];
		}

		return total; 

	}
	
}
