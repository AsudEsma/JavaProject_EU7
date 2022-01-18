package assignments.ReplitAnswers;

import java.util.Scanner;

public class PicturePrinter {

	  public static void main(String[] args) {
		   
		   System.out.println("select image:\n1)sunset\n2)earth\n3)desert");
		   
		   Scanner scan = new Scanner(System.in);
		   int selection = scan.nextInt();
		   
		   if (selection==1) {
			   printSunset();
		   } else if (selection==2) {
			   printEarth();
		   } else {
			   printDesert();
		   }
		   scan.close();
		  }
		  
		  public static void printSunset()
		  {
		       System.out.print("_\\/_                 |                _\\/_\r\n" + 
			     		"/o\\\\             \\       /            //o\\\r\n" + 
			     		" |                 .---.                |\r\n" + 
			     		"_|____     --  /     \\  --     ___|_\r\n" + 
			     		"1       `~^~^~^~^~^~^~^~^~^~^~^~`\r\n" );
		  }//end print_sunset
		  
		   public static void printEarth()
		  {
		    
		       System.out.print("22        ___\r\n" + 
			     		"    ,-:` \\;',`'-, \r\n" + 
			     		"  .'-;_,;  ':-;_,'.\r\n" + 
			     		" /;   '/    ,  _`.-\\\r\n" + 
			     		"| '`. (`     /` ` \\`|\r\n" + 
			     		"|:.  `\\`-.   \\_   / |\r\n" + 
			     		"|     (   `,  .`\\ ;'|\r\n" + 
			     		" \\     | .'     `-'/\r\n" + 
			     		"  `.   ;/        .'\r\n" + 
			     		"jgs `'-.___.");
		    
		  }//print_earth
		  
		   public static void printDesert()
		  {
		   
		     System.out.print(" 33   .    _    +     .  ___   .          .\r\n" + 
			     		" (      /|\\      .    |      \\      .   +\r\n" + 
			     		"     . |||||     _    | |   | | ||         .\r\n" + 
			     		".      |||||    | |  _| | | | |_||    .\r\n" + 
			     		"   /\\  ||||| .  | | |   | |      |       .\r\n" + 
			     		"_||||_|||||__| |_|_______\\_____\r\n" + 
			     		". |||| |||||  /\\   ___      ___  .   .\r\n" + 
			     		"  |||| ||||| ||||   .   .  .         ____\r\n" + 
			     		" . \\|`-'|||| ||||    _____       .    .\r\n" + 
			     		"    \\_ |||| ||||      .          .     .\r\n" + 
			     		" _    ||||`-'|||  .       .    _____\r\n" + 
			     		".    . |||| __/  ______             .\r\n" + 
			     		"   . _ ||||| . _               .   _____\r\n" + 
			     		"_   __|||||_  _ \\\\--//    .          _\r\n" + 
			     		"     _ `---'    .)=\\oo|=(.   _   .   .    .\r\n" + 
			     		"_  ^      .  -    . \\.|");
		    
		  }//end
		  
		  
		}
