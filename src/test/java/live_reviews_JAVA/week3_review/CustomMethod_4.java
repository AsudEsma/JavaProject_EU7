package live_reviews_JAVA.week3_review;

public class CustomMethod_4 {

	public static void main(String[] args) {

		System.out.println(getAllLetters(true,true));
		System.out.println(getAllLetters(true,false));
		System.out.println(getAllLetters(false,true));
		System.out.println(getAllLetters(false,false));

		System.out.println("---------------------------------------------------");
		
		System.out.println(oscarsWay(true,true));
		System.out.println(oscarsWay(true,false));
		System.out.println(oscarsWay(false,true));
		System.out.println(oscarsWay(false,false));
	}
	
	public static String getAllLetters(boolean isUpperCase, boolean aToZ) {
		String getAllLetters="";
		
		if (isUpperCase && aToZ) {
			for (int i='A'; i<='Z'; i++) {
				getAllLetters += (char)i + " ";
			}
		} else if (isUpperCase && !aToZ) {
			for (int i='Z'; i>='A'; i--) {
				getAllLetters += (char)i + " ";
			}
		} else if (!isUpperCase && aToZ) {
			for (int i='a'; i<='z'; i++) {
				getAllLetters += (char)i + " ";
			}
		} else {
			for (int i='z'; i>='a'; i--) {
				getAllLetters += (char)i + " ";
			}
		}
		
		return getAllLetters;
	}

	public static String oscarsWay(boolean isUpperCase, boolean aToZ) {

		char start, finish;
		String oscarsWay = "";
		
		if (isUpperCase) {
			start = 'A';
			finish = 'Z';
		} else {
			start = 'a';
			finish = 'z';
		}
		
		if (aToZ) {
			for ( ; start<=finish; start++) {
				oscarsWay+=start + " ";
			}
		} else {
			for ( ; finish>=start; finish--) {
				oscarsWay+=finish + " ";
			}
		}
		
		return oscarsWay;
	}


}
