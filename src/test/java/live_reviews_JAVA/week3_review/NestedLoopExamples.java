package live_reviews_JAVA.week3_review;

public class NestedLoopExamples {

	public static void main(String[] args) {

		int row = 1;
		for ( ; row<=3; row++) {
			for (int column=1; column<=5; column++) {
				
				System.out.print(column+" ");
			}
			
			System.out.println();
		}

		System.out.println("-----------multiplication table-----------");
		for (int i=1; i<=10; i++) {
			for (int j=1; j<=10; j++) {
				System.out.println(i+"x"+j+"="+(i*j));
			}
			System.out.println();;
		}
		
		
	}

}
