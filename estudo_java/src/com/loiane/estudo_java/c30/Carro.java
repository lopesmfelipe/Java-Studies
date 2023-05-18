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
		
		this.tipo = tipo;      // *dica: se você seleciona um atributo, método e etc, e aperta f3, ele vai te levar para a declaração daquele atributo ou método
		this.marca = marca;
		this.velocidadeMaxima = velocidadeMaxima;
		this.numeroPassageiros = numeroPassageiros;
		this.capacidadeCombustivel = capacidadeCombustivel;
		this.consumoCombustivel = consumoCombustivel;
		
	}

	
	public Carro(String tipo, String marca, int numeroPassageiros) {
		this.tipo = tipo;
		this.marca = marca;
		this.numeroPassageiros = numeroPassageiros;
	}

	public Carro(String tipo, String marca) {
		
		this("combustão", "lamborguini", 4);
		
	}


	public Carro() {
		
	}
	
	
}
