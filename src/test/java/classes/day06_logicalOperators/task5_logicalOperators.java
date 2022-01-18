package classes.day06_logicalOperators;

public class task5_logicalOperators {

	public static void main(String[] args) {

		double d1 = 20, d2 =80;
		double d3 = (d1+d2)*25;
		double remainder = (d3)%40;
		boolean b1 = remainder <= 20;
		
		System.out.println(remainder);
		System.out.println("Reamining total is 20 or less: " + b1);
		
	}

}
