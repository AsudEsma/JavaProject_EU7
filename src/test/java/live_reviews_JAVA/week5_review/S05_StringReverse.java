package live_reviews_JAVA.week5_review;

public class S05_StringReverse {

	public static void main(String[] args) {

		System.out.println(reverseOrg("Oscar"));
		System.out.println(reverseOrg("Asude"));
		
	}
		
	public static String reverseOrg(String str) {
		String backwards = "";
		for (int i=str.length()-1; i>=0; i--) {
			backwards+=str.charAt(i);
		}
		
		return backwards;
	}
	

}

