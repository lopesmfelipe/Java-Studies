package Throws;

import java.io.FileNotFoundException;

public class TestingThrows {

	public static void main(String[] args) {

		try {
			new Files(); // Instanciou/chamou construtor da classe 'Files'
		} catch (FileNotFoundException e) {
			System.err.println("AN ERROR HAS OCCURRED");
		}

	}

}
