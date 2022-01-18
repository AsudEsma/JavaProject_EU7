package classes.day06_logicalOperators;

public class LogicalOperators {

	public static void main(String[] args) {

		char c1 = 'A';
		char c2 = 65;
		int i1 = 5;
		int i2 = 10;
		
		boolean res1 = (i1==i2) && (c1==c2);  // F && --- = F (and)
		System.out.println("res1: " + res1);
		
		boolean res2 = (i1==i2) & (c1==c2);  // F & F = F (and)
		System.out.println("res2: " + res2);
		
		boolean res3 = (c1==c2) | (i1==i2);  // T || --- = T (or)
		System.out.println("res3: " + res3);
		
		boolean res4 = (c1==c2) | (i1==i2);  // T | F = T (or)
		System.out.println("res4: " + res4);
		
		boolean res5 = (c1==c2) ^ (i1==i2);  // T ^ F = T (Caret Sign)
		System.out.println("res5: " + res5);

		boolean res6 = (c1==c2) ^ (i1!=i2);  // T ^ T = F (Caret Sign)
		System.out.println("res6: " + res6);
	}

}
