package assignments.ReplitAnswers;

import java.util.Scanner;

public class Lame_Calculator {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 
		LameCalculator lc = new LameCalculator();
		int a = in.nextInt();
		int b = in.nextInt();
		System.out.println(lc.plus(a, b)); 
		System.out.println(lc.minus(a, b));
		System.out.println(lc.multiply(a, b));
		System.out.println(lc.divide(a, b));
		in.close();

	}
}
	
	class LameCalculator {
		
		public int plus(int a, int b) {
			return a+b;
		}
		
		public int minus(int a, int b) {
			return a-b;
		}
		
		public int multiply(int a, int b) {
			return a*b;
		}
		
		public int divide(int a, int b) {
			return a/b;	
		}
}
