package live_reviews_JAVA.week8_review;

public class ConstructorPractice {

	 /* no paramater constructor
	 * one arg with int constructor
	 * one arg with string constructor	*/

		public ConstructorPractice() {
			this(10);
			System.out.println("a");
		}
		
		public ConstructorPractice(int num) { // call no arg constructor from here
		
			System.out.println("b");
		}
		
		public ConstructorPractice(String str) {
			this();
			System.out.println("c");
		}
		
		
		public static void main(String[] args) {
			
			
			new ConstructorPractice("hello"); // I am creating an object, I am calling constructor
			
		}
}
