package com.java_studies.p44;

public class Cachorro extends Mamifero implements AnimalEstimacao, AnimalDomestico{
	
	String race;
	double size;
	
	
	
	public String getRace() {
		return race;
	}

	public double getSize() {
		return size;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public void setSize(double size) {
		this.size = size;
	}

	@Override
	public void amamentar() { // Mamifero
		// TODO Auto-generated method stub
		
	}

	@Override
	public void emitirSons() { // Animal
		// TODO Auto-generated method stub
		
	}

	@Override
	public void levarPassear() { //AnimalDomestico
		// TODO Auto-generated method stub
		
	}

	@Override
	public void brincar() { // AnimalDomestico
		// TODO Auto-generated method stub
		
	}

	@Override
	public void levarNoVeterinario() { // AnimalDomesticado
		// TODO Auto-generated method stub
		
	}

	@Override
	public void alimentar() { // AnimalDomesticado
		// TODO Auto-generated method stub
		
	}

}
