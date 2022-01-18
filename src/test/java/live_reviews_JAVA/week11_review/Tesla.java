package live_reviews_JAVA.week11_review;

public final class Tesla extends Car {

	public Tesla(String model, String color, int year) {
		super("Tesla", model, color, year);
		// TODO Auto-generated constructor stub
	}
	
	public void autoPilot() {
		
	}
	
	@Override
	public void start() {
		
		System.out.println("Say start");
	}

}
