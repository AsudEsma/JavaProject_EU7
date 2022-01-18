package assignments.Assignment_Array;

public class Q4 {

	public static void main(String[] args) {
		
		short [] scores = {51, 85, 32, 0, 98, 157, 82, 101, 64, 249};
		int halfCent = 0;
		int cent = 0;
		int doubCent = 0;
		
		for(int i=0; i<scores.length; i++) {
			if(scores[i]>=50 && scores[i]<100) {
				halfCent++;
			} else if(scores[i]>=100 && scores[i]<200) {
				cent++;
			} else if (scores[i]>200){
				doubCent++;
			}
		}
		
		System.out.println("Half-century: " + halfCent);
		System.out.println("Century: " + cent);
		System.out.println("Double-centry: " + doubCent);
		
	}
}
