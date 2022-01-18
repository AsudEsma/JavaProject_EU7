package classes.day22_stringManipulation;

public class Lab3_Q03 {

	public static void main(String[] args) {

		System.out.println(extraEnd("Hello"));
		System.out.println(extraEnd("ab"));
		System.out.println(extraEnd("Hi"));
		System.out.println(extraEnd("A"));
		
	}
	
	public static String extraEnd (String str) {
		
		String makeFun = "";
		
		if(str.length()>=2) {
			
			makeFun = str.substring(str.length()-2);
			return str+makeFun+makeFun+makeFun;
			
		} else {
			System.out.println("Invaldi entry.");
			return "";
		}

	}

}
