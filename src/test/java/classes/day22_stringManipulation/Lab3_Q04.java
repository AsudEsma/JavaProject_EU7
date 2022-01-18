package classes.day22_stringManipulation;

public class Lab3_Q04 {

	public static void main(String[] args) {

		System.out.println(firstTwo("Hello!"));
		System.out.println(firstTwo("abcdefg"));
		System.out.println(firstTwo("ab"));
		System.out.println(firstTwo("v"));
		
	}
	
	public static String firstTwo (String str) {
		
		if(str.length()<2) {
			return str;
		} else if (str.isEmpty()) {
			return "";
		} else {
			String s1 = str.substring(0, 2);
			return s1;
		}
	}

}
