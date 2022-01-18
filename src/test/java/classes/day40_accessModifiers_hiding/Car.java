package classes.day40_accessModifiers_hiding;

public class Car {
	
	String model;
	public int year;
	private int door;
	protected double engine;
	
	
	public Car() {
		
	}
	
	public Car(String model, int year, int door, double engine) {
		super();		// extends OBJECT class
		this.model = model;
		this.year = year;
		this.door = door;
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", year=" + year + ", door=" + door + ", engine=" + engine + "]";
	}
	
	
}
