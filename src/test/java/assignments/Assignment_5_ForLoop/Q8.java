package assignments.Assignment_5_ForLoop;

import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		
		int num1=1, sum=0;
		while (num1<=n) {
			sum += num1;
			num1++;
		}
		
		System.out.println(sum);

	}

}
