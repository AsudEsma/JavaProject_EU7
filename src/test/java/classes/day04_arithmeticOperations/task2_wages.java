package classes.day04_arithmeticOperations;

//This program calculates hourly wages plus overtime

public class task2_wages {
	
	public static void main(String[] args) {
		
		double regularWages; //The calculated regular wage
		double basePay=25.75; //The base pay
		double regularHours=40; //The hours worked less overtime
		double overtimeWages; //Overtime wages
		double overtimePay=37.5; //Overtime pay rage
		double overtimeHours=15; //Overtime hours worked
		double totalWages; //Total Wage
		
		regularWages=basePay*regularHours;
		overtimeWages=overtimePay*overtimeHours;
		
		totalWages=regularWages+overtimeWages;
		
		System.out.println("Wages for this week are $" + totalWages);
		
		
		
		
		
		
		
		
	}
	

}
