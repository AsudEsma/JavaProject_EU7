package classes.day23_Practice;

public class Lab3_Q13 {

	public static void main(String[] args) {

		System.out.println(charMyltiplier("The"));
		System.out.println(charMyltiplier("AAbb"));
		System.out.println(charMyltiplier("Hi-There"));
		System.out.println(charMyltiplier("Asude"));
		System.out.println(charMyltiplier("Esma"));
		System.out.println(charMyltiplier("Nasil yhaa"));
		System.out.println(charMyltiplier(":) i am a little bit of psycho"));

	}
	
	public static String charMyltiplier (String str) {
		
		String multi = "";
		for (int i=0; i<str.length(); i++) {
			multi+= str.charAt(i) + "" + str.charAt(i);
		}
		
		return multi;
	}

}
