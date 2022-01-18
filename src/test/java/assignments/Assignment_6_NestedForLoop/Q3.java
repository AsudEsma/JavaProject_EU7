package assignments.Assignment_6_NestedForLoop;

public class Q3 {

	public static void main(String[] args) {

		int k=7;
		for (int i=1; i<=k; i++) {
			for (int j=2; j<=i; j++) {
				System.out.print(" ");
			}
			
			for (int j=k, p=i; j>=i; j--) {
				System.out.print(p++ + " ");
			}

			System.out.println();
		}

		for (int i=7; i>=1; i--) {

			if(i==7) {
				continue;
			}
			for (int j=i; j>1; j--) {
				System.out.print(" ");
			}
			
			for (int j=i; j<=7; j++) {
				System.out.print(j + " ");
			}
			
			System.out.println();
		}
	}

}
