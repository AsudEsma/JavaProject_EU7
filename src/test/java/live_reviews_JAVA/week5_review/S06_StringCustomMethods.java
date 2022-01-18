package live_reviews_JAVA.week5_review;

public class S06_StringCustomMethods {

	String str;
	
	public void setStr(String s) {
		if (s.isEmpty()) {
			System.exit(0);;
		}
		
		str=s;
	}
	
	// takes the string which is assigned to our object and reverse it
	public String reverse() {
		String backwards = "";
		for (int i=str.length()-1; i>=0; i--) {
			backwards+=str.charAt(i);
		}
		
		return backwards;
	}
	
	// check the string and reverse, and decide if they are the same or not
	public boolean isPolindrome() {
		boolean a;
		
		str = str.replace(" ", "");
//		str = str.trim();
		
		String reversed = reverse();
		
		a = reversed.equalsIgnoreCase(str);
		return a;
		
	}

}
