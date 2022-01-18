package classes.day06_logicalOperators;

public class task4_logicalOperators {

	public static void main(String[] args) {

		boolean x = true, z = true;
		int y = 20;
		x = (y!=10) || (z=false);  // T || --- => z is still true, did not change.
		
		System.out.println(x);  // true
		System.out.println(z);  // true
		
		boolean a = true, b = true;
		int c = 20;
		a = (c!=10) && (b=false);  // T && F => z is still assigned to 'FALSE'
		
		System.out.println(a);  // false
		System.out.println(b);  // false
	}

}
