package com.loiane.estudo_java.c29;

public class Carro {

	String tipo;
	String marca;
	double velocidadeMaxima;
	int numeroPassageiros;
	double capacidadeCombustivel;
	double consumoCombustivel;

	Carro() {
		System.out.println("Classe 'carro' foi instanciada.");
		tipo = "elétrico";
	}

	Carro(String tipo2, String marca2, double velocidadeMaxima2, int numeroPassageiros2, double capacidadeCombustivel2,
			double consumoCombustivel2) {

		tipo = tipo2;
		marca = marca2;
		velocidadeMaxima = velocidadeMaxima2;
		numeroPassageiros = numeroPassageiros2;
		capacidadeCombustivel = capacidadeCombustivel2;
		consumoCombustivel = consumoCombustivel2;

	}

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
