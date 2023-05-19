package com.loiane.estudo_java.c34;

public class CalculatorTest {

	static int resultadoSoma; // o método main consegue acessar por ser 'static', caso não fosse, não
								// conseguiria

	public static void main(String[] args) {

		resultadoSoma = MyCalculator.divisao(new int[] { 2, 3 }); // como temos métodos static na outra classe, podemos
																	// utiliza-los sem precisar instanciar um objeto
		divisao2v(2, 2);

		int tres = 3;
		int quatro = 4;
		
		int terceiro = (int) Math.pow(tres, quatro);   // exemplo da utilização de um método da classe 'Math' sem precisar instanciar um objeto dessa classe porque é 'static'
		System.out.println(terceiro);
	}

	static int divisao2v(int n1, int n2) { // método main consegue acessar porque o método é 'static'
		return MyCalculator.divisao(n1, n1);
	}

}
