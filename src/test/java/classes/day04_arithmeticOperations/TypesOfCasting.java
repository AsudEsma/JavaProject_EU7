package classes.day04_arithmeticOperations;

public class TypesOfCasting {

	public static void main(String[] args) {

		/*Type Cast Operator
		*1- Implicit Casting
		*2- Explicit Casting*/

		//Implicit Casting

		int x = 'A';
		System.out.println(x); //65

		double d=20;
		System.out.println(d); //20.0

	/*Conclusion:
	*1- Done by compiler
	*2- Smaller data type to bigger data type
	*3- Widening
	*4- No Loss of Data
	*
	*byte - > short - > int - > long - > float - > double*/

	//Explicit Casting

	int y = 130;
	//byte b = y;

	//(x 4 byte b 1 byte-compiler will not do it)

	byte b = (byte)y; 
	System.out.println(b); //-126

	/*Conclusion:
	*1- Done by Programmer
	*2- Bigger Data Type to Smaller Data Type
	*3- Narrowing
	*4- Loss of Data*/

	//byte < - short < - int < - long < - float < - double

	//int y=130;
	//byte b = (byte)y;
	
	/*int(32 bit) = > 00000000 00000000 00000000 10000010 //sadece son 8 haneyi aliyor.
	 * 
	 *byte(8 bit) = > 1 0000010 (first digit is 1 - negative)
	 *
	 *complement form  = > 1111101
	 * 							 1
	 * 					   1111110 = -126
	 */
	
	}

}
