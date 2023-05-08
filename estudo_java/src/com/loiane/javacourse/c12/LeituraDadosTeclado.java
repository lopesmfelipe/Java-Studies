package com.loiane.javacourse.c12;

import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		/*
		System.out.println("Digite seu nome completo");
		String nomeCompleto = scan.nextLine();  // Vai receber todo o valor digitado
		System.out.println("Seu nome completo é: " + nomeCompleto);
		
		System.out.println("Digite seu primeiro nome");
		String primeiroNome = scan.next();  // Só vai receber o primeiro valor digitado
		System.out.println("Seu primeiro nome é: " + primeiroNome);
		
		System.out.println("Digite sua idade");
		int idade = scan.nextInt();
		System.out.println("Sua idade é: " + idade + " anos");
		
		System.out.println("Digite sua altura");
		double altura = scan.nextDouble();
		System.out.println("Sua altura é de: " + altura + "m");
		*/
		
		System.out.println("Digite seu primeiro nome, idade, quantdidade de filhos, altura e se possui animais de estimação");
		
		
		/*Para cada tipo de dado, há um método da Classe Scanner*/
		String nomePrimeiro = scan.next();
		int idade = scan.nextInt();
		byte qtdFilhos = scan.nextByte();
		float altura = scan.nextFloat();
		boolean animalEstimacao = scan.nextBoolean();
		
		
		System.out.println("Você inseriu os seguintes valores: ");
		System.out.println("Primeiro nome = " + nomePrimeiro);
		System.out.println("Idade = " + idade);
		System.out.println("Quantidade de filhos = " + qtdFilhos);
		System.out.println("Altura = " + altura + "m");
		System.out.println("Tem animais de estimação = " + animalEstimacao);
		
	}

}
