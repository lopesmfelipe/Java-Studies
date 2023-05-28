package com.java_studies.p25;

public class Carro {

	String marca;
	String modelo;
	int numeroPassageiros;
	double capacidadeCombustivel;
	double consumoCombustivel;
	double velocidadeMaxima;

	void exibirAutonomiaCombustivel() {
		System.out.println("A autonoma do carro é: " + capacidadeCombustivel * consumoCombustivel + "km");
	}

}
