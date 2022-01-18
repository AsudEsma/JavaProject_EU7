package live_reviews_JAVA.week3_review;

public class Continue_Break_Examples {

	public static void main(String[] args) {

		for(int i=0; i<10; i++) {
			
			if(i==3||i==7) {
				continue;
			}
			if(i==8) {
				break;
			}
			
			System.out.print(i + " ");
		}
		
		System.out.println();
		System.out.println("------------------------");

		outer: for (int i=0; i<4; i++) {
			if(i==2) {
				continue;
			}
			inner: for (int j=0; j<4; j++) {
				if(j==2) {
					continue outer;
				}
				if(i==4) {
					break outer;
				}
				
				System.out.println("i: " + i + " j: " + j);
			}
		}
	}

}
