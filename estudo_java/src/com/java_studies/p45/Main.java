package com.java_studies.p45;

public class Main {

	public static void main(String[] args) {
		
		// UPCASTING
		Pessoa aluno01 = new Student(); // aumenta
		Pessoa aluno02 = (Pessoa) new Student();
		Pessoa professor01 = new Professor();
		
		// DOWNCASTING
		Student student01 = (Student) aluno02;  // abaixa
		System.out.println(student01);
		
		// INSTANCEOF
		Pessoa pessoa = new Pessoa();
		Student zaraki = new Student();
		Professor professor = new Professor();
		
		if (zaraki instanceof Student) { // true
			System.out.println("Do tipo Student");
		}
		if (pessoa instanceof Pessoa) { // true
			System.out.println("Do tipo Pessoa");
		}
		if (professor instanceof Professor) { // true
			System.out.println("Do tipo Professor");
		}
		
		metodoY(professor01);
	}
	
	public static void metodoY(Pessoa pessoaX) {
		if (pessoaX instanceof Professor) {
			Professor professor02 = (Professor) pessoaX;
			professor02.setWage(3000.00);;
			System.out.println(professor02.getWage());
		}
		
	}

}
