package assignmentLabs.Lab_1_Methods;

public class Q1 {

	public static void main(String[] args) {

		stringTimes("Hi",2);
		stringTimes("Hi",3);
		stringTimes("Hi",1);

	}

	public static void stringTimes(String hi, int num) {

		String str = "";
		for (int i=1; i<=num; i++) {
			str = str + hi;			
		}

		System.out.println(str);
		
	}

}
