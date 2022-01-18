package assignments.Assignment_6_NestedForLoop;

public class Q4 {

	public static void main(String[] args) {
		int k=7;
		for (int i=1; i<=k; i++) {
			for (int j=1; j<=i; j++) {
				if (j%2!=0) {
					System.out.print(1);
				} else {
					System.out.print(0);
				}
			}
			
			System.out.println();
		}

	}

}
