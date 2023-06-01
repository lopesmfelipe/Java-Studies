package Throws;

import java.io.FileNotFoundException;
import java.io.IOException;

public class TestingThrows {

	public static void main(String[] args) {

		try {
			new Files(); // Instanciou/chamou construtor da classe 'Files'
		} catch (FileNotFoundException e) {
			System.err.println("AN ERROR HAS OCCURRED");
		} catch (IOException e) {
			System.err.println("OTHER ERROR HAS OCCURRED");
		}
		
	}

}
