package com.java_studies.p43;

public class Main {

	public static void main(String[] args) {

		Student student01 = new Student();

		double[] grades = { 10, 9, 9.7, 10 };
		student01.setNotas(grades);
		student01.setCourses("Computer Science");

		System.out.println(student01.toString());
		
		
		
		
		
		int number1 = 1, number2 = 1;
		System.out.println(number1 == number2);  // para tipos primitivos ele verifica o valor de cada variável normalmente
		
		
		
		
		
		//Antigamente, até 2016, o sinal de igual '==' para objetos verificava apenas a referência e não o valor deles
		//por isso era necessário usar o método da classe Object 'equals'
		
		String word3 = "Ja", word4 = "Ji"; // Mas pelo visto agora o sinal de igual verifica o valor para objetos também, e as linhas abaixo são a prova
		System.out.println(word3 == word4); 
		
		
		String word1 = "Hi", word2 = "Hi"; 
		System.out.println(word1.equals(word2));
		
		
		
		Student student02 = new Student();
		double[] grades2 = { 10, 9, 9.7, 10 };
		student02.setNotas(grades2);
		student02.setCourses("Computer Science");
		
		
	}
}
