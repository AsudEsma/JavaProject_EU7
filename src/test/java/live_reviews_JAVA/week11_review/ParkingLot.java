package live_reviews_JAVA.week11_review;

public class ParkingLot {
	
	public static void main(String[] args) {
		
		Toyota camry = new Toyota("Cambry", "white", 2019);
		camry.start();
		System.out.println(camry);
		
		BMW M5 = new BMW("M5", "black", 2020);
		M5.start();
		System.out.println(M5);
		
		Tesla S = new Tesla("S", "navy blue", 2022);
		S.start();
		System.out.println(S);
		
	}

}
