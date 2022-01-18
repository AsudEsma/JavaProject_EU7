package classes.day17_classObjects;

public class BMW {

	String make = "BMW"; //This will be the default value.
	String model;
	double price;
	
	public void showPrice() {
		
		switch(model) {
		case "330i":
			price=40250;
			break;
		case "7420i":
			price=85000;
			break;
		case "m3":
		case "M3":
			price=65000;
			break;
		default:
			System.out.println(model + " is not available");
			price=0;
		}
		System.out.println("Price: " + price);
	} 
	
	
}
