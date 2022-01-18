package classes.day23_Practice;

public class Lab3_Q16_Palindromes {

	public static void main(String[] args) {

		System.out.println(palindrome("lool"));
		System.out.println(palindrome("LoL"));
		System.out.println(palindrome("wow"));
		System.out.println(palindrome("racecar"));
		System.out.println(palindrome("level"));
		System.out.println(palindrome("pale lap"));
		System.out.println(palindrome("madam"));
		System.out.println(palindrome("mom"));
		System.out.println(palindrome("moon"));
		System.out.println(palindrome("Taco cat"));

	}
	
	public static boolean palindrome(String str) {
		
		String backwards = "";
		for (int i=str.length()-1; i>=0; i--) {
			backwards += str.charAt(i);
		}
		
		if(str.replace(" ", "").equalsIgnoreCase(backwards.replace(" ", ""))) {
			return true;
		} else {
			return false;
		}

	}

}
