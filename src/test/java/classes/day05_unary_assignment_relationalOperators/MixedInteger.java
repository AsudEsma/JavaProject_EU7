package classes.day05_unary_assignment_relationalOperators;

public class MixedInteger {

	public static void main(String[] args) {

		int i1 = 5;
		int i2 = 10;
		float f1 = 15.5f;
		double d1 = 20.5;
		
		int rest1 = i1 + i2;
		float rest2 = i1 + f1;
		double rest3 = i2 + d1;
		
		short firstNumber = 10;
		short secondNumber = 20;
		
		int thirdNumber = firstNumber + secondNumber;
		short thirdNumber2 = (short) (firstNumber + secondNumber);  //Casting is required
		
		byte b1=20;
		byte b2=2;
		
		byte b3 = (byte) (b1*b2);  //Casting is required
		short b4 = (short) (b1*b2);  //Casting is required
		int b5 = b1*b2;
		
		System.out.println(b3);
		System.out.println(b4);
		System.out.println(b5);
		
		int x1=20;
		int x2=45;
		
		byte res = (byte) (x1+x2);  //Casting is required
		short res2 = (short) (x1+x2);  //Casting is required
		int res3 = x1+x2;
		
		byte res4 = 20 + 45;  //Casting is not required. Because you use a valid value and it is in the range.
		
		System.out.println(res);
		System.out.println(res2);
		System.out.println(res3);
		
		

	}

}
