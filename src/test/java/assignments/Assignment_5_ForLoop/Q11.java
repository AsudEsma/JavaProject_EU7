package assignments.Assignment_5_ForLoop;

public class Q11 {

	public static void main(String[] args) {

		int n=4;
		for (int i=1; i<=n; i++) {
			for (int j=2; j<=i; j++) {
				System.out.print(" ");
			}

			for (int j=i; j<=n; j++) {
				System.out.print(n-j+1 + " ");
			}
			
			System.out.println();
		}

	}

}
