package com.java_studies.p42;

public class Test42 {

	public static void main(String[] args) {

		Pessoa nPessoa = new Pessoa(); // declara o tipo pessoa mas instancia os tipos diferentes
		Student nStudent = new Student();
		Professor nProfessor = new Professor();

		final int number = 10; // variável 'final' é imutável

		// exemplo 02:

		System.out.println(Constantes.SECRETE_NUMBER);
		Constantes.SECRETE_NUMBER = 2;
		System.out.println(Constantes.SECRETE_NUMBER);

		final int n = 42; // variável não pode ser alterada
		// n = n + 1;

		System.out.println(n);

	}

}
