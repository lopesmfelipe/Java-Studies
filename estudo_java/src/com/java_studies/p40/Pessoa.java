package com.java_studies.p40;

public class Pessoa {

	private String name;
	private String adress;
	private String cpf;
	private String phone;

	
	public String obterEtiquetaEndereco() {
		return phone;
	}
	
	
	public Pessoa() {
	}

	public Pessoa(String name, String phone) { 
		this.name = name;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public String getAdress() {
		return adress;
	}

	public String getCpf() {
		return cpf;
	}

	public String getPhone() {
		return phone;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
