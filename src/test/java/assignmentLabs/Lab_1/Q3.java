package assignmentLabs.Lab_1;

public class Q3 {

public static void main(String[] args) {
		
		
		specialEleven(22);
		specialEleven(23);
		specialEleven(24);

	}
	
	public static void specialEleven(int x) {
		
		if (x%11==0 || x%11==1) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
	}

}
