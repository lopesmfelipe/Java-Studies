package com.java_studies.p31;

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

	private double multiplicaKMporConsumoDeCombustivel(double km) {

		return km * consumoCombustivel;
	}

	double calcularCombustivel(double km) {

		return this.multiplicaKMporConsumoDeCombustivel(km);

	}

}
