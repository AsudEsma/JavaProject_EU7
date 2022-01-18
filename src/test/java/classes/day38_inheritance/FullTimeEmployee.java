package classes.day38_inheritance;

public class FullTimeEmployee extends Employee {

	@Override
	public void calculatePay(int hours, double rate) {
		double total = (hours*rate)*1.05;
		System.out.println("Fulltime employee total pay: " + total);
	}
}
