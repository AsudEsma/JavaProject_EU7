package assignmentLabs.Lab_1_Methods;

public class Q4 {

	public static void main(String[] args) {

		deerPlay(70,false);
		deerPlay(95,false);
		deerPlay(95,true);

	}

	public static void deerPlay(int temp, boolean isSummer) {

		if (isSummer==true) {
			if (temp>60 && temp<100) {
				System.out.println(true);
			} else {
				System.out.println(false);
			}
		} else if (isSummer==false) {
			if (temp>60 && temp<90) {
				System.out.println(true);
			} else {
				System.out.println(false);
			}
		} else {
			System.out.println(false);
		}
		
	}

}
