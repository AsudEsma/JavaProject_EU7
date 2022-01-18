package classes.day19_stringClass;

public class Task5_VowelPrinter {

	public static void main(String[] args) {

		String str = "CybertekSchool";
		
		for (int i=0; i<str.length(); i++) {
			if (str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='o' || str.charAt(i)=='u' || str.charAt(i)=='i') {
				System.out.print(str.charAt(i));
				if(i!=str.length()-2) {
					System.out.print(",");
				}
			}
		}

	}

}
