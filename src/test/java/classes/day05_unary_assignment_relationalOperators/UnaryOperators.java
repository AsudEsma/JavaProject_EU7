package classes.day05_unary_assignment_relationalOperators;

public class UnaryOperators {

	public static void main(String[] args) {

		int i1= +10;
		int i2 = -100;
		int i3 = -(i1+i2);
		
		System.out.println("i1= " + i1);
		System.out.println("i2= " + i2);
		System.out.println("i3= " + i3);
		System.out.println();
		
		System.out.println("i1= " + i1++);  //i1= 10 -> turns into 11
		System.out.println("i1= " + i1--);  //i1= 11 -> turns into 10
		System.out.println("i1= " + ++i1);  //i1= 10+1 = 11
		System.out.println("i1= " + --i1);  //i1= 11-1 = 10
		System.out.println();
		
		System.out.println("i2= " + i2++);  //i2= -100 -> turns into -99
		System.out.println("i2= " + i2--);  //i2= -99 -> turns into -100
		System.out.println("i2= " + ++i2);  //i2= -100+1 = -99
		System.out.println("i2= " + --i2);  //i2= -99-1 = -100
		System.out.println();
		
		System.out.println("i3= " + i3++);  //i3= 90 -> turns into 91
		System.out.println("i3= " + i3--);  //i3= 91 -> turns into 90
		System.out.println("i3= " + ++i3);  //i3= 90+1 = 91
		System.out.println("i3= " + --i3);  //i3= 91-1 = 90
		System.out.println();
	
		boolean flag =true;
		System.out.println(!flag);
		System.out.println(!!flag);
		System.out.println();
		
		int i=10, j=5;
		i++;  // i = i+1
		--j;  // j = j-1
		System.out.println("i= " + i);
		System.out.println("j= " + j);
		System.out.println();
		
		// i=11 , j=4
		int res = i++ + --j;
		System.out.println("res= " + res);
		System.out.println();
		
		/* res = 11 + 3
		 * i = 11 /But afterwards, turns into 12 in the memory
		 * j = 4-1 = 3 /Directly turns into 3 in the memory
		 */
		
		// i=12 , j=3
		res = i++ * --j;
		System.out.println("res= " + res);
		System.out.println("i= " + i);
		System.out.println("j= " + j);
		System.out.println();
		
		/* res = 12 * 2
		 * i = 12 /But afterwards, turns into 13 in the memory
		 * j = 3-1 = 2 /Directly turns into 2 in the memory
		 */
		
		
	}

}
