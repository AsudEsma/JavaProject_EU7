package classes.day15_methods;

public class Task1_LastDigit {

	public static void main(String[] args) {

		System.out.println(lastDigit(121,321));
		System.out.println(lastDigit(7,17));
		System.out.println(lastDigit(6,17));
		System.out.println(lastDigit(3,113));
		
		System.out.println("******");
		
		System.out.println(lastDigitOzzysWay(121,321));
		System.out.println(lastDigitOzzysWay(7,17));
		System.out.println(lastDigitOzzysWay(6,17));
		System.out.println(lastDigitOzzysWay(3,113));
	}

	public static boolean lastDigit(int num1, int num2) {

		boolean lastDigit=(num1%10==num2%10);
		
		return lastDigit;
	}

	public static boolean lastDigitOzzysWay(int num1, int num2) {
	
		if(num1%10==num2%10) {
			return true;
		} else {
			return false;
		}
	}
}
