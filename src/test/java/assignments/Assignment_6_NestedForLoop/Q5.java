package assignments.Assignment_6_NestedForLoop;

public class Q5 {

	public static void main(String[] args) {
		
		int k=7;
		for (int i=1; i<=k; i++) {
			for (int j=k; j>i; j--) {
				System.out.print(1);
			}
			
			for (int j=1; j<=i; j++) {
				System.out.print(i);
			}
			
			System.out.println();
		}

	}

}
