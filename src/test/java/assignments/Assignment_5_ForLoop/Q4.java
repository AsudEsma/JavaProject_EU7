package assignments.Assignment_5_ForLoop;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please, enter a number.");
		double num = scan.nextDouble();
		scan.close();
		
		for (int i=1; i<10; i++) {
			if(num>10) {
				break;
			} else {
				num*=10;
			}
		}
		
		System.out.println(num);
	}

}
