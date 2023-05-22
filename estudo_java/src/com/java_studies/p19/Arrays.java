package com.java_studies.p19;

public class Arrays {

	public static void main(String[] args) {
		
		//Programa para armazenar a temperatura de cada dia do ano
		
		
		
		// boa prática java (colocar o colchete logo após o tipo do array):		
		double[] temperaturas = new double[365]; 
		
		temperaturas[0] = 20.1;
		temperaturas[1] = 31.6;
		temperaturas[2] = 41.2;
		temperaturas[3] = 15.4;
		temperaturas[4] = 2.9;
		
		
		System.out.println("Tamanho do array: " + temperaturas.length); // Para saber quantas posições o array possui(array's length)
		
		System.out.println("Valores do array: ");
		
		for (int i = 0; i < temperaturas.length; i++) {
			System.out.println("O valor da temperatura do dia " + (i + 1) + " é: " + temperaturas[i]);
		}

		
		// for each (for melhorado): 
		for (double dia : temperaturas) { // criada a variável "dia" para cada um dos valores do array "temperaturas"
			System.out.println(dia);		
		}
		
		// 'for each' apenas irá mostrar o valor. Caso queira mostrar o contador ou os índices do array, terá que ser o for normal
	}

}
