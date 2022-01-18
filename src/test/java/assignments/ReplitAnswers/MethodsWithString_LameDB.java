package assignments.ReplitAnswers;

import java.util.Scanner;

public class MethodsWithString_LameDB {
	
	public static String lameDb(String db, String op, String id, String data) {
		
		String word1 = db.substring(1,db.indexOf("#2"));
		String word2 = db.substring(db.indexOf("#2")+2,db.indexOf("#3"));
		String word3 = db.substring(db.indexOf("#3")+2);
		String combo = "";
		
		if(op.equalsIgnoreCase("add")) {
			if(id.equals("1")) {
				combo+="1"+data+"#2"+word1+"#3"+word2+"#4"+word3;
			} else if(id.equals("2")) {
				combo+="1"+word1+"#2"+data+"#3"+word2+"#4"+word3;
			} else if(id.equals("3")) {
				combo+="1"+word1+"#2"+word2+"#3"+data+"#4"+word3;
			} else if(id.equals("4")) {
				combo+="1"+word1+"#2"+word2+"#3"+word3+"#4"+data;
			}
		} else if(op.equalsIgnoreCase("edit")) {
			if(id.equals("1")) {
				combo+="1"+data+"#2"+word2+"#3"+word3;
			} else if(id.equals("2")) {
				combo+="1"+word1+"#2"+data+"#3"+word3;
			} else if(id.equals("3")) {
				combo+="1"+word1+"#2"+word2+"#3"+data;
			}
		} else if(op.equalsIgnoreCase("delete")) {
			if(id.equals("1")) {
				combo+="2"+word2+"#3"+word3;
			} else if(id.equals("2")) {
				combo+="1"+word1+"#3"+word3;
			} else if(id.equals("3")) {
				combo+="1"+word1+"#2"+word2;
			}
		}

	    return combo;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println(lameDb(in.next(), in.next(), in.next(), in.next()));
	    in.close();
	}
}
