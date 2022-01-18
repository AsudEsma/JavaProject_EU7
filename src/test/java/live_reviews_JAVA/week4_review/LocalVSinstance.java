package live_reviews_JAVA.week4_review;

public class LocalVSinstance {
	
	int a;  // instance variable
	
	public void showDifference() {
		int a = 5;  // local variable
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		LocalVSinstance obj = new LocalVSinstance();
		System.out.println("----local variable----");
		obj.showDifference();
		
		System.out.println("----instance variable----");
		System.out.println(obj.a);
		obj.a=10;
		System.out.println(obj.a);
	}

}
