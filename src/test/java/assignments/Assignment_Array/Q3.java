package assignments.Assignment_Array;

import java.util.Scanner;

public class Q3 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		char arr [] = new char[] {'A', 'Z', 'B', 'N', 'P', 'T', 'X', 'C'};
		String input = scan.next();
		scan.close();
		
		input = input.toUpperCase();
		boolean isFound=false;

        for(int i=0; i<arr.length; i++) {

            if(input.equals(""+arr[i])) {
            isFound = true;
             break;
         }
        }
        if(isFound) {
            System.out.println(input+ " found!");
        } else {
        	System.out.println(input + " Not found!");
        }
		
	}

}
