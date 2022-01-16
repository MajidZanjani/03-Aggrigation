package aggrigation;

import javax.print.attribute.standard.Chromaticity;

public class Person {
	
	String fullName;
	int age;
	Address address;
	
	public Person(String fullName, int age, Address address) {
		super();
		this.fullName = fullName;
		this.age = age;
		this.address = address;
	}
	
	void displayPerson() {
		System.out.println("Full Name: " + fullName + ", Age: " + age);
		System.out.println("Age: " + age);
		System.out.println("Address: " + address.street + ", " + address.city + ", " + address.postalCode + ", " + address.country + ", Phone " + address.telNumber);
	}

}
