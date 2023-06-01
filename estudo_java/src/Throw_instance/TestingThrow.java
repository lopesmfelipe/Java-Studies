package Throw_instance;

public class TestingThrow {

	public static void main(String[] args) {
		
		/* você pode gerar uma exceção de qualquer tipo que seja(e definir uma mensagem especifica), para ser lançado 
		 * quando um comportamento não permitido ocorrer */
		
		/*Example*/
		double number1 = 29;
		double number2 = 999;
		
		if (number1 > 700 | number2 > 700) { /*caso a condição não seja cumprida, é lançada uma exceção*/
		throw new IllegalArgumentException("Foi lançada uma exceção"); 
		}
		
	}

}
