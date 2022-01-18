package live_reviews_JAVA.week5_review;

public class S02_StringPractice {

	public static void main(String[] args) {

		String str = "Cydeo";
		str.concat(" School");
		
		System.out.println(str); // Cydeo
		
		String strNew = str.concat(" School");
		
		System.out.println(str); // Cydeo
		System.out.println(strNew); // Cydeo School

		str = strNew; // "Cydeo" will be garbage, and will be collected.
		// str reference valuable points to object "Cydeo School"
		// so the "Cydeo" will be free, and thats why will be collected
	
		System.out.println("---------------------");
	
		String str2 = "EU7 Batch Java Course";
		str2.toUpperCase();
		
		System.out.println("str2: " + str2);
		System.out.println(str2.toUpperCase());
		
		
		
	}

}
