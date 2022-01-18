package classes.day08_controlFlowStatements;

public class task8_FindTheGreatestNumbNested {

	public static void main(String[] args) {

		int num1, num2, num3;
		num1 = 12;
		num2 = 12;
		num3 = 12;
		
		if (num1>num2 && num1>num3) {
		} else {
			if (num2>num3) {
				System.out.println("The greatest number is " + num2);
			} else if (num3>num2) {
				System.out.println("The greatest number is " + num3);
			} else {
				System.out.println("The numbers are equal.");
			}

		}
	}
}
