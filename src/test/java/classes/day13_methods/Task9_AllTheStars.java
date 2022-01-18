package classes.day13_methods;

public class Task9_AllTheStars {

	public static void main(String[] args) {

		Stars(5);
		Stars(8);

	}
	
	public static void Stars(int S) {
		
		for (int i=1; i<=S; i++) {
			for (int a=1; a<=i; a++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
