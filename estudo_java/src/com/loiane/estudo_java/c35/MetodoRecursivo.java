package com.loiane.estudo_java.c35;

public class MetodoRecursivo {
	
	// metodo NÃO recursivo || // cálculo de fatorial através de um loop normal
	public static int calcularFatorialNormal(int number) {  
		int total = 1;
		for (int i = number; i > 1; i--) {
			total *= i;
		}
		return total;
	}
	
	
	// metodo RECURSIVO || // cálculo de fatorial através de um loop RECURSIVO
	
	
}
