package assignments.ReplitAnswers;

public class PrintEvenFrom80_20 {

	public static void main(String[] args) {

		
		for (int i=80; i>=20; i--) {
			if (i%2==0) {
				if (i>20) {
					System.out.print(i + " ");
				} else {
					System.out.print(i);
				}
				
			}
		}

	}

}
