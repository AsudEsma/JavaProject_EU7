package classes.day30_wrapperClass;

public class VarArgs {

	public static void main(String[] args) {
		
		sum(2,4);
		sum(2,3,5,6);
		sum(3,10,55);
		sum(25,3,6,8,10);
		concat("Apple","Orange","123","Result");
	}
	
	public static void sum(int... numbers) {
		int sum = 0;
		for(int value : numbers) {
			sum += value;
		}
		
		System.out.println(sum);
	}
	
	public static void concat(String... strs) {
		String newStr = "";
		for(String each : strs) {
			newStr += ""+each.charAt(2);
		}
		
		System.out.println(newStr);
	}
}
