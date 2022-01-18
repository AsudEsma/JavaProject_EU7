package assignmentLabs.Lab_1;

public class Q4 {

public static void main(String[] args) {
		
		deerPlay(70, false); 
		deerPlay(95, false); 
		deerPlay(95, true); 

	}
	public static void deerPlay(int a, boolean isSummer) {
		if ((isSummer==true) && (a>60)&&(a<100)) {
			System.out.println("true");
		}else if ((isSummer==false) && (a>60)&&(a<90)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
}
