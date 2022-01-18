package assignments.ReplitAnswers;

import java.util.*;
import java.util.Scanner;

public class nanuk {

	public static boolean nanuk(ArrayList<String> r,int way_stones,int boast) {
	    boolean suceed = false;
	    int nanuk = 0;
	    int hunt = 0;

	    for(int i=0; i<r.size(); i++) {
	    	if(r.get(i).equals("nanuk") ) {
	    		nanuk++;
	    	} else {
	    		hunt += Integer.parseInt(r.get(i));
	    	}
	    }
	    
	    if(nanuk<=way_stones && hunt>boast) {
	    	suceed = true;
	    }

	    return suceed;
	  }
	  
	  // Do not touch below

	  public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    int size = in.nextInt();
	    int stones = in.nextInt();
	    int boast = in.nextInt();
	    ArrayList<String> list = new ArrayList<>();
	    for(int i=0; i < size; i++) {
	      list.add(in.next());
	    }

	    System.out.println(nanuk(list, stones, boast));
	    in.close();

	  }
	  
	  
	  
	  public static boolean nanuk1(ArrayList<String> list, int wayStones, int boast){
	        int points = 0;
	        int nanuks = 0;
	        for (String str : list) {
	            if (str.equalsIgnoreCase("nanuk")){
	                nanuks++;
	                continue;
	            }
	            points += Integer.parseInt(str);
	        }
	        return points >= boast && wayStones >= nanuks ;
	    }
	  
	  
	  
	  public static boolean nanuk2(ArrayList<String> list, int wayStones, int boast){

	        int initialArrayLength = list.size();
	        list.removeIf(color -> color.equalsIgnoreCase("nanuk"));
	        int nanuks = initialArrayLength - list.size();

	        int points = 0;
	        for (String str : list) points += Integer.parseInt(str);

	        return points >= boast && wayStones >= nanuks;
	    }
	  
	  

	    public static boolean nanuk3(ArrayList<String> list, int wayStones, int boast){

	        int i = 0;
	        while (i < list.size()){
	            if (list.get(i).equalsIgnoreCase("nanuk")) {
	                wayStones--;
	                i++;
	                continue;
	            }
	            boast -= Integer.parseInt(list.get(i++));
	        }

	        return wayStones >= 0 && boast <= 0;

	    }
}
