package com.java_studies.p20p4;

import java.util.Scanner;

public class MatrizIrregular {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com o número de pessoas que serão entrevistadas:");
		int numEntrevistados = scan.nextInt();
		
		
		String[][] nomesFilhos = new String[numEntrevistados][];
		
		for (int i = 0; i < nomesFilhos.length; i++) {
			System.out.println("Insira a quantidade de filhos da pessoa " + (i + 1));  // TESTAR 0 FILHOS!!!!
			int qtdFilhos = scan.nextInt();
			
			nomesFilhos[i] = new String[qtdFilhos];  // adicionou um array dentro de uma posição de um array
			
			for (int j = 0; j < nomesFilhos[i].length; j++) {
				
				System.out.println("Digite o nome do filho " + (j+1));
				
				nomesFilhos[i][j] = scan.next();
				
			}
			
		}
		
		for (int i = 0; i < nomesFilhos.length; i++) {
			System.out.println("Pessoa " + (i+1) + " tem " + nomesFilhos[i].length + " filho(s)");
			for (int j = 0; j < nomesFilhos[i].length; j++) {
				System.out.println(nomesFilhos[i][j]);
				
			}
			
		}
		
		
	}

}
