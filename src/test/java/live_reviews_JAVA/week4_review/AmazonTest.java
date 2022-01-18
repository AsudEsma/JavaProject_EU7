package live_reviews_JAVA.week4_review;

public class AmazonTest {

	public static void main(String[] args) {

		System.out.println("--Starting Amazon Search Functional Test--");
		openBrowser();
		navigateToAmazonPage();
		//searchForAnItem();
		verifyResultsAreDisplayed();
		System.out.println("--Amazon Search Functional Test completed--PASS");
	
		System.out.println("-------------------------------------------");
		
		System.out.println("--Starting Amazon Search Functional Test with The Loaded Method--");
		openBrowser();
		navigateToAmazonPage();
		searchForAnItem("JAVA");
		verifyResultsAreDisplayed();
		System.out.println("--Amazon Search Functional Test completed--PASS");
	
	}

	public static void openBrowser() {
		System.out.println("Launching Opera GX Browser");
	}
	
	public static void navigateToAmazonPage() {
		System.out.println("Navigating to https://www.amazon.com/");
	}
	
	public static void searchForAnItem() {
		System.out.println("Searching for Wooden Spoon");
	}
	
	public static void verifyResultsAreDisplayed() {
		System.out.println("PASS: Search results are successfully displayed");
	}
	
	public static void searchForAnItem(String item) {
		System.out.println("Searching for " + item);
	}
	
}
