package com.java_studies.p44;

public abstract class Animal {

	String name;

	public abstract void emitirSons();  // método abstrato a ser implementado em todas classes que estenderem

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
