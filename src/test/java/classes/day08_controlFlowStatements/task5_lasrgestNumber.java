package classes.day08_controlFlowStatements;

public class task5_lasrgestNumber {

	public static void main(String[] args) {

		int num1, num2, num3;
		num1 = 158;
		num2 = 1258;
		num3 = 1478;
		
		if (num1>num2 && num1>num3) {
			System.out.println("The biggest number is " + num1 + ".");
		} else if (num2>num1 && num2>num3) {
			System.out.println("The biggest number is " + num2 + ".");
		} else if (num3>num1 && num3>num2){
			System.out.println("The biggest number is " + num3 + ".");
		} else {
			System.out.println("The numbers are equal.");
		}

	}

}
