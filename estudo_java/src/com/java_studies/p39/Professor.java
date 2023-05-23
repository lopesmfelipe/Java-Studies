package com.java_studies.p39;

public class Professor extends Pessoa {

	private double wage;
	private String departamento;

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		this.wage = wage;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	private static double calcularSalarioLiquido() {
		return 0;
	}

}
