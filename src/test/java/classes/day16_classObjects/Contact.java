package classes.day16_classObjects;

public class Contact {

	String name;
	int phoneNumber;
	String email;
	
	public void call () {
		System.out.println(name + " is calling");
	}
	
	public void sendMessage () {
		System.out.println("Sending message to " + phoneNumber + " |name: " + name);
	}
	
	public void sendEmail () {
		System.out.println("Sending message to " + email + "...");
	}
}
