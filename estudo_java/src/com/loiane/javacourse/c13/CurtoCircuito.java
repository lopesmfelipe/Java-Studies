package com.loiane.javacourse.c13;

public class CurtoCircuito {

	public static void main(String[] args) {
		
		boolean verdadeiro = true;
		boolean falso = false;
		
		boolean resultado1 = falso && verdadeiro; // Se o primeiro for falso, nem verifica o segundo. Não precisa verificar o segundo para saber o resultado
		boolean resultado2 = falso & verdadeiro;
		boolean resultado3 = verdadeiro && falso;
		boolean resultado4 = verdadeiro & falso;
		
		System.out.println(resultado1 == verdadeiro);
		System.out.println(resultado1);
		System.out.println(resultado2);
		System.out.println(resultado3);
		System.out.println(resultado4 == verdadeiro);
		
	}

}
