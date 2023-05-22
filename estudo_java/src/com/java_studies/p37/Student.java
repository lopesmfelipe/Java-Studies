package com.java_studies.p37;

public class Student {
	
	private String name;
	private String phone;
	private String[] courses;
	private double[][] notas;
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
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
