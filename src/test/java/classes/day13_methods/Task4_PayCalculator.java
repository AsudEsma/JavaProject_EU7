package classes.day13_methods;

public class Task4_PayCalculator {

	public static void main(String[] args) {

		payCalculator(80,20);
		payCalculator(37,62.5);
	}
	
	public static void payCalculator(double hours, double hourlyPay) {
		
		double pay = hours * hourlyPay;
		System.out.println(pay);
	}

}
