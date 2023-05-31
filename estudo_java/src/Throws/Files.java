package Throws;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Files {
	
	private File arquivo;
	private FileInputStream fileInputStream;
	
	
	public Files() throws FileNotFoundException {
		arquivo = new File("SENHAS232323.txt");
		fileInputStream = new FileInputStream(arquivo);
	}
	
}
