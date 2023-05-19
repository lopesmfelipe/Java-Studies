package com.loiane.estudo_java.c34;

public class CalculatorTest {

	static int resultadoSoma; // o método main consegue acessar por ser 'static', caso não fosse, não
								// conseguiria

	public static void main(String[] args) {

		resultadoSoma = MyCalculator.divisao(new int[] { 2, 3 }); // como temos métodos static na outra classe, podemos
																	// utiliza-los sem precisar instanciar um objeto
		divisao2v(2, 2);
		
		
	}

	static int divisao2v(int n1, int n2) {
		return MyCalculator.divisao(n1, n1);
	}
	
	
}
