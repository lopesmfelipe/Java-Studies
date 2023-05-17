package com.loiane.javacourse.c27;

import com.loiane.javacourse.c27.Carro;

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
		mustang.exibirAutonomiaCombustivel();
		
		double autonomia = mustang.obterAutonomia();
		System.out.println(autonomia);
		
		System.out.println();
		
		System.out.println(audi.marca);
		audi.exibirAutonomiaCombustivel();
		
		autonomia = audi.obterAutonomia();
		System.out.println(autonomia);
		
		
		System.out.println();
		
		double qtdCombustivel = mustang.calcularCombustivel(20);
		System.out.println("A quantidade de combustível necessária para o Mustang andar 20km é = " + qtdCombustivel);
		
		qtdCombustivel = audi.calcularCombustivel(20);
		System.out.println("A quantidade de combustível necessária para o Audi andar 20km é = " + qtdCombustivel);
		
		
		
		
		
	}

}
