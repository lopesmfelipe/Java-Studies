package com.loiane.estudo_java.c34;

public class CalculatorTest {

	static int resultadoSoma; // o método main consegue acessar por ser 'static', caso não fosse, não conseguiria

	public static void main(String[] args) {

		resultadoSoma = MyCalculator.divisao(new int[] { 2, 3 }); // como temos métodos static na outra classe, podemos
																	// utiliza-los sem precisar instanciar um objeto

	}

}
