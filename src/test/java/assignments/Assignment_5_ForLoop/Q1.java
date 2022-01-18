package assignments.Assignment_5_ForLoop;

public class Q1 {
	
	public static void main(String[] args) {
		
		for (int i=0; i<=1000; i+=10) {
			if (i<1000) {
				System.out.print(i + ",");
			} else {
				System.out.print(i); 
			}
		}
	}

}
