package classes.day08_controlFlowStatements;

public class NestedIfElse {

	public static void main(String[] args) {

		int salary, yearsOfJob;
		salary = 3000;
		yearsOfJob = 1;
		
		if (salary >= 30000) {
			if (yearsOfJob >= 2) {
				System.out.println("You are qualified for the loan.");
			} else {
				System.out.println("You must have been on your current job for at least 2 years.");
			}
		} else {
			System.out.println("You must earn at least US$30,000 per year.");
			
			System.out.println("*************************");
			
			boolean isRushHour = true;
			int carType = 2;
			double price = 0.0;
			
			if (carType == 1) {
				if (isRushHour == true) {
					price = 30;
				} else {
					price = 5;
				}
			} else if (carType == 2) {
				if (isRushHour == true) {
					price = 55.30;
				} else {
					price = 15.99;
				}
			}
			
			System.out.println("Total Cost: " + price);
			
			System.out.println("*************************");
		}

	}

}
