package com.java_studies.p39;

public class Student extends Pessoa {

	private String[] courses;
	private double[][] notas;

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
