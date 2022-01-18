package live_reviews_JAVA.week4_review;

public class Calculator {

	public static void main(String[] args) {

		double a = 5.5;
		double b = 3.3;
		double result1;
		
		result1 = add(a,b);
		System.out.println(result1);
		System.out.println("---------");
		System.out.println(add(a,b));
		
		System.out.println(substract(result1, b));
		
		add(125, 254);
		substract(12, 54);
		division(157, 47);
		multiply(14, 89);

	}
	
	public static double add(double num1, double num2) {
		double result = num1 + num2;
		return result;
	}
	
	public static double substract(double num1, double num2) {
		double result = num1 + num2;
		return result;
	}
	
	public static double division(double num1, double num2) {
		double result = num1 + num2;
		return result;
	
	}

	public static double multiply(double num1, double num2) {
		double result = num1 + num2;
		return result;
	}
}
