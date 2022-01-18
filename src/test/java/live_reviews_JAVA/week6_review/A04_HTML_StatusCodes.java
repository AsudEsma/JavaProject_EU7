package live_reviews_JAVA.week6_review;

import java.util.Arrays;
import java.util.Scanner;

public class A04_HTML_StatusCodes {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Please, enter the status code that you are getting: ");
		int request = scan.nextInt();
		scan.close();
		
//		System.out.println(responseConverter(request));
		System.out.println(responseConverter2(request));
	
	}
	
	public static String responseConverter(int request) {

        int[] statusCodes = {200,201,204,400,401,403,404,500};
        String[] responseTypes = {"OK","Created","No Content","Bad Request","Unauthorized","Forbidden","Not Found","Internal Server Error"};
        String response = "";
        
        int j = 0;

        for(int code : statusCodes) {

            if(code != request) {
                j++;
            }else {
                break;
            }
        }
        response = responseTypes[j];
        return response;
    }
	
	public static String responseConverter2(int request) {
		
		int[] statusCodes = {200,201,204,400,401,403,404,500};
		String[] responseTypes = {"OK", "Created", "No Content", "Bad Request", "Unauthorized",
				"Forbidden", "Not Found", "Internal Server Error"};
		String response = "Status code not found";
		
		int num = Arrays.binarySearch(statusCodes, request);
		if(num>=0 && num<statusCodes.length){
            return responseTypes[num];
        } else {
            return response;
        }
		
	}
}
