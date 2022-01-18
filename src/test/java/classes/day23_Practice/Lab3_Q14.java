package classes.day23_Practice;

public class Lab3_Q14 {

	public static void main(String[] args) {

		System.out.println(lyDedector("oddly"));
		System.out.println(lyDedector("oddy"));
		System.out.println(lyDedector("y"));
		System.out.println(lyDedector("lobby"));
		System.out.println(lyDedector("oddly"));
		System.out.println(lyDedector("badly"));

	}
	
	public static boolean lyDedector (String str) {
		
		if (str.length()<2) {
			return false;
		}
		
		if ("ly".equals(str.substring(str.length()-2))) {
			return true;
		} else {
			return false;
		}

	}

}
