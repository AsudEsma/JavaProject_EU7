package live_reviews_JAVA.week10_review;

public class AmazonInc {

	public static void main(String[] args) {

		Tester tester = new Tester("Asude Esma Ozdemir", "SDET", 28, 100000, 'F');
		tester.setJobTitle("Quality Engineer");
		tester.setAge(11);
		
		Developer developer = new Developer("Ibrahim", "Front End Developer", 35, 150000, 'M');
		developer.fixBugs();
		developer.setSalary(10000);
		System.out.println(developer.getSalary());
	}

}
