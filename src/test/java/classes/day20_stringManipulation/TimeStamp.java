package classes.day20_stringManipulation;

public class TimeStamp {

	public static void main(String[] args) {

		String time = "10/28/2021 21:25:16";
		
		System.out.println(timeStamp(time));

	}
	
	public static String timeStamp(String time) {
		
		time = time.replace("/", "").replace(":", "").replace(" ", "");
		
		return time;

	}

}
