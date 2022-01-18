package assignmentLabs.Lab_1_Methods;

public class Q5 {

	public static void main(String[] args) {

		caughtSpeeding(60,false);
		caughtSpeeding(65,false);
		caughtSpeeding(65,true);

	}

	public static void caughtSpeeding(int speed, boolean isBirthDay) {

		if (isBirthDay==true) {
			if (speed>=(61+5) && speed<=(80+5)) {
				System.out.println(1);
			} else if (speed>=(81+5)) {
				System.out.println(2);
			} else {
				System.out.println(0);
			}
				
		} else if (isBirthDay==false) {
			if (speed>=61 && speed<=80) {
				System.out.println(1);
			} else if (speed>=81) {
				System.out.println(2);
			} else {
				System.out.println(0);
			}
		}
		
	}

}
