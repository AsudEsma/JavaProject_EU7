package live_reviews_JAVA.week1_review;

public class employeeInfo {

	public static void main(String[] args) {
		
		/*
		 * name
		 * companyName
		 * jobTitle
		 * gender
		 * salary
		 * employeeID
		 * hasBenefits(Y/N)
		 * isMarried
		 */

		String name = "Asude Esma OZDEMIR";
		String companyName = "Riot Games";
		String jobTitle = "Game Developer";
		String gender = "Female";
		int salary = 3_000;
		int employeeID = 154_487_965;
		boolean hasBenefits = true;
		boolean isMarried = false;
		
		System.out.println(name + "\n" + companyName + "\n" + jobTitle + "\n" + gender + "\n" + salary + "\n" + employeeID + "\n" + hasBenefits + "\n" + isMarried);
		System.out.println();
		
		System.out.println("Name:\t\t\t" + name);
		System.out.println("Company Name:\t\t" + companyName);
		System.out.println("Job Title:\t\t" + jobTitle);
		System.out.println("Gender:\t\t\t" + gender);
		System.out.println("Salary:\t\t\t" + salary);
		System.out.println("Employee ID:\t\t" + employeeID);
		System.out.println("Has Benefits:\t\t" + hasBenefits);
		System.out.println("Is Married:\t\t" + isMarried);
		System.out.println();
		
		System.out.println("Name:\t\t\t" + name +
							"\nCompany Name:\t\t" + companyName +
							"\nJob Title:\t\t" + jobTitle +
							"\nGender:\t\t\t" + gender +
							"\nSalary:\t\t\t" + salary +
							"\nEmployee ID:\t\t" + employeeID +
							"\nHas Benefits:\t\t" + hasBenefits +
							"\nIs Married:\t\t" + isMarried);
		
	}

}
