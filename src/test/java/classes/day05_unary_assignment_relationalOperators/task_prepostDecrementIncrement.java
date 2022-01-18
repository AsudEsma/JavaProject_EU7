package classes.day05_unary_assignment_relationalOperators;

public class task_prepostDecrementIncrement {

	public static void main(String[] args) {

		int x = 2;
		int y = x++;
		
		System.out.println(x);
		System.out.println(y);  //Next line it will be '3'
		System.out.println();
		
		y=x;
		
		System.out.println(y);  //Now because we assinged it as y=x; it gives us the answer '3' directly.
		System.out.println();
		
		int z = 2;
		int w = ++z;
		
		System.out.println(z);
		System.out.println(w);
		System.out.println();

		int a = 50;
		int result= --a + a++ + a-- + a++;  //a= 49 + 49 + 50 + 49 = 197
		
		System.out.println("a is " + a);
		System.out.println("result is " + result);
		System.out.println();
		
		int b = 1;
		int Result = -b-- + b++ / -b-- * --b;  // Result = -1 + 0 / -1 * -1 = -1
		
		System.out.println("b is " + b);
		System.out.println("Result is " + Result);
		System.out.println();

		
	}

}
