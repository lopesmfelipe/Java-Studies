package com.java_studies.p41;

public class Main {

	public static void main(String[] args) {

		Pessoa student01 = new Student();
		Pessoa professor01 = new Professor();

		student01.setPhone("1111111111");
		professor01.setPhone("999999999");
		
		
		//Polimorfismo, mesmo método de forma diferente
		student01.imprimirEtiquetaEndereco();
		professor01.imprimirEtiquetaEndereco();

	}

}
