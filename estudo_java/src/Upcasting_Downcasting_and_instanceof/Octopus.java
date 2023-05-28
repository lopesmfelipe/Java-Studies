package Upcasting_Downcasting_and_instanceof;

public class Octopus extends Animal {

	@Override
	public void animalMove() {
		System.out.println("Swimming");
	}

	public void attack() {
		System.out.println("Ink");
	}

}
