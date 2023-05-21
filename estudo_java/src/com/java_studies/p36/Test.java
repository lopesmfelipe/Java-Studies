package com.java_studies.p36;

public class Test {

	public static void main(String[] args) {

		Contact contact = new Contact();
		Adress adr = new Adress();

		adr.setCity("San Francisco");
		adr.setState("California");
		adr.setStreetName("Silicon Valley");
		adr.setZipCode("000000");

		contact.setAdress(adr);
		contact.setName("Smaug");
		contact.setPhone("99999999");

		System.out.println(contact.getName());
		System.out.println(contact.getAdress());
		System.out.println(contact.getPhone());

	}

}
