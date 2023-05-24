package com.java_studies.p43;

import java.util.Arrays;
import java.util.Objects;

public class Student {

	private String courses;
	private double[] notas;

	public Student(String name, String phone) {
	}

	public Student() {
		super();
	}

	public String getCourses() {
		return courses;
	}

	public void setCourses(String courses) {
		this.courses = courses;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
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

	@Override
	public String toString() {
		return "Student [courses=" + courses + ", notas=" + Arrays.toString(notas) + "]";
	}

	


	/*public String toString() {  // toString feito na mão, mas o eclipse já cria automatico se quisermos 
		String soma = courses + "\n";
		for (double notaSingular : notas) {
			soma += notaSingular + " ";

		}
		return soma;
	}*/
	
	/*@Override
	public boolean equals(Object obj) {
		if (this == obj)// compara se é a mesma referência
			return true;
		if (obj == null)// se for null retorna falso
			return false;
		if (getClass() != obj.getClass())//tipo da classe
			return false;
		Student other = (Student) obj;// casting
		return Objects.equals(courses, other.courses) && Arrays.equals(notas, other.notas); // compara o valor dos atributos e objetos
	}*/
	
	
	
	// equals que modificamos
	/*@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		Student other = (Student) obj; 
		return Objects.equals(courses, other.courses) || Arrays.equals(notas, other.notas); 
	} alterei para "||" em vez de "&&", dessa forma, se o objeto tiver apenas um de seus atributos true, vai
	  retornar verdadeiro
	*/
	
	// equals que modificamos 2
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		Student other = (Student) obj;
		return Objects.equals(courses, other.courses);
	}
	
	
	
	
	
	
}
