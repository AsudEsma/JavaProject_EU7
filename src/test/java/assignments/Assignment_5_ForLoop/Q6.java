package assignments.Assignment_5_ForLoop;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please, enter a number.");
		int n = scan.nextInt();
		scan.close();
		
		int num1=0, num2=1;
		for (int i=1; i<=n; ++i) {
			if (i<n) {
				System.out.print(num1 + ", ");
				int num3 = num1 + num2;
				num1 = num2;
				num2 = num3;
			} else {
				System.out.print(num1);
				int num3 = num1 + num2;
				num1 = num2;
				num2 = num3;
			}
	    }

	}

}
