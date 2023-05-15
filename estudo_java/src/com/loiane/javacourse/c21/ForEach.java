package com.loiane.javacourse.c21;

import java.util.Random;

public class ForEach {

	public static void main(String[] args) {
		
		int[] notas = new int[5];
		
		Random random = new Random();
		
		for (int i = 0; i < notas.length; i++) {
			
			notas[i] = random.nextInt(10);
		}
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println(notas[i]);
		}
		
		
		System.out.println("Usando o for each");
		
		
		for (int nota : notas) { // Boas práticas no "for each" o nome da variável que vai receber os valores do array ou lista, ser o nome singular desse array ou lista 
			System.out.println(nota);
		}
		
		
		
	}

}
