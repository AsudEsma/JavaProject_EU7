package assignments.Assignment_6_NestedForLoop;

public class Q6 {

	public static void main(String[] args) {

		int k=5;
		for (int i=1; i<=k; i++) {
			for (int j=1, p=0, s=0; j<=i; j++, p+=6, s+=j) {
				System.out.print(i+p-s + " ");
			}
			
			System.out.println();
		}

	}

}
