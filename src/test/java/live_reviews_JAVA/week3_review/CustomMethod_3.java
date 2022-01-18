package live_reviews_JAVA.week3_review;

public class CustomMethod_3 {

	public static void main(String[] args) {

		System.out.println(getAgeInDays(10) + " days old.");
		System.out.println(getAgeInDaysWithMessage(100));
	}

	public static int getAgeInDays(int years) {

//		int days = years *365;
		return years * 365;
		
	}
	
	public static String getAgeInDaysWithMessage(int years) {
		
		return (years * 365) + " days old.";
	}

}
