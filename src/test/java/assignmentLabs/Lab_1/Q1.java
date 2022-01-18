package assignmentLabs.Lab_1;

public class Q1 {

	public static void main(String[] args) {
			
			stringTimes("Hi", 2);
			stringTimes("Hi", 3);
			stringTimes("Hi", 1);
	}
		
	public static void stringTimes(String hi, int a) {
			
		for (int i=1; i<=a; i++) {
				
			System.out.print(hi);
				
		}
			
		System.out.println();
			
	}

}
