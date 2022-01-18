package classes.day23_Practice;

public class Lab3_Q15 {

	public static void main(String[] args) {

		System.out.println(badDedector("badxxx"));
		System.out.println(badDedector("xbadxx"));
		System.out.println(badDedector("xxbadxx"));
		System.out.println(badDedector("you are so bad"));
		System.out.println(badDedector(""));
		System.out.println(badDedector("ba"));
		System.out.println(badDedector("bad girl riri"));

	}
	
	public static boolean badDedector (String str) {
		if (str.length()<3) {
			return false;
		}
		
		if (str.substring(0, 3).equals("bad") || str.subSequence(1, 4).equals("bad")) {
			return true;
		} else {
			return false;
		}
	}

}
