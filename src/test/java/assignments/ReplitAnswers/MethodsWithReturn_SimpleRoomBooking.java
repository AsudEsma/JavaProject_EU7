package assignments.ReplitAnswers;

import java.util.Scanner;

public class MethodsWithReturn_SimpleRoomBooking {

	public static boolean simpleRoomBook(boolean isAvailable,int month, int day, int year){
		
		if(month==7 && day>=1 && day<=8) {
			return false;
		} else if (year!=2018) {
			return false;
		} else if (isAvailable!=true) {
			return false;
		} else {
			return true;
		}
		   


		  
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println(simpleRoomBook(in.nextBoolean(), in.nextInt(), in.nextInt(), in.nextInt()));
		in.close();    
		}
	}
