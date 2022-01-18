package classes.day30_wrapperClass;

public class WrapperClassMethods {

	public static void main(String[] args) {
		
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
	
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		
		System.out.println(Character.MIN_VALUE); // space
		System.out.println(Character.MAX_VALUE); // question mark
		
		
		/* Checking if it is char or not. It can be used in passwords.
		 * "You need to have at least 1 letter, and 1 number in your password."
		 * kind of restrictions can be checked with this method. */
		
		System.out.println(Character.isAlphabetic('a')); // true
		System.out.println(Character.isAlphabetic('1')); // false
		
		System.out.println(Character.isLetter('j'));     // true
		System.out.println(Character.isLetter('&'));     // false
		
		System.out.println(Character.isDigit('5'));      // true
		System.out.println(Character.isDigit('p'));      // false
		
		String word = "java101";
		System.out.println(Character.isAlphabetic(word.charAt(0))); // true
		System.out.println(Character.isDigit(word.charAt(6)));      // true
		
		
	}
	
	
}
