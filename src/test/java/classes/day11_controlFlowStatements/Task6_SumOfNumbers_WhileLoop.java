package classes.day11_controlFlowStatements;

public class Task6_SumOfNumbers_WhileLoop {

	public static void main(String[] args) {

		int sumEven=0;
		int i=0;

		while (i<=100) {
			if (i%2==0) {
				
				sumEven+=i;
			}
			
			i++;
		}

		System.out.println(sumEven);
	}

}
