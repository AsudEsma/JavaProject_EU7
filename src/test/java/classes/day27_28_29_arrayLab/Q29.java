package classes.day27_28_29_arrayLab;

import java.util.Arrays;

public class Q29 {

	public static void main(String[] args) {
		
		int[] x = {2,10,3,4,20,5};
		int[] y = {10,1,20,2};
		
		System.out.println(Arrays.toString(tenRun(x)));
		System.out.println(Arrays.toString(tenRun(y)));
	}
	
	public static int[] tenRun(int[] x) {
		
		for(int i=0; i<x.length; i++) {
			
			if(x[i]%10==0) {
				
				for(int j=i+1; j<x.length && x[j]%10!=0; j++) {
					
					x[j]=x[i];
				}
			}
		}
		
		return x;
	}
	
	
	public static int[] tenRun2(int[] x) {
		
		boolean check10 = false;
		
		int mult = 0;
		
		for(int i=0; i<x.length; i++) {
			
			if(check10) {
				
				if(x[i]%10!=0) {
				x[i] = mult*10;
				
				} else {
					
					mult = x[i]/10;
					x[i] = mult*10;
				}
				
			} else if(x[i]%10==0) {
				
				mult = x[i]/10;
				check10 = true;
				
			} else {
				continue;
			}
		}
		
		return x;
	}
}
