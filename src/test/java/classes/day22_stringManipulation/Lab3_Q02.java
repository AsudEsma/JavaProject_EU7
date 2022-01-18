package classes.day22_stringManipulation;

public class Lab3_Q02 {

	public static void main(String[] args) {

		System.out.println(reversePower("Hi", "Bye"));
		System.out.println(reversePower("Yo", "Alice"));
		System.out.println(reversePower("What", "Up"));
		
	}
	
	public static String reversePower(String a, String b) {
		
		return a.concat(b).concat(b).concat(a);
	}

}
