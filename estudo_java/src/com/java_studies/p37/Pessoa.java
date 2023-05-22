package com.java_studies.p37;

public abstract class Pessoa {

	private static String name;
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
