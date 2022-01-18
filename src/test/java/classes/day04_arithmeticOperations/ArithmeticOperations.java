package classes.day04_arithmeticOperations;

public class ArithmeticOperations {

	public static void main(String[] args) {

		//Aditional Operator +
		
		System.out.println(55+5);
		int chairs=140;
		System.out.println(chairs+2);
		chairs=chairs+2;
		
		int moreChairs=chairs+5;
		System.out.println(moreChairs);
		
		int tables=130;
		int total=tables+chairs;
		System.out.println(total);
		
		//Substruction -
		
		double balance = 1200.50;
		double transaction = 56.44;
		System.out.println(balance-transaction);
		balance=balance-transaction;
		System.out.println(balance);
		
		//Create a variable linesOfCode and assign 50 and print "Lines of code 50"
		//delete 2 lines
		//decrease the value of linesOfCode by 2 and print "Lines of code 48"
		
		int linesOfCodes=50;
		System.out.println("Lines of code " + linesOfCodes);
		linesOfCodes=linesOfCodes-2;
		System.out.println("Lines of code " + linesOfCodes);
		
		//Multiplication *
		System.out.println(22*2);
		System.out.println(11*0);
		
		int classes = 5;
		System.out.println(linesOfCodes * classes);
		int totalLinesOfCodes=linesOfCodes*classes;
		System.out.println("Total Lines of Codes " + totalLinesOfCodes);
		
		//Division /
		System.out.println(10/2);
		System.out.println(60/3);
		System.out.println(11/8);
		
		//System.out.println(11/0); //throw error while running the code
		
		//Remainder %
		System.out.println(10%2);
		System.out.println(9%5);
		System.out.println(845_687%5_864);
		
		
		
	}

}
