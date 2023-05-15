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
		
		
		/*Se a variável que recebe valores for de um tipo primitivo, não da para settar a variável recebendo algum dado do teclado.
		  
		  Porém se for um objeto é possível settar recebendo dados do teclado*/
		
		
		System.out.println("Usando o for each");
		
		for (int nota : notas) { 
			System.out.println(nota);
		}
		
	 /*Boas práticas no "for each" o nome da variável que vai receber os valores do array ou lista, ser o nome singular desse array
	   ou lista*/
		
		System.out.println();
		
		// exemplo 02
		
			double[][] notasPessoas = new double[3][4];  
		
			notasPessoas[0][0] = 7;
			notasPessoas[0][1] = 6;
			notasPessoas[0][2] = 8;
			notasPessoas[0][3] = 10;
		
			notasPessoas[1][0] = 6;
			notasPessoas[1][1] = 5;
			notasPessoas[1][2] = 7;
			notasPessoas[1][3] = 7;
		
			notasPessoas[2][0] = 7;
			notasPessoas[2][1] = 8;
			notasPessoas[2][2] = 9;
			notasPessoas[2][3] = 10;
		
			
			// for each aninhado para percorrer a matriz
			for (double[] notasPessoa : notasPessoas) {
				for(double nota : notasPessoa) {
					System.out.println(nota + " ");
				}
				System.out.println();
			}
			
	}	

}
