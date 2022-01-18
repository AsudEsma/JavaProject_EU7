package Practice_ForLoops;

public class TwistedHourGlass {

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

		for (int i=1; i<=k; i++) {
			if(i==1) {
				continue;
			}
			for (int j=7; j>i; j--) {
				System.out.print(" ");
			}
			
			for (int j=1, p=k; j<=i; j++) {
				System.out.print(p-- + " ");
			}
			
			System.out.println();
		}
	}

}
