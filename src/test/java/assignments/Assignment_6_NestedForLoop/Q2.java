package assignments.Assignment_6_NestedForLoop;

public class Q2 {

	public static void main(String[] args) {

		for (int i=1; i<=7; i++) {
			for (int j=7, p=1; j>=i; j--) {
				System.out.print(p++ + " ");
			}
			
			System.out.println();
		}
		
		for (int i=2; i<=7; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print(j + " ");
			}
			
			System.out.println();
		}

	}

}
