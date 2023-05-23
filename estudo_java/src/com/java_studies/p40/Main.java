package com.java_studies.p40;

public class Main {

	public static void main(String[] args) {
		
		Pessoa pessoa01 = new Pessoa();
		Pessoa student01 = new Student();
		Pessoa professor01 = new Professor();
		

		pessoa01.setAdress("New York");
		student01.setAdress("Los Angeles");
		professor01.setAdress("Las Vegas");

		System.out.println(pessoa01.obterEtiquetaEndereco());
		System.out.println(student01.obterEtiquetaEndereco());
		System.out.println(professor01.obterEtiquetaEndereco());

		
	}

}
