package classes.day06_logicalOperators;

public class task3_logicalOperators {

	public static void main(String[] args) {

		int b = 2;
		boolean res = ++b == 2 || --b == 2 && --b == 2;
		
		// (3 == 2 -> F) || (2 == 2 -> T) && (1 == 2 -> F) = F
		
		System.out.println(res);

	}

}
