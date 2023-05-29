package com.java_studies.p45;

public class Main2 {

	public static void main(String[] args) {

		Object obj1 = obtencaoString();
		String string1 = (String) obj1;

		Object obj2 = "Whatever you say";
		String string2 = (String) obj2;

		// Object obj3 = new Object(); erro porque o objeto não recebeu uma String
		// String string3 = (String)obj3;

		//Object obj4 = metodoX();   erro também porque o método retorna um inteiro para o objeto da classe Object, e não uma String
		//String string4 = (String) obj4;

	}

	public static String obtencaoString() {
		return "My string";
	}

	public static int metodoX() {
		return 0;
	}

}
