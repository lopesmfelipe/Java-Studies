package com.java_studies.p43;

public class Student {

	private String[] courses;
	private double[][] notas;

	public Student(String name, String phone) {
		// super(name, phone);
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
		// this.setName("Trevor");
		// super.setName("Trevor");
	}

	public String obterEtiquetaEndereco() {

		String identificacao = "Student Phone: ";
		// identificacao += super.getPhone();
		return identificacao;

	}

	// @Override
	public void imprimirEtiquetaEndereco() {

		System.out.print("Printing student phone: ");
		// System.out.println(super.getPhone());

	}

}
