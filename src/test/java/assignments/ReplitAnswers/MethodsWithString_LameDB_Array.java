package assignments.ReplitAnswers;

import java.util.Scanner;

public class MethodsWithString_LameDB_Array {

	public static String lameDb(String db, String op, String id, String data) {

		String sum = "";
		
		Integer idInt = Integer.parseInt(id);
		String[] arr = db.split("#");
		String[] arrAdd = new String[arr.length+1];
		String[] arrDel = new String[arr.length-1];
		
		if(op.equals("add")) {
			sum += addDB(idInt, arrAdd, arr, data);
			
		} else if(op.equals("delete") || op.equals("remove")) {
			sum += deleteDB(idInt, arrDel, arr, data);
			
		} else if (op.equals("edit")) {
			sum += editDB(idInt, arr, data);	
		}
		
		return sum;
		
	}
	
	// ADD METHOD
	
	public static String addDB (int idInt, String[] arrAdd, String[] arr, String data) {
		
		String sum = "";
		
		for(int i=0; i<arrAdd.length; i++) {
			if(idInt-1 > i) {
				arrAdd[i] = arr[i].substring(1); 
			}else if(idInt-1 == i) {
				arrAdd[i] = data;
			} else {
				arrAdd[i] = arr[i-1].substring(1);
			}
		}
		
		for(int i=0; i<arrAdd.length; i++) {
			if(i==0) {
				sum += (i+1) + arrAdd[i];
			} else {
				sum += "#" + (i+1) + arrAdd[i];
			}
		}
		
		return sum;
	}
	
	// EDIT METHOD
	
	public static String editDB (int idInt, String[] arr, String data) {
		String sum = "";
		
		for(int i=0; i<arr.length; i++) {
			if(idInt == i+1) {
				arr[i] = idInt + data;
			} else {
				arr[i] = arr[i];
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			if(i==0) {
				sum += arr[i];
			} else {
				sum += "#" + arr[i];
			}
		}
		return sum;
	}
	
	// DELETE-REMOVE METHOD
	
	public static String deleteDB (int idInt, String[] arrDel, String[] arr, String data) {  // #1wooden#2spoon , remove , 3 , ""
		String sum = "";
		
		for(int i=0; i<arr.length-1; i++) {
			if (idInt-1 == i) {						
				arrDel[i] = arr[i+1];
			} else if(idInt>i) {
				arrDel[i] = arr[i];
			} else {
				arrDel[i] = arr[i+1];
			}
		}
		
		for(int i=0; i<arrDel.length; i++) {
			if(i+1==1) {
				sum += arrDel[i];
			} else {
				sum += "#" + arrDel[i];
			}
		}
		
		return sum;
	}

	public static void main(String[] args) {
	     Scanner in = new Scanner(System.in);
		
		
	     System.out.println(lameDb(in.next(), in.next(), in.next(), in.next()));
	     in.close();
	  }
}