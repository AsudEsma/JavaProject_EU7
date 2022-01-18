package live_reviews_JAVA.week3_review;

public class PrintAllLetters {

	public static void main(String[] args) {

		//Print all the letters from A to Z
		
		for (char c='A'; c<='Z'; c++) {
			System.out.print(c + " ");
		}
		
		System.out.println();

		for (int i=65; i<=90; i++) {
			System.out.print((char)i + " ");
		}
		
		System.out.println();
		
		for (int i='z'; i>='a'; i--) {
			System.out.print((char)i + " ");
		}
	}

}
