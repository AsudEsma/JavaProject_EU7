package assignments.ReplitAnswers;

import java.util.*;

public class ZombieAttack_Arrays2 {

	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    int[] inhabitants = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), 
	    		input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};
		//TODO. Write you code below this line. 
		input.close();
		
	        System.out.println("Day 0 " + Arrays.toString(inhabitants));
	        int length = inhabitants.length;
	        int sum;
	        int day = 0;
	        do{
	            day++;
	            sum = 0;
	            int [] temp = Arrays.copyOf(inhabitants, length);
	            for (int j = 0; j < length; j++) {
	            	
	                if(inhabitants[j]==0 && j != 0 && j != length-1) {
	                	
	                    temp[j-1] =inhabitants[j-1] /2;
	                    temp[j+1] =inhabitants[j+1] /2;
	                    
	                }else if(j == 0 && inhabitants[j]==0) {
	                	
	                    temp[j+1] = inhabitants[j+1] /2;
	                    
	                }else if(j == length-1 && inhabitants[j]==0) {
	                	
	                    temp[j-1] = inhabitants[j-1] /2;
	                }
	            }
	            
	            for(int i = 0; i < length; i++) {
	                inhabitants[i] = temp[i];
	            }
	            
	            for (int city : inhabitants) {
	                sum += city;
	            }
	            
	            System.out.println("Day " + day + " " +Arrays.toString(inhabitants));
	            
	            if (sum == 0) {
	            	
	                System.out.println("---- EXTINCT ----");
	                break;
	            }
	            
	        } while(sum != 0);
	    
	}
}
