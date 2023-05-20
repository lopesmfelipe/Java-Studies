package com.loiane.estudo_java.c35;

public class MetodoRecursivo {
	
	// metodo NÃO recursivo
	public int calcularFatorial(int number) {  // cálculo de fatorial através de um loop normal
		int total = 1;
		for (int i = number; i > 1; i--) {
			total *= i;
		}
		return total;
	}
	
	
	
	
	
}
