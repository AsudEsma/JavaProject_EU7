package live_reviews_JAVA.week7_review;

public class R07_Arrays2DMaxMinValue {

	public static void main(String[] args) {
		
		int [][] arr2D = { {100,200,300}, {40,500}, {-100,250,800}};
		
		int max = Integer.MIN_VALUE; // To prevent any kinds of problem with 0
		int min = Integer.MAX_VALUE; // To prevent any kinds of problem with 0
		
		int mx = arr2D[0][0];
		int mn = arr2D[0][0];
		
		for(int i=0; i<arr2D.length; i++) {
			for(int j=0; j<arr2D[i].length; j++) {
				if(arr2D[i][j]>max) {
					max = arr2D[i][j];
					mx = arr2D[i][j];
				}
				
				if(arr2D[i][j]<min) {
					min = arr2D[i][j];
					mn = arr2D[i][j];
				}
			}
		}
		
		System.out.println("Min is: " + min);
		System.out.println("Max is: " + max);
		System.out.println();
		System.out.println("Mn is: " + mn);
		System.out.println("Mx is: " + mx);
	}
}
