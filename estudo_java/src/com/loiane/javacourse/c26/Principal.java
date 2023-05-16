package com.loiane.javacourse.c26;

import com.loiane.javacourse.c26.Carro;

public class Principal {

	public static void main(String[] args) {
		
		Carro mustang = new Carro();
		Carro audi = new Carro();
		
		
		mustang.velocidadeMaxima = 270.8;
		mustang.numeroPassageiros = 2;
		mustang.capacidadeCombustivel = 45;
		mustang.consumoCombustivel = 0.8;
		mustang.marca = "Ford";
		
		audi.velocidadeMaxima = 290.4;
		audi.numeroPassageiros = 4;
		audi.capacidadeCombustivel = 41;
		audi.consumoCombustivel = 0.4;
		audi.marca = "audi";
		
		System.out.println(mustang.marca);
		System.out.println(mustang.velocidadeMaxima);
		mustang.exibirAutonomiaCombustivel();
		
		System.out.println();
		
		System.out.println(audi.marca);
		System.out.println(audi.velocidadeMaxima);
		audi.exibirAutonomiaCombustivel();
		
		
	}

}
