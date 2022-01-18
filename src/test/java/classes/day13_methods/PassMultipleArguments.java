package classes.day13_methods;

public class PassMultipleArguments {

	public static void main(String[] args) {

	showSum(5,12.7);
	showSum(75,26.5);
	showSum(88,-63.4);
	showSum(14,78.4);
	showSum(125,78.6);

	}
	
	public static void showSum(int num1, double num2) {
		
		System.out.println(num1+num2);
	}

}
