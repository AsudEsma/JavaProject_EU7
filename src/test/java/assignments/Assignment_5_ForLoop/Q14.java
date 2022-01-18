package assignments.Assignment_5_ForLoop;

public class Q14 {

	public static void main(String[] args) {

		for (int i=1; i<=7; i++) {
			for (int j=1; j<=1; j++) {
				System.out.print("#");
			}
			for (int j=1; j<i; j++) {
				System.out.print(" ");
			}
			
			for (int j=1; j<=1; j++) {
				System.out.print("#");
			}
			
			System.out.println();
		}

	}

}
