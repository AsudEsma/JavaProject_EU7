package classes.day15_methods;

public class FibonacciNums {

	public static void main(String[] args) {
		
		int count = 11;
		int pre1=0, pre2=1;
		System.out.println("Fibonacci series of " + count + " numbers.");

		for (int i=1; i<=count; i++) {
			System.out.print(pre2 + " ");
			
			int sum = pre1 + pre2;
			pre1 = pre2;
			pre2 = sum;
		}
	}

}
