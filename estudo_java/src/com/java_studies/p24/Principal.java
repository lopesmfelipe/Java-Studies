package com.java_studies.p24;


public class Principal {

	public static void main(String[] args) {

		CarroEsportivo mustang = new CarroEsportivo();
		CarroEsportivo audi = new CarroEsportivo();
		
		
		mustang.velocidadeMaxima = 270.8;
		mustang.numeroPassageiros = 2;
		mustang.capacidadeCombustivel = 45;
		mustang.marca = "Ford";
		
		audi.velocidadeMaxima = 290.4;
		audi.numeroPassageiros = 4;
		audi.capacidadeCombustivel = 41;
		audi.marca = "audi";
		
		System.out.println(mustang.marca);
		System.out.println(mustang.velocidadeMaxima);
		System.out.println();
		System.out.println(audi.marca);
		System.out.println(audi.velocidadeMaxima);
	}
	
}
