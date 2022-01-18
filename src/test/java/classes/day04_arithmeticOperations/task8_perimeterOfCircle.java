package classes.day04_arithmeticOperations;

public class task8_perimeterOfCircle {

	public static void main(String[] args) {
		
		//Calculation of the perimetre of a circle
		
		double perimetre, radius, area;
		
		final double PI= 3.14;
		radius= 5.5;
		perimetre= 2 * radius * PI;
		area= radius * radius * PI;
		
		System.out.println("Area of the circle is " + area + ".");
		System.out.println("Perimetre of the circle is " + perimetre + ".");

	}

}
