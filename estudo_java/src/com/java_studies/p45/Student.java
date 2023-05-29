package com.java_studies.p45;

import java.util.Arrays;

public class Student extends Pessoa {

	private String[] courses;
	private double[][] notas;

	public Student(String name, String phone) {
		super(name, phone);
	}

	public Student() {
		super();
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

	public void algumaCoisa() {
		this.setName("Trevor");
		super.setName("Trevor");
	}

	public String obterEtiquetaEndereco() {

		String identificacao = "Student Phone: ";
		identificacao += super.getPhone();
		return identificacao;

	}

	@Override
	public String toString() {
		return "Student [courses=" + Arrays.toString(courses) + ", notas=" + Arrays.toString(notas) + "]";
	}

	
	
}
