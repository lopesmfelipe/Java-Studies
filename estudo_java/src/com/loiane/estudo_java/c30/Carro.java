package com.loiane.estudo_java.c30;

public class Carro {

	
	String tipo;
	String marca; 
	double velocidadeMaxima;
	int numeroPassageiros;
	double capacidadeCombustivel;
	double consumoCombustivel;
	
	
	
	public Carro(String tipo, String marca, double velocidadeMaxima, int numeroPassageiros,
			double capacidadeCombustivel, double consumoCombustivel) {
		
		this.tipo = tipo;
		this.marca = marca;
		this.velocidadeMaxima = velocidadeMaxima;
		this.numeroPassageiros = numeroPassageiros;
		this.capacidadeCombustivel = capacidadeCombustivel;
		this.consumoCombustivel = consumoCombustivel;
		
	}


	public Carro() {
		
	}
	
	
}
