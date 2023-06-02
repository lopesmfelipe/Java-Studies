package com.java_studies.p52;

public class DivisionNotExact extends Exception {

	private int num;
	private int den;
	
	public DivisionNotExact(int num, int den) {
		super();
		this.num = num;
		this.den = den;
	}

	@Override
	public String toString() {
		return "The result of " + num + "/" + den + " is not an integer number";
	}
	
	
	
	
}
