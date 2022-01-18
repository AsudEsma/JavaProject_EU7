package live_reviews_JAVA.week7_review;

import java.util.Arrays;

public class R02_charArray2 {

	public static void main(String[] args) {
		
		int[] alphabet = new int[26];
		
/*		97 is the value of 'a' in ASCII Table
		alphabet['a'-97] = alphabet['a'-97]+1;
		alphabet['l'-97] = alphabet['l'-97]+1;
		alphabet['i'-97] = alphabet['i'-97]+1;
		alphabet['s'-97] = alphabet['s'-97]+1;
		alphabet['t'-97] = alphabet['t'-97]+1;
		alphabet['e'-97] = alphabet['e'-97]+1;
		alphabet['n'-97] = alphabet['n'-97]+1;
		
		System.out.println(Arrays.toString(alphabet));	*/
		
		String word = "listen";
		for(char each : word.toCharArray()) {
			alphabet[each-97] = alphabet[each-97]+1;
		}
		
		System.out.println(Arrays.toString(alphabet));
		
		String word2 = "silent";
		for(char each : word2.toCharArray()) {
			alphabet[each-97] = alphabet[each-97]-1;
		}
		
		System.out.println(Arrays.toString(alphabet));
		
		int[] check = new int[26];
		System.out.println(Arrays.equals(alphabet, check));
		
		boolean isAnagram = false;
		for(int i=0; i<alphabet.length; i++) {
			if(alphabet[i]==0) {
				isAnagram = true;
			} else {
				isAnagram = true;
			}
		}
		System.out.println(isAnagram);
		
		
		
	}
}
