package live_reviews_JAVA.week6_review;

public class A03_ArrayLoopWithConditions {
	
	public static void main(String[] args) {
		
		double[] prices = {22.9, 12.4, 43.12, 65.0, 150.9, 100.87, 90.5, 124.9, 234.56};
		
		for(double eachPrice : prices) {
			System.out.println(eachPrice);
		}
		
		System.out.println("Prices that are over 100");
		for(double eachPrice : prices) {
			if(eachPrice>100) {
			System.out.println(eachPrice);
			}
		}
		
		System.out.println("Prices that are between 40-150");
		for(double eachPrice : prices) {
			if(eachPrice>40 && eachPrice<150) {
			System.out.println(eachPrice);
			}
		}
		
		System.out.println("The count of the prices that are over 60");
		int count = 0;
		for(double eachPrice : prices) {
			if(eachPrice>60) {
			count++;
			}
		}
		
		System.out.println(count);
	}

}
