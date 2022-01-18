package classes.day35_encapsulation;

public class CarpetCalculator {

	public static void main(String[] args) {
		
		Floor floor = new Floor(17.5,8.4);
		Carpet carpet = new Carpet(0.5);
		Calculator cal  = new Calculator(floor, carpet);
		
		System.out.println("Total cost is " + cal.getTotalCost() + " USD");
		
	}
}
