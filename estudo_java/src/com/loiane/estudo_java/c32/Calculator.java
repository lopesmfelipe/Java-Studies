package com.loiane.estudo_java.c32;

public class Calculator {
	
	public double divisao(double numero1, double numero2) {
		return numero1 / numero2;
	}
	
	public int divisao(int numero1, int numero2) {
		return numero1 / numero2;
	}
	
	public double divisao(double numero1, double numero2, double numero3) {
		return numero1 / numero2;
	}
	
	public int divisao(int[] vetor) {
		
		int total = 0;
		
		for (int i = 0; i < vetor.length; i ++) {
			total += vetor[i];
		}
		
		return total;
		
		
		
		
	}
	
}
