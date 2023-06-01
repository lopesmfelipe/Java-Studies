package Throws;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Files {

	private File arquivo;
	public FileInputStream fileInputStream;

	public Files() throws FileNotFoundException, IOException {
		arquivo = new File("SENHAS232323.txt");
		fileInputStream = new FileInputStream(arquivo);
		fileInputStream.read();
		fileInputStream.close();

	}
	

}
