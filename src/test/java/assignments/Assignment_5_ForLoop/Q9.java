package assignments.Assignment_5_ForLoop;

import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		
		int start=0;
		while (start<n) {
			start++;
			if (start%2==1) {
				if (start==1) {
					System.out.print(start);
				} else {
					System.out.print(", " + start);
				}
				
			} else {
				continue;
			}

		}

	}

}
