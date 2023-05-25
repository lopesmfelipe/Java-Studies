package instance_and_class_variables;

public class Serentei {

	int n = 0; 	          	// variável de Instanciamento. Cada objeto Instanciado dessa Classe vai ter sua própria variável "n".
	static int m = 0;       // variável de Classe. Pertence a Classe toda, todos os objetos instanciados dessa Classe irão dividir essa mesma variável. 
	
	public Serentei() {
		++n;
		++m;
	}
	
}



/*variável static, ou seja, se mantem a mesma para todos os objetos*/


/*Se você não declarar a variável como "static", por padrão, será criada uma variável de Instancia*/

