package classes.day22_stringManipulation;

public class Lab3_Q08 {

	public static void main(String[] args) {

		System.out.println(rotateLeft2("Hello"));
		System.out.println(rotateLeft2("java"));
		System.out.println(rotateLeft2("Hi"));
		System.out.println(rotateLeft2("Asude"));
		System.out.println(rotateLeft2("Esma"));

	}
	
	public static String rotateLeft2(String str) {
		
		return str.substring(2).concat(str.substring(0, 2));
	}

}
