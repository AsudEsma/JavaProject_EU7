package classes.day04_arithmeticOperations;

public class task4_contribution {

	public static void main(String[] args) {

		/*This program calculates the amount of pay that will be contributed to a
		 * retirement plan if 5%, 8% or 10% of monthly pay is withheld
		 */

		double amountOfPay1; //5%
		double amountOfPay2; //8%
		double amountOfPay3; //10%
		int salary=6000;
		
		amountOfPay1=salary*0.05;
		amountOfPay2=salary*0.08;
		amountOfPay3=salary*0.1;
				
		System.out.println("The amount of pay if the percantage is 5 is $" + amountOfPay1);
		System.out.println("The amount of pay if the percantage is 8 is $" + amountOfPay2);
		System.out.println("The amount of pay if the percantage is 10 is $" + amountOfPay3);
		System.out.println();
		
		//Another approach:		
		
		double monthlyPay=6000;
		double contribution;
		
		//Calculate and display 5% contribution
		
		contribution=monthlyPay*0.05;
		System.out.println("5% is $" + contribution + " per month.");
		
		//Calculate and display 8% contribution
		
		contribution=monthlyPay*0.08;
		System.out.println("8% is $" + contribution + " per month.");
		
		//Calculate and display 10% contribution
		
		contribution=monthlyPay*0.1;
		System.out.println("10% is $" + contribution + " per month.");
		
				
	}

}
