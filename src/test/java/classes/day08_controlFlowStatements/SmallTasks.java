package classes.day08_controlFlowStatements;

public class SmallTasks {

	public static void main(String[] args) {

		int x, y;
		x = 99;
		y=35;
		
		if (x > 100) {
			y = 20;
		} else {
		y = 0;
		}
		
		System.out.println("x = " + x + " y = " + y);
				
		if ( y == 100) {
			x = 1;
		} else {
			x = 0;
		}
		
		System.out.println("x = " + x + " y = " + y);
		
		int a, b, c;
		a = 47;
		b = 55;
		c = 102;
		
		if (a < 10) {
			b = 0;
			c = 1;
		} else {
			b = -99;
			c = 0;
		}
		
		System.out.println("a = " + a + " b = " + b + " c = " + c);
	}

}
