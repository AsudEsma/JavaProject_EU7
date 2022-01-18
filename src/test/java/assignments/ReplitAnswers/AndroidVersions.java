package assignments.ReplitAnswers;

import java.util.Scanner;

public class AndroidVersions {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
	    double version = input.nextDouble();
	    
	    if (version == 1.0 || version == 1.1) {
	       	System.out.println("No codename");
	    } else if (version == 1.5) {
	    	System.out.println("Cupcake");
	    } else if (version == 1.6) {
	    	System.out.println("Donut");
	    } else if (version == 2.0 || version == 2.1) {
	    	System.out.println("Eclair");
	    } else if (version == 2.2) {
	    	System.out.println("Froyo");
	    } else if (version == 2.3) {
	    	System.out.println("Gingerbread");
	    } else if (version == 3.0 || version == 3.1) {
	    	System.out.println("Honeycomb");
	    } else if (version == 4.0) {
	    	System.out.println("Ice Cream Sandwich");
	    } else if (version == 4.1) {
	    	System.out.println("Jelly Bean");
	    } else if (version == 4.4) {
	    	System.out.println("KitKat");
	    } else if (version == 5.0) {
	    	System.out.println("Lollipop");
	    } else if (version == 6.0) {
	    	System.out.println("Marshmallow");
	    } else if (version == 7.0) {
	    	System.out.println("Nougat");
	    } else if (version == 8.0 || version == 8.1) {
	    	System.out.println("Oreo");
	    } else if (version == 9.0) {
	    	System.out.println("Pie");
	    } else if (version == 10.0) {
	    	System.out.println("Android 10");
	    } else if (version == 11) {
	    	System.out.println("Android 11");
	    } else {
	    	System.out.println("Sorry, I don\'t know this version!");
	    
	    }
	    
	    input.close();
	}

}
