package com.java_studies.p38;

public class Pessoa {

	private static String name;  // classes que extends essa aqui, teram acesso aos seus atributos através dos seus métodos get/set, já que os atributos estão privados
	private static String adress;
	private static String cpf;
	private static String phone;

	
	
	
	
	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		Pessoa.name = name;
	}

	public static String getAdress() {
		return adress;
	}

	public static void setAdress(String adress) {
		Pessoa.adress = adress;
	}

	public static String getCpf() {
		return cpf;
	}

	public static void setCpf(String cpf) {
		Pessoa.cpf = cpf;
	}

	public static String getPhone() {
		return phone;
	}

	public static void setPhone(String phone) {
		Pessoa.phone = phone;
	}

}
