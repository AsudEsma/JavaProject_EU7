package live_reviews_JAVA.week11_review;

public abstract class Car {

	public String make, model, color;
	public int year;

	public Car(String make, String model, String color, int year) {
		super();
		this.make = make;
		this.model = model;
		this.color = color;
		this.year = year;
	}

	public abstract void start();

	@Override
	public String toString() {
		return "Car [make=" + make + ", model=" + model + ", color=" + color + ", year=" + year + "]";
	}
	
	
}
