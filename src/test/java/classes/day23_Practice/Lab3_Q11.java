package classes.day23_Practice;

public class Lab3_Q11 {

	public static void main(String[] args) {

		System.out.println(randomHi("abc hi hohi"));
		System.out.println(randomHi("ahihihikjl   hi  "));
		System.out.println(randomHi("Asude Esma"));
		System.out.println(randomHi("hikmet hikaye anlat�r."));
		System.out.println(randomHi("hello, hi, how are you, hi"));
		System.out.println(randomHi("bi hi bile demediii .s.s"));
	}
	
	public static int randomHi(String str) {
		
		int counter = 0;
		for (int i=0; i<str.length()-1; i++) {
			if (str.substring(i, i+2).equals("hi")) {
				counter++;
			}
		}
		
		return counter;
	}

}
