package live_reviews_JAVA.week4_review;

public class AmazonTest_2 {

	public static void main(String[] args) {

		System.out.println("--Starting Amazon Search Functional Test--");
		AmazonTest.openBrowser();
		AmazonTest.navigateToAmazonPage();
		AmazonTest.searchForAnItem("Selenium");
		AmazonTest.verifyResultsAreDisplayed();
		System.out.println("--Amazon Search Functional Test completed--PASS");
	

	}
	
	

}
