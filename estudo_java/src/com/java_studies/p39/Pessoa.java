package com.java_studies.p39;

public class Pessoa {

	private String name; // classes que extends essa aqui, teram acesso aos seus atributos através dos
							// seus métodos get/set, já que os atributos estão privados
	private String adress;
	private String cpf;
	private String phone;
	
	protected String visibilidade;
	
	
	public Pessoa() {
	}

	public Pessoa(String name, String phone) { // construtor com parâmetros
		super();
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
	
	
	 protected void metodoParaTest(String message) {  // 'protected' é visivel até para subclasses que estão em outros subpacotes
		System.out.println(message);
	}
 
}
