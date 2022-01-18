package classes.day16_classObjects;

public class Car {

	String make;
	String model;
	int currentSpeed;
	String color;
	
	public void printCarInfo() {
		String info = "Car make[" + make + "], model[" + model + "], color[" + color + "], current speed" + currentSpeed + "]";
		System.out.println(info);
	}
	
	public void showCurrentSpeed(int speedLimit) {
		if (currentSpeed<=speedLimit) {
			System.out.println(make + " " + model + " is driving at " + currentSpeed + " mph, following the speed limit-" + speedLimit + " mph");
		} else {
			System.out.println(make + " " + model + " is driving at " + currentSpeed + " mph, over the speed limit-" + speedLimit + " mph");
		}
	}
	
	public void drive () {
		System.out.println(make + " " + model + " is driving.");
	}
	
	public void accelerate (int mph) {
		currentSpeed = currentSpeed + mph;
	}
}
