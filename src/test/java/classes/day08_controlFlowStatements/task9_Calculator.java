package classes.day08_controlFlowStatements;

public class task9_Calculator {

	public static void main(String[] args) {
	
		int num1 = 65;
		int num2 = 45;
		String operator = "%";
		double result = 0;
		
		switch (operator) {
		
		case "+":
			result = num1+num2;
			break;
		case "-":
			result = num1-num2;
			break;
		case "*":
			result = num1*num2;
			break;
		case "/":
			result = num1/num2;
			break;
		case "%":
			result = num1%num2;
			break;
		default:
			System.out.println("Invalid Operator.");
			break;
		}
	
		System.out.println("The result is " + result);

	}

}
