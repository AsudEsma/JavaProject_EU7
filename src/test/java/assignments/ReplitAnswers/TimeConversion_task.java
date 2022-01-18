package assignments.ReplitAnswers;

import java.util.Scanner;

public class TimeConversion_task {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		timeConversion(scan.nextLine());
		scan.close();
		    
	}
		  
	public static void timeConversion(String s) {
		
		s = s.trim();
		int hour = Integer.parseInt(s.substring(0,2));
		String amOrPm = s.substring(s.length()-2);
		
		if(amOrPm.equals("AM")) {
			if(hour==12) {
				System.out.println("00" + s.substring(2,s.length()-2));
			} else {
				System.out.println(s.substring(0,s.length()-2));
			}
		} else {
			if(hour==12) {
				System.out.println(s.substring(0,s.length()-2));
			} else {
				s = (hour+12) + s.substring(2,s.length()-2);
				System.out.println(s);
			}
		}
		
		
	}

}
