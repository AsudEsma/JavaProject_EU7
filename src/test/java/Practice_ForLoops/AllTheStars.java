package Practice_ForLoops;

public class AllTheStars {

	public static void main(String[] args) {
	
		Triangle(5);
		IncreasingTriangle(5);
		Square1(5);
		Square2(5);
		DecreasingTriangle(5);
		RightSidedTrianle1(5);
		RightSidedTrianle2(5);
		HilePattern(5);
		ReverseHillPattern(5);
		DiamondPattern(5);
		ButterflyPattern(5);
	}
	
	public static void Triangle(int S) {
		
		for (int i=1; i<=S; i++) {
			for (int a=1; a<=i; a++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void IncreasingTriangle(int S) {
		
		for (int i=1; i<=S; i++) {
			for (int a=1; a<=i; a++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	
	public static void Square1(int S) {
		
		for (int i=1; i<=S; i++) {
			for (int a=1; a<=S; a++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void Square2(int S) {
		
		for (int i=1; i<=S; i++) {
			for (int a=1; a<=S; a++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void DecreasingTriangle(int S) {
		
		for (int i=1; i<=S; i++) {
			for (int a=i; a<=S; a++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void RightSidedTrianle1(int S) {
		
		for (int i=1; i<=S; i++) {
			for (int a=i; a<=S; a++) {
				System.out.print("  ");
			}
			for (int a=1; a<=i; a++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void RightSidedTrianle2(int S) {
		
		for (int i=1; i<=S; i++) {
			for (int a=1; a<=i; a++) {
				System.out.print("  ");
			}
			for (int a=i; a<=S; a++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void HilePattern(int S) {
		
		for (int i=1; i<=S; i++) {
			for (int a=i; a<=S; a++) {
				System.out.print("  ");
			}
			for (int a=1; a<i; a++) {
				System.out.print("* ");
			}
			for (int a=1; a<=i; a++) {
				System.out.print("* ");
			}			
			System.out.println();
		}
	}
	
	public static void ReverseHillPattern(int S) {
		
		for (int i=1; i<=S; i++) {
			for (int a=1; a<=i; a++) {
				System.out.print("  ");
			}
			for (int a=i; a<S; a++) {
				System.out.print("* ");
			}
			for (int a=i; a<=S; a++) {
				System.out.print("* ");
			}			
			System.out.println();
		}
	}

	public static void DiamondPattern(int S) {
		
		for (int i=1; i<S; i++) {
			for (int a=i; a<=S; a++) {
				System.out.print("  ");
			}
			for (int a=1; a<i; a++) {
				System.out.print("* ");
			}
			for (int a=1; a<=i; a++) {
				System.out.print("* ");
			}			
			System.out.println();
		}
		
		for (int i=1; i<=S; i++) {
			for (int a=1; a<=i; a++) {
				System.out.print("  ");
			}
			for (int a=i; a<S; a++) {
				System.out.print("* ");
			}
			for (int a=i; a<=S; a++) {
				System.out.print("* ");
			}			
			System.out.println();
		}
	
	}
	
	public static void ButterflyPattern(int S) {
		
		for (int i=1; i<S; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			for (int j=i; j<=S; j++) {
				System.out.print("  ");
			}
			for (int j=i; j<S; j++) {
				System.out.print("  ");
			}
			for (int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
		for (int i=1; i<=S; i++) {
			for (int j=i; j<=S; j++) {
				System.out.print("* ");
			}
			for (int j=1; j<=i; j++) {
				System.out.print("  ");
			}
			for (int j=1; j<i; j++) {
				System.out.print("  ");
			}
			for (int j=i; j<=S; j++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
	}

}
