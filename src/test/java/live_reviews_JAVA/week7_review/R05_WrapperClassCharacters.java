package live_reviews_JAVA.week7_review;

public class R05_WrapperClassCharacters {

	public static void main(String[] args) {
		
		char ch = 'D';
		
		boolean isDigit = Character.isDigit(ch);
		boolean isLetter = Character.isLetter(ch);
		boolean isLowerCase = Character.isLowerCase(ch);
		boolean isUpperCase = Character.isUpperCase(ch);
		boolean isSpecial = ! Character.isLetterOrDigit(ch); // if it is not digit or letter
		
//		System.out.println("Digit: " + isDigit);
//		System.out.println("Letter: " + isLetter);
//		System.out.println("LowerCase: " + isLowerCase);
//		System.out.println("UpperCase: " + isUpperCase);
//		System.out.println("Special: " + isSpecial);
		
		System.out.println(sumOfDigits("a1b2c3"));
		
	}
	
	public static int sumOfDigits (String str) {
		int sumOfDigits = 0;
		
		for(char each : str.toCharArray()) {
			if(Character.isDigit(each)) {
				sumOfDigits += Integer.parseInt(Character.toString(each)); // char -> String -> Integer
			}
		}
		
		return sumOfDigits;
	}
}
