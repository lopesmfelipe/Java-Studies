package com.loiane.javacourse.c12;

import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite seu nome completo");
		
		String nomeCompleto = scan.nextLine();  // Vai receber todo o valor digitado
		System.out.println("Seu nome completo é: " + nomeCompleto);
		
		System.out.println("Digite seu primeiro nome");
		String primeiroNome = scan.next();  // Só vai receber o primeiro valor digitado
		System.out.println("Seu primeiro nome é: " + primeiroNome);
		
		
		
		
		
		
		
	}

}
