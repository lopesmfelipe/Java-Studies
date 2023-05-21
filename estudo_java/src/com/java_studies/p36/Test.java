package com.java_studies.p36;

public class Test {

	public static void main(String[] args) {

		Contact contact = new Contact();
		Adress adr = new Adress();
		Phone pho = new Phone();
		
		adr.setCity("San Francisco");
		adr.setState("California");
		adr.setStreetName("Silicon Valley");
		adr.setZipCode("000000");

		pho.setTipo("residential");
		pho.setNumero("6666666");
		pho.setDdd("+55");
		
		
		contact.setAdress(adr);
		contact.setName("Smaug");
		contact.setPhone(pho);

		System.out.println(contact.getName());
		System.out.println(contact.getPhone());
		
		if (contact != null && contact.getAdress() != null) {
			System.out.println(contact.getAdress().getCity());
		}
		if (contact != null && contact.getPhone() != null) {
			System.out.println(contact.getPhone().getNumero());
		}
		
	}

}
