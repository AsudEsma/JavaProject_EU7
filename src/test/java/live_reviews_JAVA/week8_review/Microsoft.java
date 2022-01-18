package live_reviews_JAVA.week8_review;

public class Microsoft {

	public static void main(String[] args) {

//		Employee e1 = new Employee("Asude", "SDET", 10297, 250_000.00);

		int[] num = {1,2,3};
		
		// My data type will be Employee Class, dataType is Employee
		Employee[] testers = {
			
				new Employee("Eyup","SDET",10,100000),
				new Employee("Vasalica","ScrumMaster",5,120000),
				new Employee("Selena","QA Engineer",7,85000),
				new Employee("Merve","Senior-SDET",8,150000) 
		};

		double minSalary = Double.MAX_VALUE;
		double maxSalary = Double.MIN_VALUE;
		
		String maxName = "";
		String minName = "";
		
		for(Employee each : testers) {
			if(each.getSalary()>maxSalary) {
				maxSalary = each.getSalary();
				maxName = each.getName();
			}
			
			if(each.getSalary()<minSalary) {
				minSalary = each.getSalary();
				minName = each.getName();
			}
		}
		
		System.out.println(minName + " has the min salary with " + minSalary + " USD");
		System.out.println(maxName + " has the max salary with " + maxSalary + " USD");
	}

}
