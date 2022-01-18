package assignments.Assignment_5_ForLoop;

public class Q13 {
	
	public static void main(String[] args) {
		
		for (int i=1; i<=8; i++) {
			for (int j=i; j<=8; j++) {
				if (j%2==0) {
					System.out.print("B ");
				} else {
					System.out.print("W ");
				}
			}
			
			for (int j=1; j<i; j++) {
				if (j%2==0) {
					System.out.print("B ");
				} else {
					System.out.print("W ");
				}
			}
			
			System.out.println();
		}
	}

}
