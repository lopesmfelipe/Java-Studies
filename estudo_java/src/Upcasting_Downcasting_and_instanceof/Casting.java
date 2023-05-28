package Upcasting_Downcasting_and_instanceof;

public class Casting {

	public static void main(String[] args) {

		Octopus theOctopus = new Octopus(); // UPCASTING

		doAnimalStuff(theOctopus);
		
		Dragon theDragon = new Dragon();
		doAnimalStuff(theDragon);
		
	}

	public static void doAnimalStuff(Animal animal) {  // neste método ocorre 'CASTING' já que ele recebe um objeto de qualquer subclasse que extend Animal. 
		animal.animalMove();
	}
	
	
	
	
	
}
