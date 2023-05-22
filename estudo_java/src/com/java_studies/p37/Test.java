package com.java_studies.p37;

public class Test {

	public static void main(String[] args) {
		
		
		Student student01 = new Student();
		
		Professor professor01 = new Professor();
		
		Pessoa pessoa01 = new Pessoa();
		
		student01.setName("Franklin");
		
		
		// Outro uso da herança:
		
		Pessoa student02 = new Student(); // Como 'Pessoa' é a superclass da classe 'student' podemos declarar uma classe pessoa, mas instanciar a classe Student
		
		student02.setName("Michael");  // Esse objeto, por mais que seja um instanciamentom da classe Student, só vai ter acesso aos atributos de sua superclass Pessoa 
		
		
		Pessoa professor02 = new Professor();
		
		professor02.setPhone("28409238");
		
	}

}
