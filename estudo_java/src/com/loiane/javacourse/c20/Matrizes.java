package com.loiane.javacourse.c20;

public class Matrizes {

	public static void main(String[] args) {
		
		double[][] competidores = new double[3][4];  
		
		competidores[0][0] = 7;
		competidores[0][1] = 6;
		competidores[0][2] = 8;
		competidores[0][3] = 10;
		
		competidores[1][0] = 6;
		competidores[1][1] = 5;
		competidores[1][2] = 7;
		competidores[1][3] = 7;
		
		competidores[2][0] = 7;
		competidores[2][1] = 8;
		competidores[2][2] = 9;
		competidores[2][3] = 10;
		
		for (int i = 0; i < competidores.length; i++) {
			for (int j = 0; j < competidores[i].length; j++) {
				System.out.println(competidores[i][j] + " ");
			}
			System.out.println();
		}
		
		competidores[2][3] = 7;
		competidores[2][2] = 6;
		competidores[2][1] = 9.5;
		competidores[2][0] = 6.5;
		
		
		
		System.out.println();
		
		for (int i = 0; i < competidores.length; i++) {
			for (int j = 0; j < competidores[i].length; j++) {
			System.out.println(competidores[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("Calculando a média de cada aluno:\n");
		
		double notasSomadas;
		double divisor = competidores[0].length;
		int numeroAluno = 0;
		
		for (int k = 0; k < competidores.length; k++) {
			notasSomadas = 0;
			for (int l = 0; l < competidores[k].length; l++) {
				notasSomadas += competidores[k][l];
			}
			System.out.println("A média de notas do aluno " + (++numeroAluno) + " é: " + (notasSomadas/divisor));
			
		}
		
	}

}
