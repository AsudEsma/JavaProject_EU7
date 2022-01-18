package classes.day30_wrapperClass;

public class Task2_WelcomeToCoreJava {
	
	public static void main(String[] args) {
		
		String str = "(((W&e**_lco73me %t%o co!@$,,<r>e <J>>>$@av```~a777.||}{";
		
		System.out.println(filterString(str));
	}

	public static String filterString(String s) {
		String filter = "";
		for(int i=0; i<s.length(); i++) {
			if(Character.isAlphabetic(s.charAt(i)) || s.charAt(i) == ' ') {
				filter += "" + s.charAt(i);
			}
		}
		
		return filter;
	}

}
