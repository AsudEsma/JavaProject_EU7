package classes.day13_methods;

public class PassArg {

	public static void main(String[] args) {
		
		int x = 10;
		displayValue(15);
		displayValue(x);
		displayValue(x*4);
	}

	public static void displayValue(int num) {
		System.out.println("The value is " + num);
		System.out.println("The value is " + num*2);
		System.out.println();
	}
	public static void displayValue() {
		System.out.println("The value is " + 13);
	}
}
