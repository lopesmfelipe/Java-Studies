package com.java_studies.p36;

public class Test {

	public static void main(String[] args) {

		Contact contact = new Contact();
		Adress adr = new Adress();
		Phone phon = new Phone();
		
		adr.setCity("San Francisco");
		adr.setState("California");
		adr.setStreetName("Silicon Valley");
		adr.setZipCode("000000");

		phon.setTipo("residential");
		phon.setNumero("222222222");
		phon.setDdd("+55");
		
		
		contact.setName("Smaug");
		contact.setAdress(adr);
		contact.setPhone(phon);

		System.out.println(contact.getName());
		
		if (contact != null && contact.getAdress() != null) {
			System.out.println(contact.getAdress().getCity());
		}
		if (contact != null && contact.getPhone() != null) {
			System.out.println(contact.getPhone().getNumero());
		}
		
	}

}
