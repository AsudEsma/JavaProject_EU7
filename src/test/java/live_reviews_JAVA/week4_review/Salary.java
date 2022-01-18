package live_reviews_JAVA.week4_review;

public class Salary {
	
	double rate, taxRate;
	int weeklyHour;
	
	public void setInfo(double r, int h, double t) {
		rate = r;
		weeklyHour = h;
		taxRate = t;
	}
	
	public double salary() {  // instance methods
		return rate*weeklyHour*52;
	}
	
	public double totalTax() {  // instance methods
		return salary()*taxRate;
	}
	
	public double salaryAfterTax() {  // instance methods
		return salary()-totalTax();
	}

	public String toString() {  // instance methods
		return "Salary [rate=" + rate + ", taxRate=" + taxRate + ", weeklyHour=" + weeklyHour + ", salary()=" + salary()
				+ ", totalTax()=" + totalTax() + ", salaryAfterTax()=" + salaryAfterTax();
	}
	


}
