package assignments.Assignment_Test_1;

public class Q9_FindTheC {

	public static void main(String[] args) {

		int i, c;
		double d, f;
		
		i=4;
		f=4.3;
		d=1.8;
		c=0;
		
		if (i!=c) {
			c++;
			if ((f+d)==(c+=2)) {
				System.out.println(c);
			}
		}
		System.out.println("c is " + c);

	}

}
