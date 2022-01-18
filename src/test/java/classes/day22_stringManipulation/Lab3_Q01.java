package classes.day22_stringManipulation;

public class Lab3_Q01 {

	public static void main(String[] args) {

		System.out.println(greeting("Bob"));
		System.out.println(greeting("Alice"));
		System.out.println(greeting("X"));
	}
	
		public static String greeting(String str) {
			
			return "Hello ".concat(str).concat("!");
		

	}

}
