package Upcasting_Downcasting_and_instanceof;

public class Dragon extends Animal {

	@Override
	public void animalMove() {
		System.out.println("Flying");
	}

	public void attack() {
		System.out.println("Fire");
	}

}
