package com.java_studies.p16;

public class loopWhile {

	public static void main(String[] args) {
		
		int i = 1;
		int valorMaximo = 100;
		
		while (i <= valorMaximo) {
			System.out.println("Valor da variável i: " + i);
			i++;
		}
		System.out.println(i);
		
		
		do {
			i++;
			System.out.println("Valor da variável i: " + i);	
			} while (i < 106);
		
		System.out.println(i);
		
	}

}
