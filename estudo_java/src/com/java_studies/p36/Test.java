package com.java_studies.p36;

public class Test {

	public static void main(String[] args) {

		Contact contact = new Contact();

		Adress adr = new Adress();
		adr.setCity("San Francisco");
		adr.setState("California");
		adr.setStreetName("Silicon Valley");
		adr.setZipCode("000000");

		Phone phone1 = new Phone(); // object
		phone1.setTipo("residential");
		phone1.setNumero("222222222");
		phone1.setDdd("+55");

		Phone phone2 = new Phone(); // object
		phone2.setTipo("personal");
		phone2.setNumero("33333333");
		phone2.setDdd("+99");

		Phone[] phones = new Phone[2]; // array
		phones[0] = phone1; // residential phone object
		phones[1] = phone2; // personal phone object

		contact.setName("Smaug");
		contact.setAdress(adr);
		contact.setPhones(phones); // como o atributo de 'contact' para 'phone' é um array, se deve settar um array

		System.out.println(contact.getName());

		if (contact != null && contact.getAdress() != null) {
			System.out.println(contact.getAdress().getCity());
		}
		if (contact != null && contact.getPhones() != null) {

			for (Phone phone : phones) { // para imprimir um array, deve-se percorre-lo com um loop
				System.out.println(phone.getNumero());
				System.out.println(phone.getDdd());
				System.out.println(phone.getTipo());
			}

			System.out.println();

			for (int i = 0; i < phones.length; i++) {
				System.out.println(phones[i].getNumero());
				System.out.println(phones[i].getDdd());
				System.out.println(phones[i].getTipo());
			}

		}

	}

}
