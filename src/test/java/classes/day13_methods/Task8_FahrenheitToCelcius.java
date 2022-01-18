package classes.day13_methods;

public class Task8_FahrenheitToCelcius {

	public static void main(String[] args) {

		FDegree(15);

	}
	
	public static void FDegree(double F) {
		
		double C;
		C = (F - 32) / 1.8;
		
		System.out.println(F + " F = " + C + " C");
	}

}
