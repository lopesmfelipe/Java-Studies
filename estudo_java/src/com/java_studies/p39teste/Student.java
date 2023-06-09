package com.java_studies.p39teste;

import com.java_studies.p39.Pessoa;

public class Student extends Pessoa {

	private String[] courses;
	private double[][] notas;

	
	public void metodoX() {
		super.metodoParaTest("Don't let your dreams be dreams");
	}
	
	public void acessoVerificacao() {
		super.visibilidade = "visivel(super)";
		this.visibilidade = "visivel(this)";
	}
	
	public Student(String name, String phone) {
		super(name, phone); // vai chamar o construtor da superclasse com super e definir os parâmetros com
							// os recebidos aqui
	}

	public Student() {
		super(); // vai chamar o construtor sem parâmetros da superclasse
	}

	public String[] getCourses() {
		return courses;
	}

	public void setCourses(String[] courses) {
		this.courses = courses;
	}

	public double[][] getNotas() {
		return notas;
	}

	public void setNotas(double[][] notas) {
		this.notas = notas;
	}

	public static double calcularMedia() {
		return 0;
	}

	public static String verificarAprovacao() {
		return "";
	}

	public void algumaCoisa() {
		this.setName("Trevor");  // por herança pode utilizar os métods da superClass que extends
		super.setName("Trevor"); // só vai mostrar os métodos da Superclass
		
	}
}
