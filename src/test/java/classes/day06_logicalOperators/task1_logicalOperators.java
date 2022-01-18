package classes.day06_logicalOperators;

public class task1_logicalOperators {

	public static void main(String[] args) {

		int ApplesCount = 20;
		int OrangesCount = 30;
		int PearsCount = 30;
		
		boolean comp = ApplesCount < OrangesCount || OrangesCount >= PearsCount;
		
		// 20<30 || 30>=30  =>  T || --- = T
		
		System.out.println(comp);
	}

}
