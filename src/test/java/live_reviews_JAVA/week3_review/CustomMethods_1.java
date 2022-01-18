package live_reviews_JAVA.week3_review;

public class CustomMethods_1 {

	public static void main(String[] args) {

		int person1 = 10;
		if(person1>=21) {
			System.out.println("Eligible");
		} else {
			System.out.println("NOT Eligible");
		}
		
		int person2 = 22;
		if(person2>=21) {
			System.out.println("Eligible");
		} else {
			System.out.println("NOT Eligible");
		}
		
		int person3 = 30;
		if(person3>=21) {
			System.out.println("Eligible");
		} else {
			System.out.println("NOT Eligible");
		}
		
		CustomMethod_2.eligibleOrNot(person3);

	}

}
