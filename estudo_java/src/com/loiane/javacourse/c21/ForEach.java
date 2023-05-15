package com.loiane.javacourse.c21;

import java.util.Random;

public class ForEach {

	public static void main(String[] args) {
		
		int[] notas = new int[5];
		
		Random random = new Random();
		
		for (int i = 0; i < notas.length; i++) {
			
			notas[i] = random.nextInt(5); // limita quais números podem aparecer
		}
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println(notas[i]);
		}
		
		
		/*Se a variável que recebe valores for de um tipo primitivo, a leitura de teclado não funciona, ou seja, não da para settar a 
		  variável recebendo algum dado do teclado.
		  
		  Porém se for um objeto é possível settar recebendo dados do teclado*/
		
		
		System.out.println("Usando o for each");
		
		for (int nota : notas) { 
			System.out.println(nota);
		}
		
	 /*Boas práticas no "for each" o nome da variável que vai receber os valores do array ou lista, ser o nome singular desse array
	   ou lista*/
		
	}	

}
