package com.java_studies.p45;

public class Main {

	public static void main(String[] args) {
		
		
		//1° - UPCASTING
		Student student01 = new Student(); // (automatico sem precisar do 'cast' na frente só o upcasting)
		Pessoa student02 = student01; // transformando o tipo de uma classe menor em um tipo de uma classe maior
		
		Professor professor01 = new Professor();
		Pessoa professor02 = professor01; // CASTING
		
		Pessoa Pessoa1 = (Pessoa) new Student(); // (up)casting(conversão) MANUAL
		
		//2° - DOWNCASTING 
		Pessoa student03 = new Pessoa();
		Student student04 = (Student) student03; // downcasting(conversão) MANUAL
		
		
	}

}
