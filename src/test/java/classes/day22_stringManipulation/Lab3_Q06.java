package classes.day22_stringManipulation;

public class Lab3_Q06 {

	public static void main(String[] args) {

		System.out.println(notFully("Hello"));
		System.out.println(notFully("java"));
		System.out.println(notFully("coding"));
		System.out.println(notFully("Asude"));
		System.out.println(notFully("KellePa�a"));

	}
	
	public static String notFully(String str) {
		
		return str.substring(1, str.length()-1);
	}

}
