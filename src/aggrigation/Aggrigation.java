package aggrigation;
 
public class Aggrigation {

	public static void main(String[] args) {
		
		Address address = new Address("Chavchavadzeh", "Tbilisi", "Georgia", "0123", "12345678");
		
		Person person = new Person("Majid Zanjani", 45, address);
		
		person.displayPerson();
		
	}

}
