package classes.day36_staticClassMembers;

public class CalculatorTest {

	public static void main(String[] args) {
		
		double result1 = Calculator.plus(55.3, 7.8);
		System.out.println("Result: " + result1);
		
		Calculator c = new Calculator();
		System.out.println("Result: " + c.plus(55.3, 7.8));
		
		int i = Integer.parseInt("33");
		System.out.println(Character.isDigit('5'));
		
		
		
	}
}
