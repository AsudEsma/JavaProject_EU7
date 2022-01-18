package classes.day22_stringManipulation;

public class Lab3_Q09 {

	public static void main(String[] args) {

		System.out.println(rotateRight2("Hello"));
		System.out.println(rotateRight2("java"));
		System.out.println(rotateRight2("Hi"));
		System.out.println(rotateRight2("Asude"));
		System.out.println(rotateRight2("Esma"));		

	}
	
	public static String rotateRight2(String str) {
		
		return str.substring(str.length()-2).concat(str.substring(0, str.length()-2));
	}

}
