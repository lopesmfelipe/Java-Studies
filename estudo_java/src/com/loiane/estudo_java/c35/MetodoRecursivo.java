package com.loiane.estudo_java.c35;

public class MetodoRecursivo {

	public static int fatorialNaoRecursivo(int numero) {
		
		int fatorial = 1;
		for (int i = numero; i > 1; i--) {
			fatorial *= i;
		}
		return fatorial;
		
	}
}
