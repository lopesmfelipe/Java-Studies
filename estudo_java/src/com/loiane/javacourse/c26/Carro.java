package com.loiane.javacourse.c26;

public class Carro {
	
	String marca; 
	String modelo;
	int numeroPassageiros;
	double capacidadeCombustivel;
	double consumoCombustivel;
	double velocidadeMaxima;
	
	void exibirAutonomiaCombustivel() {
		System.out.println("A autonomia do carro é: " + capacidadeCombustivel * consumoCombustivel + "km");
	}
	
	double obterAutonomia() {
		
		System.out.println("Método obterAutonomia foi chamado");
		
		return capacidadeCombustivel * consumoCombustivel;
	}
	
}
