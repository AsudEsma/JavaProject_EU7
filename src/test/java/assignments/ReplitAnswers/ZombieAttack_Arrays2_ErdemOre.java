package assignments.ReplitAnswers;

import java.util.*;

public class ZombieAttack_Arrays2_ErdemOre {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    int[] inhabitants = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(),
	    		input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};
	    
	    input.close();
	    
	    int dayCount = 0;

	    while(stillAlive(inhabitants)){  // continue to spread the virus

	      System.out.print("Day " + dayCount + " ");
	      System.out.println(Arrays.toString(inhabitants));   //NEWS: print out the latest situation


	      inhabitants = halfPopulation(inhabitants);   //virus spreading

	      ++dayCount;      

	    }

	    System.out.print("Day " + dayCount + " ");
	    System.out.println(Arrays.toString(inhabitants));   //NEWS: The final situation, nobody left

	    System.out.println("---- EXTINCT ----");

	}
	
	static boolean stillAlive(int[] populations){

	    for(int eachCity : populations){
	      if(eachCity != 0){ //if any of the cities has a population
	        return true;     // that means there are still alive people
	      }
	    }

	    return false;
	  }

	  static int[] halfPopulation(int[] cityPopulations){
	    int[] currentPopulation = cityPopulations.clone(); 
	    // never ever forget again that Object variables are references to the Heap Memory!
	    //you can not directly copy an object to another object
	    // you should loop trough to copy its content or use a method for that!

	    if(cityPopulations[1] == 0){
	     currentPopulation[0] = cityPopulations[0] /2;   // Excluding first and last element from loop so that we can look 1 up and 1 down
	    }

	    for(int i = 1; i < cityPopulations.length -1; i++){
	      if(cityPopulations[i-1] == 0 || cityPopulations[i+1] == 0){   // looking trough neighboring items if they are already 0
	        currentPopulation[i] = (cityPopulations[i]) /2;          
	      }
	    }

	    int length = cityPopulations.length;
	    if(cityPopulations[ length -2] == 0){   // Excluding first and last element from loop so that we can look 1 up and 1 down
	      currentPopulation[length -1] = cityPopulations[length -1] /2;   
	    }

	    cityPopulations = currentPopulation;
	    return cityPopulations;
	  }
}
