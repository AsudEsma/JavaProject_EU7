package live_reviews_JAVA.week5_review;

public class S01_StringPractice {

	public static void main(String[] args) {

		String str1 = "Java";  // literal
		String str2 = "Java";  // literal

		// Java word is used for both str1 and str2.
		
		String str3 = new String("Java");  // object creation w/ new KW
		String str4 = new String("Java");
		
		// This way creates two objects in the memory.
		
		System.out.println(str1 == str2);  // true
		System.out.println(str1 == str3);  // false
		System.out.println(str3 == str4);  // false
		
		System.out.println("---------------");

		System.out.println(str1.equals(str4));
		System.out.println(str3.equals(str4));
		
		System.out.println("---------------");
		
		String str5 = "java";
		
		System.out.println(str1.equals(str5));
		System.out.println(str1.equalsIgnoreCase(str5));
	}

}
