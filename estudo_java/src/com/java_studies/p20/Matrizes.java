package com.java_studies.p20;

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
			System.out.println("A média de notas do aluno " + (++numeroAluno) + " é: " + (notasSomadas / divisor));
		}

		System.out.println("----------------");

		// Como inicializar Arrays Matrizes de uma vez:

		double[] notasAluno01 = { 5, 7, 10, 10 }; // Iniciando um Array normal

		double[][] alunosNotas = { { 8, 9, 9.6, 8.3 }, { 9, 6, 7, 5.8 } }; // Iniciando uma MatrizCada chave é um índice
																			// do array que possui suas respectivas
																			// posições dentro(que neste caso são as
																			// notas)

		System.out.println("OutPut da matriz alunosNotas");
		System.out.println("-----------------");

		int id = 1;
		for (int i = 0; i < alunosNotas.length; i++) {
			System.out.println("As notas do aluno " + id + " são: ");

			for (int j = 0; j < alunosNotas[i].length; j++) {
				System.out.print(alunosNotas[i][j] + " | ");
			}
			id++;
			System.out.println();
		}
		int nAluno = 1;
		for (int x = 0; x < alunosNotas.length; x++) {
			double somaNotas = 0;
			int divisao = alunosNotas[x].length;

			for (int y = 0; y < alunosNotas[x].length; y++) {
				somaNotas += alunosNotas[x][y];
			}
			System.out.println("A média do aluno " + nAluno + " é: " + (somaNotas / divisao));
			System.out.println("-----------------------------");
			nAluno++;
		}
	}

}
