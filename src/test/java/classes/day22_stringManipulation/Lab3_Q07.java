package classes.day22_stringManipulation;

public class Lab3_Q07 {

	public static void main(String[] args) {

		System.out.println(shortLongShort("Hello", "Hi"));
		System.out.println(shortLongShort("hi", "Hello"));
		System.out.println(shortLongShort("aaa", "b"));
		System.out.println(shortLongShort("Asude", "Esma"));
		System.out.println(shortLongShort("Istanbul", "Van"));
		System.out.println(shortLongShort("78", "1"));

	}
	
	public static String shortLongShort(String str1, String str2) {
		
		String modifier = "";
		
		if (str1.length()>str2.length()) {
			modifier = str2.concat(str1).concat(str2);
		} else {
			modifier = str1.concat(str2).concat(str1);
		}
		
		return modifier;
	}

}
