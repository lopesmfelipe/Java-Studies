package com.java_studies.p35;

public class MetodoRecursivo {

	public static int fatorialNaoRecursivo(int numero) {
		
		int fatorial = 1;
		for (int i = numero; i > 1; i--) {
			fatorial *= i;
		}
		return fatorial;
		
	} 
	
	public static int fatorialRecursivo(int valorRecebido) {
		
		if ( valorRecebido == 0) {
			return 1; // aqui ele sai, e já pode fazer as contas, porque todos os métodos dos fatoriais já tem valor definido
		}
		return valorRecebido * fatorialRecursivo(valorRecebido - 1);  // entra no método de 'fatorialRecursivo' de valorRecebido -1, quando o valor chegar em zero, vai retornar 1, e voltar a executar o método vezes os métodos com os valores já definidos 
		// vai se aprofundando, até o fatorial chegar a zero, quando isso acontece, começa a retornar os valores de cada método fatorial, em ordem crescente
		
	}
}
