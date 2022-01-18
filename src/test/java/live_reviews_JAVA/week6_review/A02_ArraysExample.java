package live_reviews_JAVA.week6_review;

public class A02_ArraysExample {

	public static void main(String[] args) {

		int[] statusCodes = {200,201,204,400,401,403,404,500};
		System.out.println("The size of this array is: " + statusCodes.length);
		
		String[] responseTypes = {"OK", "Created", "No Content", "Bad Request", "Unauthorized",
				"Forbidden", "No Found", "Internal Server Error"}; 
		
		for(int i=0; i<statusCodes.length; i++) {
			System.out.println(statusCodes[i]+" Status Code: "+responseTypes[i]);
		}
	
		System.out.println("--- FOR EACH LOOP ---");
		int j = 0;
		for(String response : responseTypes) {
			System.out.println(statusCodes[j]+" Status Code: "+response);;
			j++;
		}

	}

}
