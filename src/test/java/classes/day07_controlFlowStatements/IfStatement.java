package classes.day07_controlFlowStatements;

public class IfStatement {

	public static void main(String[] args) {

		int score = 85;
		
		if (score>=85) {
			
			System.out.println("Excellent!");
			System.out.println("You passed with grade A");
		}

		System.out.println("************************");
		
		int sales, bonus;
		double commissionRate, salary;
		
		sales = 5001;
		salary = 10000;
		
		if(sales>5000) {
			bonus = 500;
			commissionRate = 1.12;
			
			salary = salary * commissionRate + bonus;
		}
		
		System.out.println("Salary= " + salary);
	}

}
