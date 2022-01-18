package assignmentLabs.Lab_1;

public class Q5 {

public static void main(String[] args) {
		
		caughtSpeeding(60, false);
		caughtSpeeding(65, false);
		caughtSpeeding(65, true);
	}
	public static void caughtSpeeding(int s, boolean b) {
		
		if ((s<=60 && b==false)||(s<=65 && b==true)) {
			System.out.println("0");
		} else if (((s>=60 && s<80) &&  b==false)||((s>=65 && s<85) &&  b==true)) {
			System.out.println("1");
		} else if ((s>80 && b==false)||(s>85 && b==true)) {
			System.out.println("2");
		} 
		
		
	}
		
}
