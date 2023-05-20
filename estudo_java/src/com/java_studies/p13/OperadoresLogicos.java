package com.java_studies.p13;

public class OperadoresLogicos {

	public static void main(String[] args) {
		
		int valor0 = 0;
		int valor1 = 1;
		
		boolean resultado1 = (valor0 == 10) && (valor1 == 1);
		System.out.println("valor0 é 10 AND valor1 é 1: " + resultado1);
		
		boolean resultado2 = (valor0 == 10) || (valor1 == 1);
		System.out.println("valor0 é 10 OR valor1 é 1: " + resultado2);

		boolean verdadeiro = true;
		boolean falso = false;
		
		System.out.println(verdadeiro && falso);
		System.out.println(falso || verdadeiro);
		System.out.println(!verdadeiro ^ falso);
		System.out.println(! verdadeiro && verdadeiro); // Não verdadeiro "!"
 
		
		
		
		
		
		
	}

}
