package live_reviews_JAVA.week11_review;

public abstract class Exercise {

	public abstract int getCaloriesCount (int mins);
	
	public abstract void perform ();
	
	public void start() {
		
		System.out.println("Warming up and starting the exercise.");
		
	}
}
