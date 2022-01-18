package classes.day16_classObjects;

public class CarObjects {

	public static void main(String[] args) {
		
		Car car1 = new Car();
		
		car1.printCarInfo();
		
		car1.make = "Ford";
		car1.model = "Fiesta";
		car1.color = "Blue";
		car1.currentSpeed = 55;
		
		car1.printCarInfo();
		car1.showCurrentSpeed(65);
		System.out.println("Before: " + car1.currentSpeed);
		car1.accelerate(20);
		System.out.println("After: " + car1.currentSpeed);
		car1.showCurrentSpeed(65);

	}

}
