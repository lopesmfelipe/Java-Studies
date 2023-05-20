package com.loiane.estudo_java.c35;

public class MetodoRecursivo {
	
	// metodo NÃO recursivo
	public int calcularFatorial(int number) {
		int total = 1;
		for (int i = number; i > 1; i--) {
			total *= i;
		}
		return total;
	}
	
	
	
}
