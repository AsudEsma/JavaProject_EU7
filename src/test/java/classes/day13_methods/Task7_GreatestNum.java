package classes.day13_methods;

public class Task7_GreatestNum {

	public static void main(String[] args) {

		GreaterNum(25,39,47);
		GreaterNum(125,125,125);
		GreaterNum(25,25,31);
		GreaterNum(31,31,2);
		GreaterNum(45,25,87);
		GreaterNum(21,85,85);
		GreaterNum(126,358,325);
		GreaterNum(125,1425,1247);
	}
	
	public static void GreaterNum (int num1, int num2, int num3) {
		
		if (num1>num2 && num1>num3) {
			System.out.print("The greater number is ");
			System.out.println(num1);
		} else if (num2>num1 && num2>num3) {
			System.out.print("The greater number is ");
			System.out.println(num2);
		} else if (num3>num2 && num3>num1) {
			System.out.print("The greater number is ");
			System.out.println(num3);
		} else if (num1==num2 && num1>num3) {
			System.out.print("The greaters number is ");
			System.out.println(num1);
		} else if (num1==num3 && num1>num2) {
			System.out.print("The greaters number is ");
			System.out.println(num1);
		} else if (num2==num3 && num2>num1) {
			System.out.print("The greaters number is ");
			System.out.println(num2);
		} else {
			System.out.println("All numbers are equal.");
		}
	}

}
