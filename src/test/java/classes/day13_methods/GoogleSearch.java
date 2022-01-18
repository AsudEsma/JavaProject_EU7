package classes.day13_methods;

public class GoogleSearch {

	public static void main(String[] args) {

	for(int i=0; i<100; i++) {
		navigateGoogle();
		searchForShoes();
		printResult();
		
		}

	}
	
	public static void navigateGoogle() {
		System.out.println("launch Opera GX browser");
		System.out.println("navigate to google.com");
	}
	
	public static void searchForShoes() {
		System.out.println("type shoes into search field");
		System.out.println("click on search button");
	}
	
	public static void printResult() {
		System.out.println("result for shoes ....");
	}

}
