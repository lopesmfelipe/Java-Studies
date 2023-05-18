package com.loiane.estudo_java.c29;

public class Carro {
	
	String marca; 
	String tipo;
	int numeroPassageiros;
	double capacidadeCombustivel;
	double consumoCombustivel;
	double velocidadeMaxima;
	
	
	Carro() {
		System.out.println("Classe 'carro' foi intanciada.");
		tipo = "elétrico";
	}
	
	Carro(String marca2) {
		marca = marca2;
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
