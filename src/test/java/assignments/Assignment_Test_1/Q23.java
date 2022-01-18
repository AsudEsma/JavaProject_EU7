package assignments.Assignment_Test_1;

public class Q23 {

	public static void main(String[] args) {

		int i=5, f=6, d=3, c=1;
		
		if (i!=f) {
			c++;
		}
		
		if ((f+d)==(c+=2)) {
			c--;
		}
		
		System.out.println(c);
	}

}
