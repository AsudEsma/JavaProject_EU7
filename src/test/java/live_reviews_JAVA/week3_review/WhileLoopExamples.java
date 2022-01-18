package live_reviews_JAVA.week3_review;

public class WhileLoopExamples {

	public static void main(String[] args) {

		//factorial question
		//5!=5*4*3*2*1
		
		int num = 5;
		int factorial = 1;
		
		while (num>1) {
			factorial *= num;
			num--;
		}
		
		System.out.println(factorial);
		
		
		System.out.println("----------DO WHILE----------");
		
		int num1 = 10;
		int num2 = 300;
		
		int total = 0;
		
		do {
			total+= num1 + num2;
			
		} while (total<1000);
		
		System.out.println(total);

	}

}
