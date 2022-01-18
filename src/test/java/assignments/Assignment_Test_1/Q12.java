package assignments.Assignment_Test_1;

public class Q12 {

	public static void main(String[] args) {

		int i=0, j=0;
		boolean t=true,r;
		
		r = (t && 0<(i+=1));
		r = (t && 0<(i+=2));
		r = (t || 0<(i+=1));
		r = (t || 0<(i+=2));
		
		System.out.println(i + " " + j);

	}

}
