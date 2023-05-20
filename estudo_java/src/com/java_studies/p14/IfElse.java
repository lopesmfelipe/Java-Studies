package com.java_studies.p14;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Insira sua idade abaixo");
		
		int idade = scanner.nextInt();
		
		if (idade >= 18) {
			System.out.println("Maior de idade");
		} else {
			System.out.println("Menor de idade");
		}
		
		System.out.println("Insira o preço do produto");
		double preco = scanner.nextDouble();
		
		if (preco >= 49) {
			System.out.println("Preço ultrapassou o orçamento, não comprar");
		} else if (30 < preco) {
			System.out.println("Preço dentro do orçamento, mas pergunte por algum desconto");
		} else {
			System.out.println("Preço dentro do orçamento, comprar");
		}
		
		
	}

}
