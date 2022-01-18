package live_reviews_JAVA.week2_review;

public class task1_salaryCalculation {

	public static void main(String[] args) {

		int hourlyRate = 60;
		double taxRate = 0.3;
		int weeklyHour = 40;
		double salary = hourlyRate*weeklyHour*48;
		double totalTax = salary * taxRate;
		double monthlySalary = (salary - totalTax) / 12;
		
		System.out.println("Yearly salary is\t\t\t$ " + salary);
		System.out.println("The taxes payed is\t\t\t$ " + totalTax);
		System.out.println("Yearly salary after taxes is\t\t$ " + (salary - totalTax));
		System.out.println("Monthly salary after taxes is\t\t$ " + monthlySalary);
	}

}
