package live_reviews_JAVA.week7_review;

public class R06_WrapperClassCharacters {
	
	public static void main(String[] args) {
		
		String s = "abcd1234!@#&�efgh6789#$ABCD";
		
		String letter = "";
		String upperCase = "";
		String lowerCase = "";
		String digits = "";
		String specialChars = "";

		
		for(char each : s.toCharArray()) {
			if(Character.isLetter(each)) {
				letter += each;
				if(Character.isUpperCase(each)) {
					upperCase += each;
				} else {
					lowerCase += each;
				}
			} else if(Character.isDigit(each)) {
				digits += each;
			} else {
				specialChars += each;
			}
		}
		
		System.out.println(letter);
		System.out.println(upperCase);
		System.out.println(lowerCase);
		System.out.println(digits);
		System.out.println(specialChars);	
		
	}

}
