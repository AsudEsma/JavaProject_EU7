package live_reviews_JAVA.week11_review;

public class BMW extends Car {

	public BMW(String model, String color, int year) {
		super("BMW", model, color, year);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void start() {
		
		System.out.println("Push the start button");
	}
}
