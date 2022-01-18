package live_reviews_JAVA.week5_review;

public class S07_ExamplesWithCustomClassMethods {

	public static void main(String[] args) {

		S06_StringCustomMethods methods = new S06_StringCustomMethods();
		methods.setStr("JAVA");  // This is a much professional way to do it.
		System.out.println(methods.reverse());
		
		methods.str = "Oscar";
		System.out.println(methods.reverse());
		
		System.out.println("*****PALINDROME*****");
		
		methods.setStr("madam");
		System.out.println(methods.isPolindrome());
		methods.setStr("   Madam  ");
		System.out.println(methods.isPolindrome());
		
		methods.setStr("  Never Odd or Even "); // NeverOddorEven : case insensitive
		System.out.println(methods.isPolindrome());
		
		
		
		
	}

}
