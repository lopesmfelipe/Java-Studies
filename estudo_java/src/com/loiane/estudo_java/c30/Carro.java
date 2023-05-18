package com.loiane.estudo_java.c30;

public class Carro {  // public pode ser utilizado em qualque classe de qualquer pacote do projeto

	
	private String tipo;  // private só pode ser utilizado dentro da classe
	private String marca; 
	public double velocidadeMaxima;
	public int numeroPassageiros;
	public double capacidadeCombustivel;
	public double consumoCombustivel;
	
	
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
		System.out.println("Chamando o construtor com 3 parâmetros");

	}

	public Carro(String tipo, String marca) {
		this(tipo, marca, 05);  // esse this chama o construtor com 3 parâmetros, onde settamos o 3° parâmetro
		System.out.println("Chamando o construtor com 2 parâmetros");
	}


	public Carro() {
		
	}
	
	
}
