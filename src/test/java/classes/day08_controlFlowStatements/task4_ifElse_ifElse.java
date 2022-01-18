package classes.day08_controlFlowStatements;

public class task4_ifElse_ifElse {

	public static void main(String[] args) {

		int age = 17;
		
		if (age<2||age>18) {
			System.out.println("ineligible");
		} else if (age==2) {
			System.out.println("toddler");
		} else if (age>=3&&age<=5) {
			System.out.println("early childhood");
		} else if (age>5&&age<=7) {
			System.out.println("young reader");
		} else if (age>7&&age<=10) {
			System.out.println("elemnetary");
		} else if (age>10&&age<=12) {
			System.out.println("middle");
		} else if (age==13) {
			System.out.println("impossible");
		} else if (age==14&&age<=16) {
			System.out.println("high school");
		} else {
			System.out.println("scholar");
		}

	}

}
