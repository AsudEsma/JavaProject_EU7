package live_reviews_JAVA.week3_review;

public class CustomMethod_2 {

	public static void main(String[] args) {

		int person1 = 10;
		eligibleOrNot(person1);
		eligibleOrNot(23);
		eligibleOrNot(21);
	}

	public static void eligibleOrNot(int age) {

		int person = age;
		
		if(person>=21) {
			System.out.println("Eligible");
		} else {
			System.out.println("NOT Eligible");
		}
		
	}

}
