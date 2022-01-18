package live_reviews_JAVA.week11_review;

public class Toyota extends Car {

	public Toyota( String model, String color, int year) {
		super("Toyota", model, color, year);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void start() {
		
		System.out.println("Turn the key");
	}
}
