package classes.day38_inheritance;

public class Car extends Vehicle {

	int maxSpeed = 180;
	
	public void display() {
		System.out.println("Maximum speed: " + super.maxSpeed);
		System.out.println("Maximum speed: " + maxSpeed);
	}
}
