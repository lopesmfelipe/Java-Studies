package com.loiane.estudo_java.c31;

public class TesteCarro {

	public static void main(String[] args) {

		Carro x = new Carro();

		x.consumoCombustivel = 0.6;

		System.out.println("Seu carro precisara de " + x.calcularCombustivel(80) + "L" + " de combustível");

	}

}
