package com.java_studies.p36;

public class Contact {
	
	private String name;
	private Adress adress;
	private Phone[] phones;  // como é um array, colocar o nome do atributo no plural
	
	
	public String getName() {
		return name;
	}
	public void setName(String nome) {
		this.name = nome;
	}
	
	public Adress getAdress() {
		return adress;
	}
	public void setAdress(Adress adress) {
		this.adress = adress;
	}
	public Phone[] getPhones() {
		return phones;
	}
	public void setPhones(Phone[] phones) {
		this.phones = phones;
	}
	
	
	
	
	
	
	
	
}
