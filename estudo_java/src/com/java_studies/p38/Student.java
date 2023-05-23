package com.java_studies.p38;

public class Student extends Pessoa{

	private String[] courses;
	private double[][] notas;

	
	

	public Student() {
		super();  // vai chamar o construtor da superclasse
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
}
