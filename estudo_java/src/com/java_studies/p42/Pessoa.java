package com.java_studies.p42;

public class Pessoa {  // abstrato você define, não torna realidade(não instancia essa classe)

	private String name;
	private String adress;
	private String cpf;
	private String phone;

	//public abstract String obterEtiquetaEndereco(); // abstract method

	//public abstract void imprimirEtiquetaEndereco();
	
	
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
