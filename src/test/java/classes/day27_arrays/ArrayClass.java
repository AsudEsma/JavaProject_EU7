package classes.day27_arrays;

import java.util.Arrays;

public class ArrayClass {

	public static void main(String[] args) {

		// toString()
		
		int[] numbs = {43,12,4,1,3,5};
		System.out.println(Arrays.toString(numbs));

		// equals()
		
		int[] nums1 = {4,5,6,10,100};
		int[] nums2 = {4,5,6,10,100};
		System.out.println(Arrays.equals(nums1, nums2));
		
		// sort() : sorts array in ascending order
		
		Arrays.sort(numbs);
		System.out.println(Arrays.toString(numbs));
		
		String[] languages = {"Zulu","Spanish","Italian","English","Polish","Arabic"};
		Arrays.sort(languages);
		System.out.println(Arrays.toString(languages));
		
		String[] languages2 = {"#Zulu","@Spanish","$"," ","Italian","English","1Polish","arabic"};
		Arrays.sort(languages2);
		System.out.println(Arrays.toString(languages2));
		
		// binarySearch() : searches for the thing you want and gives you the index num
		
		int[] numX = {4,6,7,10,55};
		System.out.println(Arrays.binarySearch(numX, 7)); //2
		System.out.println(Arrays.binarySearch(numX, 55)); //4
		System.out.println(Arrays.binarySearch(numX, 5)); // -2 : (-(insertionPoint)-1)
		System.out.println(Arrays.binarySearch(numX, 11)); // -5 : (-(insertionPoint)-1)
		
		// copyOf()
		
		double[] d1 = {2.3,4.5,12.4};
		double[] d2 = d1;
		
		System.out.println(d1); // the address is the same. it does not copy it.
		System.out.println(d2); // if you change anything. This will change, too.
		
		double[] d3 = Arrays.copyOf(d2, d2.length);
		System.out.println(d3); // the reference no is different.
		
		
		
	}

}
