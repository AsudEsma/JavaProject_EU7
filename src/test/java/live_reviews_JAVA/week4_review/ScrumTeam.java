package live_reviews_JAVA.week4_review;

public class ScrumTeam {
	
	String companyName;
	int developers;
	int testers;
	double developerSalary;
	double testerSalary;
	double companyRevenue;
	
	public double costOfTheTeam() {
		return developers*developerSalary+testers*testerSalary;
	}

	public double returnOfInvestment() {
		return companyRevenue/costOfTheTeam();
	}
	
	public void createCompany (String name, int devNums, int testNums) {
		companyName = name;
		developers = devNums;
		testers = testNums;
	}

	@Override
	public String toString() {
		return "ScrumTeam [companyName=" + companyName + ", developers=" + developers + ", testers=" + testers
				+ ", developerSalary=" + developerSalary + ", testerSalary=" + testerSalary + ", companyRevenue="
				+ companyRevenue + ", costOfTheTeam()=" + costOfTheTeam() + ", returnOfInvestment()="
				+ returnOfInvestment() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
}
