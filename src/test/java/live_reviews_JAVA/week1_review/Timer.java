package live_reviews_JAVA.week1_review;

import java.util.Scanner;

public class Timer {

	public static void main(String[] args) throws InterruptedException {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please, enter the number of minutes");
		int minutes = scan.nextInt();
		scan.close();
		
		for (int i=minutes; i>0; --i) {
			if (i<0) {
				break;
			}
			for (int z=59; z>=0; --z) {
				System.out.print("Remaining Time: " + (i-1) + " minutes and " + z + " seconds left\r" );
				Thread.sleep(1000);
			} 
		}
	}

}
