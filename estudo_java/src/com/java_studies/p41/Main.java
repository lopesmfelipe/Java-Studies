package com.java_studies.p41;

import com.java_studies.p40.Pessoa;
import com.java_studies.p40.Professor;
import com.java_studies.p40.Student;

public class Main {

	public static void main(String[] args) {

		Pessoa pessoa01 = new Pessoa();
		Pessoa student01 = new Student();
		Pessoa professor01 = new Professor();

		pessoa01.setPhone("0000000");
		student01.setPhone("1111111111");
		professor01.setPhone("999999999");

	}

}
