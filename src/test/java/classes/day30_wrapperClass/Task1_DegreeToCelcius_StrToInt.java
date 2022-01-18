package classes.day30_wrapperClass;

public class Task1_DegreeToCelcius_StrToInt {

	public static void main(String[] args) {
	
		String str1 = "Today weather is sunny and 72 degrees. It is a perfect day to practice java.";
		degreeFahToCelc(str1); 
	}
	
	public static void degreeFahToCelc (String str) {
		
		String[] arr = str.split("and ");
		arr = arr[1].split(" degree");
		
		String degree = arr[0];
		
		double degreeF = Double.parseDouble(degree);
		double celc = (degreeF - 32) * 5/9;
		
		System.out.println(degreeF + " degree is equal to " + Math.round(celc) + " celcius.");
	}
	
}
