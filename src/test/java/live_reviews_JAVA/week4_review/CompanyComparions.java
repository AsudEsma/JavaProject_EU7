package live_reviews_JAVA.week4_review;

public class CompanyComparions {

	public static void main(String[] args) {
		
		ScrumTeam comp1 = new ScrumTeam();
		comp1.companyName = "Apple";
		comp1.developers = 1000;
		comp1.developerSalary = 200_000;
		comp1.testers = 100;
		comp1.testerSalary= 120_000;
		comp1.companyRevenue = 10_000_000_000d;
		
		System.out.println(comp1.companyName+ " Company spent "
				+ comp1.costOfTheTeam()+" dollars on the team this year. And their return of investment is "
				+ comp1.returnOfInvestment());

		ScrumTeam comp2 = new ScrumTeam();
		comp2.createCompany("IBM", 250, 50);
		System.out.println(comp2.companyName);
		
		System.out.println(comp2.toString());
	}
	

}
