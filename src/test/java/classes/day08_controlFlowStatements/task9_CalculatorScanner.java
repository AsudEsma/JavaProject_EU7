package classes.day08_controlFlowStatements;

import java.util.Scanner;

public class task9_CalculatorScanner {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please, enter the number and the operator of your choice.");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		String operator = scan.nextLine();
		scan.nextLine();
		double result = 0.0;
		
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
			System.out.println("Wrong entry.");
			break;
		}
		
		System.out.println("The result is " + result);
		
		scan.close();

	}

}
