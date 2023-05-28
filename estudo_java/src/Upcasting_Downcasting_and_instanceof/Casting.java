package Upcasting_Downcasting_and_instanceof;

public class Casting {

	public static void main(String[] args) {

		Animal dragon01 = new Dragon(); // UPCASTING(sobe a classe) - sempre acontece automaticamente em Java
		Octopus octopus01 = new Octopus();
		
		doAnimalStuff(dragon01);
	}

	public static void doAnimalStuff(Animal animal) { // neste método ocorre 'UPCASTING' já que ele recebe um objeto de qualquer subclasse que extend Animal.
		animal.animalMove();
		if (animal instanceof Dragon) {  // se o objeto recebido for uma instancia da classe requerida, vai executar
			
			Dragon dragon02 = (Dragon)animal;  // DOWNCASTING - vai pegar o objeto da superclass Animal e passar de volta para a subclasse específica 
			dragon02.attack();
		}
		if (animal instanceof Octopus) {  // agora podemos converter(cast) com segurança sabendo que é da classe que queremos 
			Octopus octopus = (Octopus)animal;
			octopus.attack();
		}
	}

}
