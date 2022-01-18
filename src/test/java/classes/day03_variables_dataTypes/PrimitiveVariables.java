package classes.day03_variables_dataTypes;

public class PrimitiveVariables {

	public static void main(String[] args) {
		
		byte b1 = 25;
		byte b2= -25;
		byte b3= 55;
		
		System.out.println("b1 = " + b1);
		System.out.println("b2 = " + b2);
		System.out.println("b3 = " + b3);
		
		short s1 = -32768;
		short s2 = 3276;
		short s3 = 500;
		
		System.out.println("s1 = " + s1);
		System.out.println("s2 = " + s2);
		System.out.println("s3 = " + s3);

		int i1 = -214768;
		int i2 = 20;
		int i3 = 100_000;
		int i4 = 100000;
		
		System.out.println("i1 = " + i1);
		System.out.println("i2 = " + i2);
		System.out.println("i3 = " + i3);
		System.out.println("i4 = " + i4);
		
		long l1 = 5000; //Suffix L is optional. Literal 5000 is of int type
		long l2 = -2147483649L; //Suffix L is mandatory. This number is out of int range
		
		long creditCardNumber = 5876_1234_3453_9832L;
		
		System.out.println("l1 = " + l1);
		System.out.println("l2 = " + l2);
		System.out.println("creditCardNumber = " + creditCardNumber);
		
		//Floating Numbers : default is double
		
		float f1 = 2.1f;
		
		double d1 = 3.14465456465448;
		
		System.out.println("f1 = " + f1);
		System.out.println("d1 = " + d1);
		
		char c1 = 'A';
		char c2 = 65; 		//Decimal value corresponding to character 'A'
		char c3 = '\u0041'; //We took this info from https://unicode-table.com/en/
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		boolean status1 = true;
		boolean status2 = false;
		
		System.out.println("Eligible to take the exam: " + status1);
		System.out.println("He is 16, can he take drive licence? " + status2);
		
		String name = "Asude";
		System.out.println("My name is " + name);
		
		
		
	}

}
