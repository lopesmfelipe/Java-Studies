package com.java_studies.p17;

public class LoopFor {

	public static void main(String[] args) {
		

		// for com mais de uma inicialização e mais de uma atualização, separados por vírgula dentro de suas respectivas áreas:
		for (int i = 0, j = 50, a = 90; i <= a; i += 10, j -= 10) { 
			System.out.println("valor de i: " + i + " || " + "valor de j: " + j);
		}
	
		
		
		// "for" com partes ausentes
		int count = 0;
		for ( ; count < 10 ; ) {      
			System.out.println("Valor de count: " + count);
			count += 2;
		}
		
		
		
		// for sem corpo, sem chaves:
		int soma = 0;
		for (int i = 1; i < 5; soma += i += 3); 
		System.out.println("O valor da soma é: " + soma);
		
		

		/*loop infinito:*/
		
		/*for ( ; ; );*/ 
		
		
		
		
		
	}

}
