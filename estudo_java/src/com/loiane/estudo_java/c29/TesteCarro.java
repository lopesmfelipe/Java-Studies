package com.loiane.estudo_java.c29;

public class TesteCarro {

	public static void main(String[] args) {
		
		
		 Carro esportivo = new Carro();
		 
		 esportivo.marca = "Mercedes";
		 esportivo.velocidadeMaxima = 284.4;
		 
		 System.out.println("Tipo de carro = " + esportivo.tipo);
		
		Carro esportivo2 = new Carro("Elétrico", "McLaren", 275, 2, 50, 1.2);
		
		System.out.println(esportivo2.tipo);
		System.out.println(esportivo2.marca);
		System.out.println(esportivo2.velocidadeMaxima);
		System.out.println(esportivo2.numeroPassageiros);
		System.out.println(esportivo2.capacidadeCombustivel);
		System.out.println(esportivo2.consumoCombustivel);
	}

}
