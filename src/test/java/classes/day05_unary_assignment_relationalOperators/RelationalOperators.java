package classes.day05_unary_assignment_relationalOperators;

public class RelationalOperators {

	public static void main(String[] args) {
		/* > : Greater than
		 * >= :Greater than or equal
		 * < : Less than
		 * <= : Less than or equal
		 * == : Equal
		 * != : Not equal
		 */

		byte b1 = 1;
		byte b2= 2;
		double d1 = 3.5;
		int i1 = 17;
		float f1 = (float) 67.0;
		
		boolean test1 = b1<b2;
		System.out.println(test1);  // true
		
		boolean test2 = b1>b2;
		System.out.println(test2);  // false
		
		boolean test3 = (d1==b1);
		System.out.println(test3);  // false
				
		boolean test4 = (f1!=d1);
		System.out.println(test4);  // true
		
		boolean test5 = (i1*d1)>=(f1-42);  // true
		System.out.println(test5);
		
		System.out.println((6*3)!=(4*8));  // true
		
		System.out.println('a'<'b');  // true because of unicode numbers
		
		
	}

}
