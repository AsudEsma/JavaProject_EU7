package Practice_ForLoops;

public class AllTheNumPatterns {

	public static void main(String[] args) {

		TriangleNum1(5);
		IncreasingTriangleIncrementingRow(5);
		IncreasingTriangleDecrementingRow(5);
		IncreasingTriangleEvenNums(5);
		IncreasingTriangleWeirdThingys1(5);
		IncreasingTriangleWeirdThingys2(5);
		IncreasingTriangleIncrementingColoums(5);
	}
	
	public static void TriangleNum1(int n) {
		
		for (int i=1; i<=n; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print("1 ");
			}
			System.out.println();
		}
		
	}
	
	public static void IncreasingTriangleIncrementingRow(int n) {
		
		for (int i=1, p=1; i<=n; i++, p++) {
			for (int j=1; j<=i; j++) {
				System.out.print(p + " ");
			}
			System.out.println();
		}
		
	}
	
	public static void IncreasingTriangleDecrementingRow(int n) {
		
		for (int i=1, p=n; i<=n; i++, p--) {
			for (int j=1; j<=i; j++) {
				System.out.print(p + " ");
			}
			System.out.println();
		}
		
	}
	
	public static void IncreasingTriangleEvenNums(int n) {
		
		for (int i=1, p=0; i<=n; i++, p+=2) {
			for (int j=1; j<=i; j++) {
				System.out.print(p + " ");
			}
			System.out.println();
		}
	}
	
	public static void IncreasingTriangleWeirdThingys1(int n) {
		
		//Rows: Odd=1 & Even=2
		for (int i=1; i<=n; i++) {
			for (int j=1; j<=i; j++) {
				if (i%2==0) {
				System.out.print("2 ");
				} else {
				System.out.print("1 ");
				}
			}
			
			System.out.println();
		}
	}
	
	public static void IncreasingTriangleWeirdThingys2(int n) {
		
		//Rows: Odd=1 & Even=2
		for (int i=1; i<=n; i++) {
			for (int j=1; j<=i; j++) {
				if (i%2==0) {
				System.out.print("& ");
				} else {
				System.out.print("# ");
				}
			}
			
			System.out.println();
		}
	}

	public static void IncreasingTriangleIncrementingColoums(int n) {
		
		for (int i=1; i<=n; i++) {
			int p=1;
			for (int j=1; j<=i; j++) {
				System.out.print(p++ + " ");
			}
			
			System.out.println();
		}
	}
}
