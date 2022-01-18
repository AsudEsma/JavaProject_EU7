package live_reviews_JAVA.week3_review;

public class TernaryExample {

	public static void main(String[] args) {

		int num1 = 100;
		int num2 = 10;
		int biggerNum;
		
//		if(num1>num2) {
//			biggerNum = num1;
//		} else {
//			biggerNum = num2;
//		}
		
		biggerNum = (num1>num2)? num1 : num2;
		
		System.out.println(biggerNum);

	}

}
