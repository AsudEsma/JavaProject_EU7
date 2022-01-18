package classes.day19_stringClass;

import java.util.Scanner;

public class Task3_EmojiProgram {

	public static void main(String[] args) {

		String emoji = "";
		Scanner in = new Scanner(System.in);
		System.out.print("Please, enter your mood in emoji: ");
		emoji = in.next();
		
		if (emoji.length()!=2) {
			System.out.println("Invalid entry.");
			return; // stop the execution
		} else {
			char first = emoji.charAt(0);
			char last = emoji.charAt(1);
			
			if (':'==first) {
				switch (last) {
				case ')':
					System.out.println("Smile");
					break;
				case '(':
					System.out.println("Sad");
					break;
				case '/':
					System.out.println("Upset");
					break;
				case 'p', 'P':
					System.out.println("Playful");
					break;
				case 'd','D':
					System.out.println("Very happy");
					break;
				default:
					System.out.println("Invalid entry.");
					break;
				}
			} else if (';'==first) {
				switch (last) {
				case ')':
					System.out.println("Wink");
					break;
				case '0':
					System.out.println("Surprised");
					break;
				default:
					System.out.println("Invalid entry.");
					break;
				}
			} else {
				System.out.println("Invalid entry.");
			}
			
		}
		
		in.close();
	}

}
