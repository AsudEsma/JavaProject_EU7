package classes.day14_methods;

public class Task2 {

	public static void main(String[] args) {

		System.out.println(lastDigit(7,17));
		System.out.println(lastDigit(6,17));
		System.out.println(lastDigit(3,113));

	}

	public static boolean lastDigit(int num1, int num2) {

		boolean isSo=true;
		if (num1%10==num2%10) {
			isSo=true;
		} else {
			isSo=false;
		}
		
		return isSo;
	}
	
	

}
