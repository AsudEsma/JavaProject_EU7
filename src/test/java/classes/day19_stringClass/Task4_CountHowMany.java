package classes.day19_stringClass;

public class Task4_CountHowMany {

	public static void main(String[] args) {

		String str = "abcabqcabc";
		char myChar = 'c';
		int count = 0;
		
		for (int i=0; i<str.length(); i++) {
			if (str.charAt(i)==myChar) {
				count++;
			}
		}
		
		System.out.println("Count for " + myChar +" is "+ count);
	}

}
