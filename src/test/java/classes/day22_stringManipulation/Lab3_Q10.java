package classes.day22_stringManipulation;

public class Lab3_Q10 {

	public static void main(String[] args) {

		System.out.println(first2_Last2("edited"));
		System.out.println(first2_Last2("edit"));
		System.out.println(first2_Last2("ed"));
		System.out.println(first2_Last2("nalan"));
		System.out.println(first2_Last2("surreal"));
		System.out.println(first2_Last2("lili"));
		

	}
	
	public static boolean first2_Last2(String str) {
		
		if (str.substring(0, 2).equals(str.substring(str.length()-2))) {
			return true;
		} else {
		return false;
		}
	}

}
