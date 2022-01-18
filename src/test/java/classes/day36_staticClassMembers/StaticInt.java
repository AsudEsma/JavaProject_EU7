package classes.day36_staticClassMembers;

public class StaticInt {

	static final int NUM_SECOND_PER_HOUR; // You can assign the FINAL variable with STATIC BLOCK
	
	static {
		System.out.println("Static init");
		int numSecondPerMin = 60;
		int numMinPerHour = 60;
		NUM_SECOND_PER_HOUR = numMinPerHour*numSecondPerMin;
	}
	
	private static int one;
	private static final int two;
	private static final int three = 3;
//	private static final int four;		// You need to assign a value for the FINAL variable
	
	static {
		one = 1;
		two = 2;
//		three = 4;						// You cannot reassign a value to a FINAL variable
//		two = 4;						// You cannot reassign a value to a FINAL variable
	}
}
