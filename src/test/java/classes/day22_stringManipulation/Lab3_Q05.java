package classes.day22_stringManipulation;

public class Lab3_Q05 {

	public static void main(String[] args) {

		System.out.println(firstHalf("WooHoo"));
		System.out.println(firstHalf("HelloThere"));
		System.out.println(firstHalf("abcdef"));
		System.out.println(firstHalf("Kazablanka"));
		System.out.println(firstHalf("Asude"));
		
	}
	
	public static String firstHalf(String str) {
		
		
		return str.substring(0,(str.length()/2));
	}

}
