package classes.day19_stringClass;

public class CharAt {

	public static void main(String[] args) {

		String word = "Computer";
		
		System.out.println(word.length());
		
		System.out.println(word.charAt(0));
		System.out.println(word.charAt(1));
		System.out.println(word.charAt(2));
		System.out.println(word.charAt(3));
		System.out.println(word.charAt(4));
		System.out.println(word.charAt(5));
		System.out.println(word.charAt(6));
		System.out.println(word.charAt(7));
		
		String w2 = "Apple";
		if (w2.charAt(0)=='A') {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		
		String w3 = "civic";
		if (w3.charAt(0)==w3.charAt(4)) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		
		String w4 = "AsudEsmA";
		if (w4.charAt(0)==w4.charAt(w4.length()-1)) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		

	}

}
