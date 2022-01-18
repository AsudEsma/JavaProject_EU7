package classes.day13_methods;

public class CreditCardMethod {
	
	public static void main (String [] args) {
		
		double salary = 50_000;
		int creditRating = 5;
		
		if (salary>=20_000 && creditRating>=7) {
			qualify();
		} else {
			noQualify();
		}
	}

	public static void noQualify() {
		System.out.println("I am sorry, you are not qualified for the CC");	
	}

	public static void qualify() {
		System.out.println("Congrats, you are qualified for the CC");
	}
	


}
