package com.loiane.javacourse.c15;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		Scanner novoScanner = new Scanner(System.in);
		
		System.out.println("Insira o dia da semana (1-7):");
		int diaDaSemana = novoScanner.nextInt();
		
		switch(diaDaSemana) {
		case 2: 
		case 3: 
		case 4:
		case 5: 
		case 6: System.out.println("Dia útil"); break;
		case 1: 
		case 7: System.out.println("Fim de semana"); break;
		default: System.out.println("Dia da semana inválido");
		}
		
	}

}
