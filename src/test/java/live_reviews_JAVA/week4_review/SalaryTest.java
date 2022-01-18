package live_reviews_JAVA.week4_review;

public class SalaryTest {

	public static void main(String[] args) {

		Salary asude = new Salary();
		
		asude.setInfo(70, 30, 0.19);
		System.out.println(asude.toString());

		
		Salary hande = new Salary();
		hande.setInfo(100, 35, 0.15);
		System.out.println(hande.toString());
	}

}
