package classes.day05_unary_assignment_relationalOperators;

public class AssignmentOperators {

	public static void main(String[] args) {
		
		/* x=y		x= y
		 * x+=y		x= x + y
		 * x-=y		x= x - y
		 * x*=y		x= x * y
		 * x/=y		x= x / y
		 * x%=y		x= x % y 
		 */

		int i = 100;
		System.out.println(i);  //100
		
		i+=1;
		System.out.println(i);  //101
		
		i-=2;
		System.out.println(i);  //99
		
		i*=3;
		System.out.println(i);  //297
		
		i/=4;
		System.out.println(i);  //74
		
		i%=5;
		System.out.println(i); //4

	}

}
