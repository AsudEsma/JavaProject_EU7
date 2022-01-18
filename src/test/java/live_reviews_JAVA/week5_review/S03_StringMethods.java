package live_reviews_JAVA.week5_review;

public class S03_StringMethods {

	public static void main(String[] args) {

		String message = "Java is Awesome!";
		//				  0123456789....16
		int count = message.length();
		System.out.println("How many characters I have here: " + count);
		
		// for iterating through our string object.
		
		System.out.println(message.charAt(0));
		System.out.println(message.charAt(message.length()-1));
		
		message.contains(""+'a'); // This is how you turn a char into str.
		
		boolean b1 = message.contains("Java");
		boolean b2 = message.contains("J");
		
		System.out.println(b1);
		System.out.println(b2);
		
		if (message.contains("Java")) {
			System.out.println("The message has Java in it.");
		} else {
			System.out.println("Message does not have this word.");
		}
		
		if (b2) {
			System.out.println("The message has J in it.");
		} else {
			System.out.println("Message does not have this word.");
		}
		
		System.out.println(message.substring(0, 4));
		System.out.println(message.substring(5));
		
	}

}
