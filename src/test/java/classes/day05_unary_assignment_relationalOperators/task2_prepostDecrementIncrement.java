package classes.day05_unary_assignment_relationalOperators;

public class task2_prepostDecrementIncrement {

	public static void main(String[] args) {

		int x = 4;
		int y = x * 4 - x++;  // 4 * 4 - 4 = 12
		
		System.out.println("x is " + x);  //5
		System.out.println("y is " + y);  //12
				
	}

}
