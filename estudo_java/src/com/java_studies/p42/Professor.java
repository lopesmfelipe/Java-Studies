package com.java_studies.p42;

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

	public String obterEtiquetaEndereco() {

		String identificar = "Professor phone: ";
		identificar += super.getPhone();
		return identificar;

	}

	@Override
	public void imprimirEtiquetaEndereco() {

		System.out.print("Printing student phone: ");
		System.out.println(super.getPhone());
	}

}
