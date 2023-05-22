package com.java_studies.p29;

public class Carro2 {
	
	String tipo;
	String marca; 
	double velocidadeMaxima;
	int numeroPassageiros;
	double capacidadeCombustivel;
	double consumoCombustivel;
	
	public Carro2() {  // Boa prática ao criar um construtor com parâmetros, sempre criar um vazio sem nada também
		
	}
	
	
	public Carro2(String tipo, String marca, double velocidadeMaxima, int numeroPassageiros,
			double capacidadeCombustivel, double consumoCombustivel) {
		
		super();
		this.tipo = tipo;
		this.marca = marca;
		this.velocidadeMaxima = velocidadeMaxima;
		this.numeroPassageiros = numeroPassageiros;
		this.capacidadeCombustivel = capacidadeCombustivel;
		this.consumoCombustivel = consumoCombustivel;
		
	}
	
	
	
	
	
	
}
