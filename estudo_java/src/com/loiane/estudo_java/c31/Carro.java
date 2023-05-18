package com.loiane.estudo_java.c31;

public class Carro {

	String tipo;
	String marca;
	double velocidadeMaxima;
	int numeroPassageiros;
	double capacidadeCombustivel;
	double consumoCombustivel;

	void exibirAutonomiaCombustivel() {
		System.out.println("A autonoma do carro é: " + capacidadeCombustivel * consumoCombustivel + "km");
	}

	double obterAutonomia() {

		System.out.println("Método obterAutonomia foi chamado");

		return capacidadeCombustivel * consumoCombustivel;
	}

	double calcularCombustivel(double km) {

		double qtdCombustivel = km * consumoCombustivel;

		return qtdCombustivel;
	}

}
