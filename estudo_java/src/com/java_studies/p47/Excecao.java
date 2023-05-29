package com.java_studies.p47;

public class Excecao {

	public static void main(String[] args) {

		try {
			int[] vetor = new int[4];

			System.out.println("Antes da exception");

			vetor[4] = 1;
			
			System.out.println("This text will not be printed");
		} catch (ArrayIndexOutOfBoundsException error) {
			System.out.println("System down, please wait a moment and try again");
		}

	}

}
