package com.java_studies.p45;

public class Main {

	public static void main(String[] args) {
		
		// UPCASTING
		Pessoa aluno01 = new Student(); // aumenta
		Pessoa aluno02 = (Pessoa) new Student();
		
		// DOWNCASTING
		Student student = (Student) aluno02;  // abaixa
		System.out.println(student);
		
	}

}
