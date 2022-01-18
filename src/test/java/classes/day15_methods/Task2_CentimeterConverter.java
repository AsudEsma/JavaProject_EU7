package classes.day15_methods;

public class Task2_CentimeterConverter {

	public static void main(String[] args) {

		calcFeetAndInchesToCentimeters(14,4);
		calcFeetAndInchesToCentimeters(103);
	}

	public static double calcFeetAndInchesToCentimeters(double ft, double inches) {

		if (ft<0 || inches<0 || inches>12) {
			System.out.println("Invalid entry. Please, check the values.");
			return -1;
		}
		
		double centimeter = ft*12*2.54+inches*2.54;
		System.out.println(ft + " feet, " + inches + " inches = " + centimeter + " centimeters");
		return centimeter;
		
	}
	
	public static double calcFeetAndInchesToCentimeters(int inches) {
		
		if (inches<0) {
			return -1;
		}
		
		double ft = (int)inches/12;
		double remainingInc = inches%12;
		
		System.out.println(inches + " inches = " + ft + " feet and " + remainingInc + " inches");
		return calcFeetAndInchesToCentimeters(ft, remainingInc);
	}
}
